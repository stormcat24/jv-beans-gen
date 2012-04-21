#!/bin/bash
mvn -e exec:java -Dgenerator=org.stormcat.jvbeans.gen.format.AllDtoGenerator -Dexec.args="350"