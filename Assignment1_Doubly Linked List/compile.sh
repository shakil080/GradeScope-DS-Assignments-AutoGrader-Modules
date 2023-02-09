#!/usr/bin/env bash

# Find all java files in src directory
#cd A2/src
mkdir -p classes
ls -l > output1.txt
java_files=$(find . -name "*.java") 
javac -cp 'lib/*:classes/' -d classes $java_files 2> compile_output.txt
#javac --module-path /autograder/source/lib --add-modules javafx.controls -cp 'lib/*:classes/' -d classes $java_files 2> compile_output.txt 

# Find all java files in tests directory
#java_test_files=$(find tests -name "*.java")
#javac -cp lib/*:. -d classes $java_test_files
