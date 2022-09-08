echo "Downloading Layotto project......"
if test -e layotto ; then
  cd layotto && git pull
  cd ..
fi
git clone https://github.com/mosn/layotto.git

echo "Copy proto files from Layotto......"
cp layotto/spec/proto/extension/v1/*/*.proto spec/src/main/proto
cp layotto/spec/proto/runtime/v1/*.proto spec/src/main/proto

echo "Compile the proto files......"
mvn clean compile