%~d0
cd %~p0
cmd /k mvn -e exec:java -Dgenerator=org.stormcat.jvbeans.gen.format.AllDtoGenerator -Dexec.args="350"