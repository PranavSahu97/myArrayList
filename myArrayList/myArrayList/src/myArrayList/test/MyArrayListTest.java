package myArrayList.test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import myArrayList.utils.Results;
import myArrayList.utils.FileProcessor;
import myArrayList.MyArrayList;

public class MyArrayListTest{
	String input = null;
	String output = null;



	public MyArrayListTest(String input, String output){
		this.input = input;
		this.output = output;
	}



	public void testMe(MyArrayList myArrayList, Results results){

		FileProcessor fp = new FileProcessor(this.input);
		String num = fp.readLine();
		while(num!=null){
			myArrayList.insertSorted(Integer.parseInt(num));
			num = fp.readLine();
		}

		test1(myArrayList, results);
		test2(myArrayList, results);
		test3(myArrayList, results);
		test4(myArrayList, results);
		test5(myArrayList, results);
		test6(myArrayList, results);
		test7(myArrayList, results);
		test8(myArrayList, results);
		test9(myArrayList, results);
		test10(myArrayList, results);
		results.writeToFile(this.output);
	}
		
	private void test1(MyArrayList myArrayList, Results results){
		results.storeNewResult("Test1: Testing the sum of initial values from input.txt");
			int sum_all = myArrayList.sum();		//since no element present, initial sum should be 0
			if(sum_all == 36){
				results.storeNewResult("Passed: Sum of all the values in arraylist is:  " +sum_all);
			} else {
				results.storeNewResult("Failed: Sum of all the values in arraylist is:  " +sum_all);

			}
		}

	private void test2(MyArrayList myArrayList, Results results){
		results.storeNewResult("Test2: Testing the sum of values from input.txt");
			myArrayList.insertSorted(10);
			myArrayList.insertSorted(5);
			myArrayList.insertSorted(1);
			myArrayList.insertSorted(12);
			myArrayList.toString();		//displays the array in a sorted manner
			int sum_all=myArrayList.sum();			//computes the sum
			if(sum_all==64){
				results.storeNewResult("Passed: Sum of all the values in arraylist is:  " +sum_all);
			} else {
				results.storeNewResult("Failed: Sum of all the values in arraylist is:  " +sum_all);

			}

		}

	private void test3(MyArrayList myArrayList, Results results){
			results.storeNewResult("Test3: Testing resized array size");
			myArrayList.insertSorted(100000);	//value exceeds given constraint
			myArrayList.toString();
			int size=myArrayList.size();
			if(size==13){
				results.storeNewResult("Passed: Size of arraylist is:  " +size);
			} else{
				results.storeNewResult("Failed: Size of arraylist is:  " +size);
			}
			
		}

	private void test4(MyArrayList myArrayList, Results results){
			results.storeNewResult("Test4: Testing the removal of value from array");
			myArrayList.removeValue(1);
			myArrayList.compact();
			myArrayList.toString();
			int size=myArrayList.size();
			if(size==11){
				results.storeNewResult("Passed: Size of arraylist is:  " +size);
			} else{
				results.storeNewResult("Failed: Size of arraylist is:  " +size);
			}
			
		}

	private void test5(MyArrayList myArrayList, Results results){
		results.storeNewResult("\nTest5: Testing the insertion order of list");
			myArrayList.printInsertionOrder();		//displays data as it is inserted
		}

	private void test6(MyArrayList myArrayList, Results results){
			results.storeNewResult("\nTest6: Testing the size of array after inserting elements");

			int size=myArrayList.size();
			if(size==11){
				results.storeNewResult("Passed: Size of arraylist is:  " +size);
			} else{
				results.storeNewResult("Failed: Size of arraylist is:  " +size);
			}
		}		

	private void test7(MyArrayList myArrayList, Results results){
			results.storeNewResult("\nTest7: Check index of element present in array");
			int a = myArrayList.indexOf(5);		//displays index of element present
			if(a!=-1){
				results.storeNewResult("Passed: Index of element is:  " +a);
			} else{
				results.storeNewResult("Failed: Index is not present:  " +a);
			}
		}

	private void test8(MyArrayList myArrayList, Results results){
			results.storeNewResult("\nTest8: Check index of element not present in array");
			int a=myArrayList.indexOf(120);		//displays index of element not present
			if(a==-1){
				results.storeNewResult("Passed:  Element is not present:  " +a);
			} else{
				results.storeNewResult("Failed: Element is present:  " +a);
			}
		}

	private void test9(MyArrayList myArrayList, Results results){
			results.storeNewResult("\nTest9: Check sum of array");

			myArrayList.insertSorted(5);		//check for duplicate insertion
			myArrayList.insertSorted(11);
			myArrayList.insertSorted(16);
			myArrayList.insertSorted(32);		//Array resize check
			myArrayList.toString();
			int sum_all=myArrayList.sum();			//computes the sum
			if(sum_all==126){
				results.storeNewResult("Passed: Sum of all the values in arraylist is:  " +sum_all);
			} else {
				results.storeNewResult("Failed: Sum of all the values in arraylist is:  " +sum_all);

			}

		}

	private void test10(MyArrayList myArrayList, Results results){
			results.storeNewResult("\nTest10: Check size of array");
			int size=myArrayList.size();
			if(size==15){
				results.storeNewResult("Passed: Size of arraylist is:  " +size);
			} else{
				results.storeNewResult("Failed: Size of arraylist is:  " +size);
			}
		}		




	
	
	
}