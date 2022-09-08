preview_path=$(pwd)

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