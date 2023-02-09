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

import assignment.BSTOperations;

public class BSTOperationsTest {

    static int[] inputArray; // Array elements for generating BST
	static int[] deleteElementsArray; // Elements to be deleted from the BST
	static int[] searchElementsArray; // Elements to be searched in the BST
	
	// Helper functions
	static void prepareInputDataFromText(String filename) throws FileNotFoundException, IOException{
			
		File file = new File(filename);
        Scanner sc = new Scanner(file);
        
        String input = sc.nextLine();
        String[] strs = input.trim().split("\\s+");
        inputArray = new int[strs.length];
        StringArrToIntArr(inputArray, strs, 0);
        //System.out.println("inputArray " + Arrays.toString(inputArray));
        
        input = sc.nextLine();
        strs = input.trim().split("\\s+");
        deleteElementsArray = new int[strs.length];
        StringArrToIntArr(deleteElementsArray, strs, 0);
        //System.out.println("deleteElementsArray: " + Arrays.toString(deleteElementsArray));
        
        input = sc.nextLine();
        strs = input.trim().split("\\s+");
        searchElementsArray = new int[strs.length];
        StringArrToIntArr(searchElementsArray, strs, 0);
        //System.out.println("searchElement:" + searchElement);
        
        sc.close();
    }
	
	// Helper functions
	public static void StringArrToIntArr(int[] arr, String[] s, int startingindex) {
		
		//startingindex is the index from where we are populating the array from input file
		for (int i = 0, j = startingindex; i < s.length; i++, j++) {
			arr[j] = Integer.parseInt(s[i]);
	    }
	}

    static BSTOperations bst; // = new BSTOperations();

    @Test
    @GradedTest(name="Test 1 (InOrder Sorted Data after Insertion operation 1)", max_score=2)
    public void testBSTOperation1() throws FileNotFoundException, IOException {
        
        bst = new BSTOperations();
        
        String fileName = "./tests/bst1.txt";
		prepareInputDataFromText(fileName);

        //BSTOperations bst = new BSTOperations();
		String generatedOutput = bst.insertOperationInBST(inputArray);

        assertEquals("1 2 3 4 5 6 7 8 9 10 15", generatedOutput);

    }

    // @Test
    // @GradedTest(name="Test 2 (InOrder Sorted Data after Deletion operation 1)", max_score=2)
    // public void testBSTOperation2() throws FileNotFoundException, IOException {
        
    //     String fileName = "./tests/bst1.txt";
	// 	prepareInputDataFromText(fileName);

    //     //BSTOperations bst = new BSTOperations();
	// 	String generatedOutput = bst.deleteOperationInBST(deleteElementsArray);

    //     assertEquals("1 3 4 5 7 8 9 15", generatedOutput);

    // }

    @Test
    @GradedTest(name="Test 2 (Search operation 1)", max_score=2)
    public void testBSTOperation3() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/bst1.txt";
		prepareInputDataFromText(fileName);

        //BSTOperations bst = new BSTOperations();
        String inOrderAfterDelete = bst.deleteOperationInBST(deleteElementsArray);
        String generatedOutput = bst.searchOperationInBST(searchElementsArray);

        assertEquals("true false", generatedOutput);

    }

    @Test
    @GradedTest(name="Test 3 (InOrder Sorted Data after Insertion operation 2)", max_score=2)
    public void testBSTOperation4() throws FileNotFoundException, IOException {
        
        bst = null;
        bst = new BSTOperations();
        
        String fileName = "./tests/bst2.txt";
		prepareInputDataFromText(fileName);

        //BSTOperations bst = new BSTOperations();
		String generatedOutput = bst.insertOperationInBST(inputArray);

        assertEquals("1 2 3 4 5 6 7 8 9 10", generatedOutput);

    }

    // @Test
    // @GradedTest(name="Test 5 (InOrder Sorted Data after Deletion operation 2)", max_score=2)
    // public void testBSTOperation5() throws FileNotFoundException, IOException {
        
    //     String fileName = "./tests/bst2.txt";
	// 	prepareInputDataFromText(fileName);

    //     //BSTOperations bst = new BSTOperations();
	// 	String generatedOutput = bst.deleteOperationInBST(deleteElementsArray);

    //     assertEquals("1 3 4 5 6 7 8 9 10", generatedOutput);

    // }

    @Test
    @GradedTest(name="Test 4 (Search operation 2)", max_score=2)
    public void testBSTOperation6() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/bst2.txt";
		prepareInputDataFromText(fileName);

        //BSTOperations bst = new BSTOperations();
        String inOrderAfterDelete = bst.deleteOperationInBST(deleteElementsArray);
        String generatedOutput = bst.searchOperationInBST(searchElementsArray);

        assertEquals("false false", generatedOutput);

    }

    @Test
    @GradedTest(name="Test 5 (InOrder Sorted Data after Insertion operation 3)", max_score=2)
    public void testBSTOperation7() throws FileNotFoundException, IOException {
        
        bst = null;
        bst = new BSTOperations();
        
        String fileName = "./tests/bst3.txt";
		prepareInputDataFromText(fileName);

        //BSTOperations bst = new BSTOperations();
		String generatedOutput = bst.insertOperationInBST(inputArray);

        assertEquals("10 20 50 60 70 80 100", generatedOutput);

    }

    // @Test
    // @GradedTest(name="Test 8 (InOrder Sorted Data after Deletion operation 3)", max_score=2)
    // public void testBSTOperation8() throws FileNotFoundException, IOException {
        
    //     String fileName = "./tests/bst3.txt";
	// 	prepareInputDataFromText(fileName);

    //     //BSTOperations bst = new BSTOperations();
	// 	String generatedOutput = bst.deleteOperationInBST(deleteElementsArray);

    //     assertEquals("10 60 70 80 100", generatedOutput);

    // }

    @Test
    @GradedTest(name="Test 6 (Search operation 3)", max_score=2)
    public void testBSTOperation9() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/bst3.txt";
		prepareInputDataFromText(fileName);

        //BSTOperations bst = new BSTOperations();
        String inOrderAfterDelete = bst.deleteOperationInBST(deleteElementsArray);
        String generatedOutput = bst.searchOperationInBST(searchElementsArray);

        assertEquals("false false false true", generatedOutput);

    }

    @Test
    @GradedTest(name="Test 7 (InOrder Sorted Data after Insertion operation 4)", max_score=2)
    public void testBSTOperation10() throws FileNotFoundException, IOException {
        
        bst = null;
        bst = new BSTOperations();
        
        String fileName = "./tests/bst4.txt";
		prepareInputDataFromText(fileName);

        //BSTOperations bst = new BSTOperations();
		String generatedOutput = bst.insertOperationInBST(inputArray);

        assertEquals("1 2", generatedOutput);

    }

    // @Test
    // @GradedTest(name="Test 11 (InOrder Sorted Data after Deletion operation 4)", max_score=2)
    // public void testBSTOperation11() throws FileNotFoundException, IOException {
        
    //     String fileName = "./tests/bst4.txt";
	// 	prepareInputDataFromText(fileName);

    //     //BSTOperations bst = new BSTOperations();
	// 	String generatedOutput = bst.deleteOperationInBST(deleteElementsArray);

    //     assertEquals("1", generatedOutput);

    // }

    @Test
    @GradedTest(name="Test 8 (Search operation 4)", max_score=2)
    public void testBSTOperation12() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/bst4.txt";
		prepareInputDataFromText(fileName);

        //BSTOperations bst = new BSTOperations();
        String inOrderAfterDelete = bst.deleteOperationInBST(deleteElementsArray);
        String generatedOutput = bst.searchOperationInBST(searchElementsArray);

        assertEquals("false", generatedOutput);

    }

    @Test
    @GradedTest(name="Test 9 (InOrder Sorted Data after Insertion operation 5)", max_score=2)
    public void testBSTOperation13() throws FileNotFoundException, IOException {
        
        bst = null;
        bst = new BSTOperations();
        
        String fileName = "./tests/bst5.txt";
		prepareInputDataFromText(fileName);

        //BSTOperations bst = new BSTOperations();
		String generatedOutput = bst.insertOperationInBST(inputArray);

        assertEquals("1 2 3 4 5 6 7 8 9 10", generatedOutput);

    }

    // @Test
    // @GradedTest(name="Test 14 (InOrder Sorted Data after Deletion operation 5)", max_score=2)
    // public void testBSTOperation14() throws FileNotFoundException, IOException {
        
    //     String fileName = "./tests/bst5.txt";
	// 	prepareInputDataFromText(fileName);

    //     //BSTOperations bst = new BSTOperations();
	// 	String generatedOutput = bst.deleteOperationInBST(deleteElementsArray);

    //     assertEquals("1 4 6 7 8 9 10", generatedOutput);

    // }

    @Test
    @GradedTest(name="Test 10 (Search operation 4)", max_score=2)
    public void testBSTOperation15() throws FileNotFoundException, IOException {
        
        String fileName = "./tests/bst5.txt";
		prepareInputDataFromText(fileName);

        //BSTOperations bst = new BSTOperations();
        String inOrderAfterDelete = bst.deleteOperationInBST(deleteElementsArray);
        String generatedOutput = bst.searchOperationInBST(searchElementsArray);

        //bst = null;
        assertEquals("true false", generatedOutput);

    }


    
}
