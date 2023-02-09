package tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.gradescope.jh61b.grader.GradedTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import assignment.MinHeap;

public class MinHeapOperationsTest {

    private static int size;
	static int[] inputArray; // Array elements to be modified and for generating MinHeap
	static int[] newElementsArray; // New elements to be inserted in the Heap
	
	// Helper functions
	static void prepareInputDataFromText(String filename) throws FileNotFoundException, IOException{
			
		File file = new File(filename);
        Scanner sc = new Scanner(file);
        
        String size_n = sc.nextLine();
       
        size = Integer.parseInt(size_n);
        
        // Allocating the array for convenience
        inputArray = new int[2*size + 10];
        
        String input = sc.nextLine();
        String[] strs = input.trim().split("\\s+");
        StringArrToIntArr(inputArray, strs, 1);
        
        input = sc.nextLine();
        strs = input.trim().split("\\s+");
        newElementsArray = new int[strs.length];
        StringArrToIntArr(newElementsArray, strs, 0);
        
        sc.close();
    }
	
	// Helper functions to populate array according to the need
	public static void StringArrToIntArr(int[] arr, String[] s, int startingindex) {
		
		//startingindex is the index from where we are populating the array from input file
		for (int i = 0, j = startingindex; i < s.length; i++, j++) {
			arr[j] = Integer.parseInt(s[i]);
	    }
	}

    @Test
    @GradedTest(name="Test 1 (BuildHeap Result 1)", max_score=2)
    public void testMinHeapOperation1() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap1.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("3 5 6 9 84 19 17 22 10", generatedResults[0]);

    }

    @Test
    @GradedTest(name="Test 2 (Removed Items Check 1)", max_score=1)
    public void testMinHeapOperation2() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap1.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("3 5 6 9 10", generatedResults[1]);

    }

    @Test
    @GradedTest(name="Test 3 (HeapSort Result 1)", max_score=1)
    public void testMinHeapOperation3() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap1.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("84 30 22 20 19 17 15 10 5", generatedResults[2]);

    }

    @Test
    @GradedTest(name="Test 4 (BuildHeap Result 2)", max_score=2)
    public void testMinHeapOperation4() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap2.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("1 3 5 4 6 13 10 9 8 15 17", generatedResults[0]);

    }

    @Test
    @GradedTest(name="Test 5 (Removed Items Check 2)", max_score=1)
    public void testMinHeapOperation5() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap2.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("1 3 4 5 6", generatedResults[1]);

    }

    @Test
    @GradedTest(name="Test 6 (HeapSort Result 2)", max_score=1)
    public void testMinHeapOperation6() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap2.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("35 17 15 13 12 11 10 9 8 7 2", generatedResults[2]);

    }

    @Test
    @GradedTest(name="Test 7 (BuildHeap Result 3)", max_score=2)
    public void testMinHeapOperation7() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap3.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("2 2 2 2 2 2 2 2 2", generatedResults[0]);

    }

    @Test
    @GradedTest(name="Test 8 (Removed Items Check 3)", max_score=1)
    public void testMinHeapOperation8() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap3.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("2 2 2 2 2", generatedResults[1]);

    }

    @Test
    @GradedTest(name="Test 9 (HeapSort Result 3)", max_score=1)
    public void testMinHeapOperation9() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap3.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("5 3 2 2 2 2 2 1 1", generatedResults[2]);

    }

    @Test
    @GradedTest(name="Test 10 (BuildHeap Result 4)", max_score=2)
    public void testMinHeapOperation10() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap4.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("0 2 1 3 8 4 10 16 7", generatedResults[0]);

    }

    @Test
    @GradedTest(name="Test 11 (Removed Items Check 4)", max_score=1)
    public void testMinHeapOperation11() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap4.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("0 1 2 3 4", generatedResults[1]);

    }

    @Test
    @GradedTest(name="Test 12 (HeapSort Result 4)", max_score=1)
    public void testMinHeapOperation12() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap4.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("30 25 20 16 15 10 10 8 7", generatedResults[2]);

    }

    @Test
    @GradedTest(name="Test 13 (BuildHeap Result 5)", max_score=2)
    public void testMinHeapOperation13() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap5.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("11 22 17 33 88 99 66 55", generatedResults[0]);

    }

    @Test
    @GradedTest(name="Test 14 (Removed Items Check 5)", max_score=1)
    public void testMinHeapOperation14() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap5.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("11 17 22 33 55", generatedResults[1]);

    }

    @Test
    @GradedTest(name="Test 15 (HeapSort Result 5)", max_score=1)
    public void testMinHeapOperation15() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/minheap5.txt";
		prepareInputDataFromText(fileName);
		
		MinHeap minHeap = new MinHeap();
		String[] generatedResults = minHeap.MinHeapOperations(inputArray, newElementsArray, size);
        
        assertEquals("99 88 77 66 44 43 15 12", generatedResults[2]);

    }

}
