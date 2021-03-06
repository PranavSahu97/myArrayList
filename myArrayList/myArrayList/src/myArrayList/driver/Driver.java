package myArrayList.driver;
import myArrayList.MyArrayList;	
import myArrayList.test.MyArrayListTest;	
import myArrayList.utils.Results;


/**
 * @author Pranav Sahu
 *
 */


public class Driver {

	public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */
		if (args.length < 2 || args[0]==null ) {
			System.err.println("Error: Incorrect number of arguments. Program accepts more than one arguments.");
			System.exit(0);
		}

		String input=args[0];
		String output=args[1];
		MyArrayList list=new MyArrayList();
		MyArrayListTest obj=new MyArrayListTest(input, output);
		Results results = new Results();
		obj.testMe(list, results);
	}
}
