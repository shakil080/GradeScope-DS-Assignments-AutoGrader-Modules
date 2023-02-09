# Gradescope Autograder Modification for Assignments

Steps:

1. Create the Test file(or files) inside tests directory i.e /tests/SampleTest.java .
2. Define the package and import statements for test cases like below inside SampleTest.java

```java
package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import com.gradescope.jh61b.grader.GradedTest;
```
3. You need to import the class(or classes) of the assignment to run tests on the methods of those classes. For example:

```java
import assignment.Sample;
```
Make sure students add their classes under package assignment.

4. Add the classname inside the tests/RunTests.java following the below format:

```java
@Suite.SuiteClasses({
            tests.SampleTest.class
            })
```

5. Edit the run_autograder. Add the Assignment file(or files) name according to the below format:

```bash
cp /autograder/submission/Sample.java /autograder/source/ 2> copy_error.txt
```
6. Zip the files inside the root directory. 

7. Go to Gradescope -> Configure -> Replace Autograder -> Submit

## Special Instructions for Mac users

Before uploading the zip file, you need to delete all the __MacOSX files. Otherwise it will generate error. Run the command below:

```bash
zip -d Sample.zip "__MACOSX*"
```