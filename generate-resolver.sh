#!/bin/bash
mvn -e exec:java -Dgenerator=org.stormcat.jvbeans.gen.resolver.AllResolverGenerator -Dexec.args="350"