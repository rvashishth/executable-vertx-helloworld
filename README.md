
How to run a vertx application packaged as fat jar 
Maven shade plugin – this helps us build a fat-jar, a single jar with all the dependents jar files.

>mvn clean package
>java -jar demo-1.0.0-SNAPSHOT-fat.jar


How to run a vertx application using main method
check out the com.wolftechnica.vertx.main.Test class


How to run a vertx application using eclipse run/debug configuration
	> Open run configuration, in main tab add "io.vertx.core.Starter" as main class
	> in the program arguments, add "run your.verticle.Class"



