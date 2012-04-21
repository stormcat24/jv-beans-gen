#!/bin/bash
mvn -e exec:java -Dgenerator=org.stormcat.jvbeans.gen.datatype.AllDataSpecGenerator -Dexec.args="350"