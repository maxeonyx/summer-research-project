#!/usr/bin/env bash

export WYVERN_HOME="../wyvern"
CP_HOME="$WYVERN_HOME"

WYV_CLASSPATH="$CP_HOME/tools/build:$CP_HOME/tools/bin:$CP_HOME/tools/lib/CopperRuntime.jar:$CP_HOME/tools/lib/asm-debug-all-5.0.1.jar:$CP_HOME/tools/lib/junit-4.11.jar:$CP_HOME/tools/lib/protobuf-java-3.5.1.jar"

WYV_CLASSPATH="$WYV_CLASSPATH:$PWD"

WYV_CLASSPATH="$WYV_CLASSPATH:../checker-framework-3.7.1/checker/dist/checker-qual.jar"

echo $WYV_CLASSPATH
echo $WYVERN_HOME

java -cp "$WYV_CLASSPATH" wyvern.tools.Interpreter $*
