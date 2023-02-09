#!/usr/bin/env bash
#
files_to_change=$(find . -name "*.java")
echo $files_to_change
for filename in $files_to_change
do
  sed -i "s/import\sjava.lang.Math/import brandon.math.Math;import brandon.math.Random/g" $filename
  sed -i "s/import\sjava.util.Random/import brandon.math.Random/g" $filename
done
