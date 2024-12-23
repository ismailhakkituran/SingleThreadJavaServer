Single Thread Java Server
=========================

A Single thread java application waits for a Subscriber object using [Google Protocol Buffer](https://protobuf.dev/)

Downloading protobuf compiler

~~~shell
$> sudo apt-get install protobuf-compiler
~~~

Check your protobuf version (it has to be compatible with your 3rd party drivers of Java, Python and Ruby)

~~~shell
$> protoc --version
~~~
Output should be sth like:
~~~shell
libprotoc 3.12.4
~~~
So you should use 3.xx versions of libraries in maven for Java, gem for Ruby and pip for Python

Use protobuf compiler to generate specific programming language classes. Compile the `subscriber.proto` file in `$PROJECTDIR/src/main/proto`
~~~shell
$> protoc --java_out=../java/ student.proto
~~~

Move the generated `Subscriber.java` file `$PROJECTDIR/src/main/java/org/example/subscriberinfo` if you've made a path mistake. (This step has already done, if you' re gonna use that way.)

### Do not forget ###

 1. To build the project especially after generating a `.java` file from `.proto` files:

![Screenshot](https://github.com/ismailhakkituran/SingleThreadJavaServer/blob/main/Build%20the%20project.png)

 2. To hit the `Relaod the project` under the `Maven` section of your project.

[![How to](https://github.com/ismailhakkituran/SingleThreadJavaServer/blob/main/play-video.png)](https://drive.google.com/file/d/1LWR6-pPXQYZVl3mUMHYXIEd0MF7opCE7/view)
