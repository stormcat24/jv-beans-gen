cd ..\workspace\jv-beans-gen
cmd /k mvn -e exec:java -Dgenerator=org.stormcat.jvbeans.gen.code.RootCodeGenerator -Dexec.args="350"