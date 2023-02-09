#!/usr/bin/env bash
export CLASSPATH=$CLASSPATH:$PWD/lib/junit-4.13-beta-3.jar:$PWD/lib/hamcrest-2.2-rc1.jar:$PWD/lib/jh61b-1.0.jar:.
echo $CLASSPATH > path_out.txt
# Execute a simple driver that outputs to console
#java  -cp classes assignment.AthleteDriver 

#Execut JUnit Tests
#cd classes
#For use with date sensitive test
LD_PRELOAD=/usr/lib/x86_64-linux-gnu/faketime/libfaketime.so.1 FAKETIME="2021-05-17 14:17:41" java -cp classes:lib/* tests.RunTests 
#2>Atest.txt 
#java -cp classes:lib/*  tests.RunnerTest >Rtest.txt 2>&1
#java -cp classes:lib/*  tests.SwimmerTest >Stest.txt 2>&1
#java -cp classes:lib/*  tests.AthleteRosterTest >ARtest.txt 2>&1
