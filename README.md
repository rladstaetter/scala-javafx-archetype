Scala JFX Skel
==============

This project is a maven archetype which creates a simple Helloworld project for Scala, Maven and JavaFX.

If you want to have a jumpstart for developing JavaFX with Scala and Maven, just enter

mvn archetype:generate -DarchetypeGroupId=net.ladstatt /
                       -DarchetypeArtifactId=scala-jfx-skel /
                       -DarchetypeVersion=1.0

Prerequisites
=============

As described in http://www.zenjava.com/2012/11/24/from-zero-to-javafx-in-5-minutes/, you want to
have the javafx libraries in your classpath. This can be done via calling 

mvn com.zenjava:javafx-maven-plugin:1.3:fix-classpath

once for your javafx installation.

For Windows users: 

Please make sure you have installed the "right" java installation for your architecture (x86 or x64)


