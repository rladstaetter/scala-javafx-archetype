Scala JavaFX Archetype 
======================

This project is a maven archetype which creates a simple Helloworld project for Scala, Maven and JavaFX.

Prerequisites
=============

As described in http://www.zenjava.com/2012/11/24/from-zero-to-javafx-in-5-minutes/, you want to
have the javafx libraries in your classpath. This can be done via calling 

	mvn com.zenjava:javafx-maven-plugin:1.3:fix-classpath

once for your javafx installation.

For Windows users: 

Please make sure you have installed the "right" java installation for your architecture (x86 or x64)


If you want to have a jumpstart for developing JavaFX with Scala and Maven, just enter

	mvn archetype:generate -DarchetypeGroupId=net.ladstatt -DarchetypeArtifactId=scala-javafx-archetype -DarchetypeVersion=0.1

This will create a new maven project in a subdirectory relative to the place you've called the command above. Change to this directory and enter

	mvn clean package

After some time, a target directory will be created and a xyz-jfx.jar will be created. You can start the JavaFX application by
entering 

	java -jar target/xyz-jfx.jar

(Of course you have to adapt the jar filename!)

Enjoy!

