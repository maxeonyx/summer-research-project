#!/usr/bin/env bash

# Compile a java program with the checker framework

CHECKERFRAMEWORK=../checker-framework-3.7.1


javac \
-J--add-opens=jdk.compiler/com.sun.tools.javac.comp=ALL-UNNAMED \
-processorpath $CHECKERFRAMEWORK/checker/dist/checker.jar \
-cp $CHECKERFRAMEWORK/checker/dist/checker-qual.jar \
-processor org.checkerframework.checker.nullness.NullnessChecker \
-processor org.checkerframework.framework.util.PurityChecker \
-AcheckPurityAnnotations \
$*
