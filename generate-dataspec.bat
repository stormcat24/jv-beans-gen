cd ..\workspace\jv-beans-gen
cmd /k mvn -e exec:java -Dgenerator=org.stormcat.jvbeans.gen.datatype.AllDataSpecGenerator -Dexec.args="350"