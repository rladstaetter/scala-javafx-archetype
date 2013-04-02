Scala JavaFX Archetype 
======================

This project is a maven archetype which creates a simple Helloworld project for Scala, Maven and JavaFX, showcasing a 
test scenario with JemmyFX and ScalaTest.

A jumpstart for developing JavaFX with Scala and Maven is possible by entering

	mvn archetype:generate -DarchetypeGroupId=net.ladstatt -DarchetypeArtifactId=scala-javafx-archetype -DarchetypeVersion=0.1

Or, if you want to have the latest development version:

	mvn archetype:generate -DarchetypeCatalog=https://oss.sonatype.org/content/repositories/snapshots -DarchetypeGroupId=net.ladstatt -DarchetypeArtifactId=scala-javafx-archetype -DarchetypeVersion=0.2-SNAPSHOT

(Disclaimer: the test seems to have problems on MacOsX when called from command line, under windows (or used in Eclipse on MacOsX) 
it runs through without problems)

After answering some basic questions, this will create a new maven project in a subdirectory relative to the place you've called the 
command above. Before you can continue, make sure to have the javafx runtime libraries in your classpath. Another maven plugin ensures 
this by entering

	mvn com.zenjava:javafx-maven-plugin:1.5:fix-classpath

(More information about this plugin is provided here: http://www.zenjava.com/2012/11/24/from-zero-to-javafx-in-5-minutes/. Also please
make sure you've installed a recent jdk (1.7.0_09 or higher))

Change to the newly created directory and enter

	mvn package

After some time, a target directory will be created and a yourartifactid-yourversion-jfx.jar will be created. You can start the JavaFX application by
entering 

	java -jar target/yourartifactid-yourversion-jfx.jar

(Of course you have to adapt the jar filename!)

Enjoy!
