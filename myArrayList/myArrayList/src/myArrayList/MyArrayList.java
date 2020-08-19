package myArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MyArrayList
{
	
	private int[] arr=new int[3];

	int counter=0;
	List<Integer> list=new ArrayList<Integer>(); //make use of list
	
	/********************* Constructor *****************/
	public MyArrayList(){
		for(int i=0;i<arr.length;i++){
		  	arr[i]=100001;
	  	}
	}

	
	/********************* Resize *****************/
	public void arrayResize(){
		int length = (int)(1.5 * arr.length);
		int array[] = new int[length];
		for(int i =0;i<arr.length;i++){
			array[i]=arr[i];
		}
		for(int j=arr.length; j<length;j++){
			array[j]=100001;
		}
		arr=array;
	}

	/********************* Insert Sort *****************/
	public void insertSorted(int newValue) {
		
		if(counter==arr.length){
			arrayResize();
		}
		
		if(newValue >=0 && newValue <=10000) {
			arr[counter]= newValue;
			list.add(newValue);
			counter++;
		
		}
		Arrays.sort(arr,0,counter);			//sorts the array
	}

	/********************* Print Insert Order *****************/
	public void printInsertionOrder() {
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	/********************* Remove Value *****************/
	public void removeValue(int value) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				arr[i]=100001;
			}
		}
	}

	/********************* Compact *****************/
	public void compact(){
	 for(int i=0; i<counter;i++){	
	 	if(arr[i]==100001) {
				for(int j=i;j<counter-1;j++) {
					arr[j]=arr[j+1];	
				}
				counter--;
				i--;
			}
		}

	 for(int j=counter;j<arr.length;j++){
	 	arr[j]=-1;
	 }
	}	


	/********************* Index Of *****************/
	public int indexOf(int value) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==value) {
				return i;
			}
		}
		return -1;
	}
	
	/********************* Size *****************/	
	public int size() {
		return counter;		//counter maintains final value of index
	}
	
	
	/********************* Sum *****************/
	public int sum() {
		int sum=0;
		for(int i=0;i<counter;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	/********************* To String *****************/
	public String toString() {
		System.out.println("The output is:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" \t "+arr[i]);
			System.out.println("");
		}
		return null;
	}
	
}