echo "Downloading Layotto project......"
if test -e layotto ; then
  cd layotto && git pull
  git reset --hard HEAD
  cd ..
fi
git clone https://github.com/mosn/layotto.git

echo "Delete existing proto files......"
rm -rf spec/src/main/spec

echo "Copy proto files from Layotto......"
mkdir -p spec/src/main/spec
cp layotto/spec/proto/extension/v1/*/*.proto spec/src/main/spec

mkdir -p spec/src/main/spec/proto/runtime/v1
cp layotto/spec/proto/runtime/v1/*.proto spec/src/main/spec/proto/runtime/v1

echo "Compile the proto files......"
mvn clean compile