preview_path=$(pwd)
password=$REDIS_PASSWORD
url_array=(
'https://img2.doubanio.com/view/subject/l/public/s4196073.jpg'
)
num=${#url_array[@]}

# download layotto
# TODO use a stable version binary instead of compiling locally
if ! test -e layotto; then
  echo "======>Downloading Layotto project"
  cd ..
  git clone https://github.com/mosn/layotto.git
  cd layotto
  layotto_path=$(pwd)
  cd cmd/layotto

  echo "======>Compiling Layotto project"
  go build
  mv layotto ${preview_path}/layotto
  cd ${preview_path}
fi

echo "======>Starting Layotto"
nohup ./layotto start -c config.json &

# Start storage system, e.g. redis
nohup redis-server --port 6380 & >redis.out
echo $! > redis.pid

# TODO initialize data
echo "======>read redis value massage"
massage_array=()
while IFS= read -r line
do
    massage_array+=("$line")
done < $1

if (($num != ${#massage_array[@]})); then
    echo "The number of keys in redis is not equal to the number of values"
    exit
fi

echo "======>Init redis date"
for i in `seq $num`;
do
    redis-cli -h 127.0.0.1 -a "${password}" --no-auth-warning set ${i} ${massage_array[i]}
    echo "key${i} value${i} done"
done

echo "======>Init preview pictrue"
for i in `seq $num`;
do
  curl -o bookimg${i}.jpg ${url_array[${i}]}
  echo "bookimg${i}.jpg done"
done

# compile preview service
echo "======>Compiling preview-service"
if ! test -e target/examples-preview-service-0.0.1-SNAPSHOT.jar; then
  cd ${preview_path}/..
  mvn -B package --file pom.xml
fi

# start preview service
cd ${preview_path}
echo "======>Starting preview-service"
nohup java -jar target/examples-preview-service-0.0.1-SNAPSHOT.jar >preview.out &
echo $! > preview.pid