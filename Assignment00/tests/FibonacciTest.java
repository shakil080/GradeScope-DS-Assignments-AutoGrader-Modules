package tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.gradescope.jh61b.grader.GradedTest;

import assignment.Fibonacci;

public class FibonacciTest {
    

    @Test
    @GradedTest(name="Test 1 (fibonacci1)", max_score=10)
    public void testFibonacci() {
        assertEquals(8, Fibonacci.fibonacci(6));
    }
}
