[中文](./README-zh.md)
## How to use java sdk
### 1. import sdk
For a Maven project, add the following to your `pom.xml` file:
```xml
    <dependency>
        <groupId>io.mosn.layotto</groupId>
        <artifactId>runtime-sdk-parent</artifactId>
        <version>1.0.0</version>
    </dependency>
```

### 2. Run the examples
Clone this repository including the submodules:

```sh
git clone https://github.com/mosn/layotto.git
```

Build and run Layotto:

```bash
# make sure you replace this` ${projectpath}` with your own project path.
cd ${projectpath}/cmd/layotto
go build
./layotto start -c ../../configs/config_redis.json
```

Then head over to build the java-sdk [Maven](https://maven.apache.org/install.html) (Apache Maven version 3.x) project:

```sh
# make sure you replace this` ${projectpath}` with your own project path.
cd ${projectpath}/sdk/java-sdk
mvn clean install
```

Try the following examples to learn more about this SDK:
* [Hello world](./examples-hello/src/main/java/io/mosn/layotto/examples/hello)
* [State management](./examples-state/src/main/java/io/mosn/layotto/examples/state)
* [Pubsub API](./examples/src/main/java/io/mosn/layotto/examples/pubsub)
* [Sequencer API](./examples-sequencer/src/main/java/io/mosn/layotto/examples/sequencer)
* [File API](./examples-file/src/main/java/io/mosn/layotto/examples/file)
* [Oss API](./examples-oss/src/main/java/io/mosn/layotto/examples/oss)

## java sdk developer guide 

![](https://user-images.githubusercontent.com/26001097/148891505-57b734fa-ac8c-4349-9703-16d3f3d7aa9a.png)

### How to format java sdk code
Compile before submit your pull request:

```shell
mvn clean compile
```
It will format your code automatically.

### How to generate a Java PROTO file

#### 1. Copy the proto files to spec/src/main/proto

#### 2. Compile them into corresponding `JAVA` files
```shell
# make sure you replace this `${your PROJECT path}` with your own project path.
cd ${your PROJECT path}
mvn compile
```

[comment]: <> (PS: We recommend that you use the maven plugin `protoc-gen-grpc-java` to generate these protobuf and grpc related java code.)

[comment]: <> (If you are using [IntelliJ IDEA]&#40;https://www.jetbrains.com/help/idea/discover-intellij-idea.html&#41; ,just double click `compile` in the Maven tab and the IDE will generate proto files automatically:)

[comment]: <> (![img.png]&#40;img.png&#41;)
