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

import assignment.LinkedListOperations;
import assignment.DoublyLinkedList;

public class LinkedListOperationsTest {

    static int[] inputArray; // Array elements to be modified and for generating Doubly Linked List
	
	// Helper functions
	static void prepareInputDataFromText(String filename) throws FileNotFoundException, IOException{
			
		File file = new File(filename);
        Scanner sc = new Scanner(file);
        
        String input = sc.nextLine();
        String[] strs = input.trim().split("\\s+");
        
        // Allocating the array for convenience
        inputArray = new int[strs.length];
        
        StringArrToIntArr(inputArray, strs, 0);
        //System.out.println("Data from File:" + Arrays.toString(inputArray));
        
        sc.close();
    }
	
	// Helper functions
	public static void StringArrToIntArr(int[] arr, String[] s, int startingindex) {
		
		//startingindex is the index from where we are populating the array from input file
		for (int i = 0, j = startingindex; i < s.length; i++, j++) {
			arr[j] = Integer.parseInt(s[i]);
	    }
	}

    @Test
    @GradedTest(name="Test 1 (Reversed Doubly Linked List Check 1)", max_score=1)
    public void testReversedLinkedList1() throws FileNotFoundException, IOException {

		String fileName =  "./tests/DLL1.txt";
		prepareInputDataFromText(fileName);
		
		// Initialization
		DoublyLinkedList list = new DoublyLinkedList();
		LinkedListOperations listOps = new LinkedListOperations();
		String reversedListOutput = "";
		
		list.createDoublyLinkedList(inputArray);
		
		listOps.reverseLinkedList(list);
		reversedListOutput = list.printList();
		//System.out.println("Reversed List:" + reversedListOutput);

        assertEquals("9 12 21 16 7 13 3", reversedListOutput);

    }

    @Test
    @GradedTest(name="Test 1 (Palindrome Check 1)", max_score=1)
    public void testIsPalindrome1() throws FileNotFoundException, IOException {

		String fileName = "./tests/DLL1.txt";
		prepareInputDataFromText(fileName);
		
		// Initialization
		DoublyLinkedList list = new DoublyLinkedList();
		LinkedListOperations listOps = new LinkedListOperations();
		
		list.createDoublyLinkedList(inputArray);
		
		boolean isPalindromOutput = listOps.isPalindrome(list);

        assertEquals(false, isPalindromOutput);

    }


	@Test
    @GradedTest(name="Test 2 (Reversed Doubly Linked List Check 2)", max_score=1)
    public void testReversedLinkedList2() throws FileNotFoundException, IOException {
		
		String fileName =  "./tests/DLL2.txt";
		prepareInputDataFromText(fileName);
		
		// Initialization
		DoublyLinkedList list = new DoublyLinkedList();
		LinkedListOperations listOps = new LinkedListOperations();
		String reversedListOutput = "";
		
		list.createDoublyLinkedList(inputArray);
		
		listOps.reverseLinkedList(list);
		reversedListOutput = list.printList();
		//System.out.println("Reversed List:" + reversedListOutput);

        assertEquals("10 9 8 7 6 5 4 3 2 1", reversedListOutput);

    }

    @Test
    @GradedTest(name="Test 2 (Palindrome Check 2)", max_score=1)
    public void testIsPalindrome2() throws FileNotFoundException, IOException {

		String fileName = "./tests/DLL2.txt";
		prepareInputDataFromText(fileName);
		
		// Initialization
		DoublyLinkedList list = new DoublyLinkedList();
		LinkedListOperations listOps = new LinkedListOperations();
		
		list.createDoublyLinkedList(inputArray);
		
		boolean isPalindromOutput = listOps.isPalindrome(list);

        assertEquals(false, isPalindromOutput);

    }

	@Test
    @GradedTest(name="Test 3 (Reversed Doubly Linked List Check 3)", max_score=1)
    public void testReversedLinkedList3() throws FileNotFoundException, IOException {
		
		String fileName =  "./tests/DLL3.txt";
		prepareInputDataFromText(fileName);
		
		// Initialization
		DoublyLinkedList list = new DoublyLinkedList();
		LinkedListOperations listOps = new LinkedListOperations();
		String reversedListOutput = "";
		
		list.createDoublyLinkedList(inputArray);
		
		listOps.reverseLinkedList(list);
		reversedListOutput = list.printList();
		//System.out.println("Reversed List:" + reversedListOutput);

        assertEquals("10 20 3 40 50 4 20 10", reversedListOutput);

    }

    @Test
    @GradedTest(name="Test 3 (Palindrome Check 3)", max_score=1)
    public void testIsPalindrome3() throws FileNotFoundException, IOException {

		String fileName = "./tests/DLL3.txt";
		prepareInputDataFromText(fileName);
		
		// Initialization
		DoublyLinkedList list = new DoublyLinkedList();
		LinkedListOperations listOps = new LinkedListOperations();
		
		list.createDoublyLinkedList(inputArray);
		
		boolean isPalindromOutput = listOps.isPalindrome(list);

        assertEquals(false, isPalindromOutput);

    }

	@Test
    @GradedTest(name="Test 4 (Reversed Doubly Linked List Check 4)", max_score=1)
    public void testReversedLinkedList4() throws FileNotFoundException, IOException {
		
		String fileName =  "./tests/DLL4.txt";
		prepareInputDataFromText(fileName);
		
		// Initialization
		DoublyLinkedList list = new DoublyLinkedList();
		LinkedListOperations listOps = new LinkedListOperations();
		String reversedListOutput = "";
		
		list.createDoublyLinkedList(inputArray);
		
		listOps.reverseLinkedList(list);
		reversedListOutput = list.printList();
		//System.out.println("Reversed List:" + reversedListOutput);

        assertEquals("1 2 3 4 4 3 2 1", reversedListOutput);

    }

    @Test
    @GradedTest(name="Test 4 (Palindrome Check 4)", max_score=1)
    public void testIsPalindrome4() throws FileNotFoundException, IOException {

		String fileName = "./tests/DLL4.txt";
		prepareInputDataFromText(fileName);
		
		// Initialization
		DoublyLinkedList list = new DoublyLinkedList();
		LinkedListOperations listOps = new LinkedListOperations();
		
		list.createDoublyLinkedList(inputArray);
		
		boolean isPalindromOutput = listOps.isPalindrome(list);

        assertEquals(true, isPalindromOutput);

    }

	@Test
    @GradedTest(name="Test 5 (Reversed Doubly Linked List Check 5)", max_score=1)
    public void testReversedLinkedList5() throws FileNotFoundException, IOException {
		
		String fileName =  "./tests/DLL5.txt";
		prepareInputDataFromText(fileName);
		
		// Initialization
		DoublyLinkedList list = new DoublyLinkedList();
		LinkedListOperations listOps = new LinkedListOperations();
		String reversedListOutput = "";
		
		list.createDoublyLinkedList(inputArray);
		
		listOps.reverseLinkedList(list);
		reversedListOutput = list.printList();
		//System.out.println("Reversed List:" + reversedListOutput);

        assertEquals("1", reversedListOutput);

    }

    @Test
    @GradedTest(name="Test 5 (Palindrome Check 5)", max_score=1)
    public void testIsPalindrome5() throws FileNotFoundException, IOException {

		String fileName = "./tests/DLL5.txt";
		prepareInputDataFromText(fileName);
		
		// Initialization
		DoublyLinkedList list = new DoublyLinkedList();
		LinkedListOperations listOps = new LinkedListOperations();
		
		list.createDoublyLinkedList(inputArray);
		
		boolean isPalindromOutput = listOps.isPalindrome(list);

        assertEquals(true, isPalindromOutput);

    }

}
