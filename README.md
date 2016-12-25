maven-assembly-component
===================


#### Introduction

 It answers the question how do I factorise a maven assembly descriptor when
- there is a common structure for several assemblies
- eventually a subpart of the assembly is specific for some modules


The example project is organised as follows:

    maven-assembly-example
    +-assembly-common-resources
    +-assembly-component
    +-assembly-example1
    +-assembly-example2

*assembly-example1* and *assembly-example1* modules both leverage assembly-component to create their own assembly.

 **maven-assembly-example** example illustrates how to factorise [maven assembly](https://maven.apache.org/plugins/maven-assembly-plugin/) descriptors to define a common skeleton and a specific part in submodule
 > - assembly-common-resources : common resources
 > - assembly-component : the common assembly descriptor
 > - assembly-example1 : a first module leveraging the maven [component][1] defined in assembly-component
 > - assembly-example2 : a second module leveraging the same maven [component][1] defined in assembly-component


##### Help
To run the main class within the assemblies on Linux or Mac OS, e.g.: example1
```
cd assembly1/target/
unzip *.zip
cd assembly-example1-1.0-SNAPSHOT
javac -cp .:lib/slf4j-api-1.7.5.jar:lib/slf4j-log4j12-1.7.5.jar:lib/log4j-1.2.17.jar fr/kdefombelle/assembly/Example1Main.java
java -cp .:conf:lib/slf4j-api-1.7.5.jar:lib/slf4j-log4j12-1.7.5.jar:lib/log4j-1.2.17.jar fr/kdefombelle/assembly/Example1Main
```

[1]: https://maven.apache.org/plugins/maven-assembly-plugin/examples/single/using-components.html "maven component"
