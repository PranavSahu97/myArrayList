# csx42-s19-assign1-PranavSahu97


-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on the project.
#### Note: build.xml is present in coursesRegistration/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile myArrayList/src/build.xml clean

-----------------------------------------------------------------------
### How to compile the code?

####Command: ant -buildfile myArrayList/src/build.xml all

-----------------------------------------------------------------------
### How to run the code?

####Command: ant -buildfile myArrayList/src/build.xml run -Darg0=input.txt -Darg1=output.txt


-----------------------------------------------------------------------
####Description
Assignment 1

Submit your code as per the provided instructions.
Updates
Assignment Goal
A Java program and corresponding test code, along with use of Git.
Team Work
•	No team work is allowed. Work individually. You cannot discuss the assignment with ANYONE other than the instructor and TA.
Programming Language
You are required to program using Java.
Compilation Method
•	Compilation: Your code should compile on bingsuns or remote.cs.binghamton.edu with the following command:
•	ant -buildfile src/build.xml all
or
You should be able to demo your code via Eclipse (screen sharing via google hangout or Skype).
Policy on sharing of code
•  EVERY line of code that you submit in this assignment should be written by you. Do NOT show your code to any other student. Do not copy any code from any online source. Code for File I/O or String operations, if found online, should be clearly cited, and you cannot use more than 5 lines of such online code.
•  Code downloaded in its entirety from another person's online repository of code (GitHub, BitBucket, etc.) and submitted as student's own work, even if citied, is considered plagiarism.
•  Code snippets, for File I/O, if used from an online source should be cited by mentioning it in the README.txt and also in the documentation of every source file in which that code appears.
•  Post to the listserv if you have any questions about the requirements. Do NOT post your code to the listserv asking for help with debugging.
Academic Honesty Policy
•	You are NOT allowed to copy code, or view/review code, from another student who is taking course this year, or has taken this course previously. It will be considered as cheating if you do so.
•	You can borrow code from online sources for some of the method implementations. If you do so, you should cite the url at the top of the code and also in the README.md file. If you do not cite the url, it will be considered as cheating.
Project Description
Assignment Goal: Develop a program, using Java, to design a new data structure and develop test code for it. The program should take an input file, process the input, and generate an output file.
•	Design a data structure named "MyArrayList" with the following properties:
o	The data structure should have an integer array as a private data member. Start with some initial int array size, say 50. If the input size is greater than 50, then create a new array of size 75, copy the contents of the original array into this new array, and then continue).
o	void insertSorted(int newValue) : This method should insert a new value but keep the data structure sorted in ascending order. If a value is a duplicate, you can store it before or after an existing value.
o	void printInsertionOrder() : This method should print the contents of the array in the order of insertion. As an added constraint, you cannot use another array to store the order, but are free to use other data structures for storing metadata that will enable printing in the inserted order. Provide a justification in your README.md in terms of space or time complexity for your choice of data structure(s) for the metadata.
o	void removeValue(int value); This method should remove all occurences of a value, if it exists, and then move the remaining values so that the array list has all values in ascending order.
o	compact() This method should get rid of internal empty buckets in the array and shrink the array if necessary. After compating, the elements in the end of the array that are not assigned should be set to "-1". The compact() > functionality can be tested by calling removeValue(...) on random internal values and then calling compact() to test if the capacity has indeed been reduced. You can optionally use a "load factor" similar to the one used in hash tables, to decide when the compact() method should be called. The load factor can be 1.0 by default, but can reset if it is passed in the constructor. The use of load factor is optional, just for your own design convenience.
o	int indexOf(int value); This method should return the index of the first occurrence a value. It should return -1 if the value does not exist in the array list.
o	int size(); This method should return the total number of values that are stored in the array list.
o	int sum(); This method should return the sume of all values that are stored in the array list.
o	For all the above methods, provide your own implementation. If you find an online source for any of the above methods, cite the url, use the same logic, but implement in your own way.
o	An empty constructor, which sets the privata data members to default values.
o	A toString(...) method that prints all the values of the array in a pretty manner. You can decide what "pretty print" means.
o	You can use private helper functions to consolidate operations such as array resizing and sorted insertion/removal.
•	In the file input file, you will be provided input as shown below. All input numbers will be in the range 0-10000. Insert all of these numbers into your MyArrayList.
•	12
•	1
•	0
•	1234
•	9999
•	123
•	Design and develop a Java program to implement the methods listed below. The program should generate an output file with the following line:
•	 
•	The sum of all the values in the array list is: 12345
•	Replace 12345 in the output file with the actual sum.
•	The MyArrayListTest.java file should have a method named "testMe(MyArrayList myArrayList, Results results)" that should call at least 10 different testMethods (all in the MyArrayListTest.java) each of which should call a single or a combination of methods on the myArrayList instance and test that it has been implemented correctly (including tests for boundary cases). At the end of each internal test, the following should be logged using write to results.storeNewResult(...):
1.	name of the test
2.	status (PASS/FAIL)
•  Class participation points will be given to the first 10 students who post interesting MyArrayListTest.java files to the Assignment-1 folder in piazza.
•  The Driver.java should have the main(...) function. It should create the MyArrayList instance and a Results instance, and call the testMe method on a MyArrayListTest instance. Next, it should print the String stored in the Results instance.
•  It is ok to use an in-built sorting algorithm, but you write your own code for copying the array during resizing.
Compiling and Running Java code
•	Your README.md file should have the following information:
o	instructions on how to compile the code
o	instructions on how to run the code
o	justification for the choice of data structures (in terms of time and/or space complexity).
o	Academic Honesty statement
Code Template
o	firstName_lastName_assign1.tar.gz.
o	git.
•	You should have the following directory structure (replace john_doe with your name).
•	john_doe_assign_1/
•	john_doe_assign_1/README.txt
•	john_doe_assign_1/myArrayList
•	john_doe_assign_1/myArrayList/src
•	john_doe_assign_1/myArrayList/src/build.xml
•	john_doe_assign_1/myArrayList/src/BUILD
•	john_doe_assign_1/myArrayList/src/BUILD/classes
•	john_doe_assign_1/myArrayList/src/myArrayList
•	john_doe_assign_1/myArrayList/src/myArrayList/driver
•	john_doe_assign_1/myArrayList/src/myArrayList/driver/Driver.java
•	john_doe_assign_1/myArrayList/src/myArrayList/store
•	john_doe_assign_1/myArrayList/src/myArrayList/util
•	john_doe_assign_1/myArrayList/src/myArrayList/util/FileProcessor.java
•	john_doe_assign_1/myArrayList/src/myArrayList/util/Logger.java
•	john_doe_assign_1/myArrayList/src/myArrayList/util/FileDisplayInterface.java
•	john_doe_assign_1/myArrayList/src/myArrayList/util/Results.java
•	john_doe_assign_1/myArrayList/src/myArrayList/util/StdoutDisplayInterface.java
•	john_doe_assign_1/myArrayList/src/myArrayList/test
•	john_doe_assign_1/myArrayList/src/myArrayList/test/MyArrayListTest.java
•	john_doe_assign_1/myArrayList/src/myArrayList/MyArrayList.java
•	 Some details on each class
•	
•	
o	 FileProcessor.java: this class should have a method String readLine(...), which returns one line at a time from a file.
o	
o	 Logger.java: You can ignore it for assignment-1. We will start using it in subsequent assignments.
o	
o	 FileDisplayInterface.java: This interface should have a method void writeToFile(String s);
o	
o	 Results.java: This class should have a data structure as private data member that should store Strings.
o	
o	 StdoutDisplayInterface.java: This interface should have a method void writeToStdout(String s);
o	
o	 Results FileProcessor should implement FileDisplayInterface and StdoutDisplayInterface
o	

-----------------------------------------------------------------------
## To clean:

ant -buildfile src/build.xml clean

Description: it cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## To compile:

ant -buildfile src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD
folder.

-----------------------------------------------------------------------

## To run by specifying arguments from command line
## We will use this to run your code

ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=output.txt

Description: So, you code must accept input.txt as the first argument
to fetch the input and output.txt as the second to write the
results. You have to place input.txt in the following path :
john_doe_assign_1/myArraylist. You don't have to place output.txt to
run the command. Your code should be able to generate output file if
there isn't one existing already. If there is one already, it should
overwrite the file everytime you run the code. You should NOT hardcode
input.txt and output.txt as the file names in your implementation.

-----------------------------------------------------------------------

###IMPORTANT GUIDELINES###

1. Make sure you clean your project before you submit it. There
shouldn't be any executables or .class files.

2. You are NOT supposed to include input.txt and output.txt files
along with your submission. We would use a different input file to run
and test your code. Your code must run for any input file.

3. Any violation in the specifications given would lead to you losing
points. Make sure you follow the directory structure given in the
requirements page.

Please drop me an email if you aren't able to proceed with the ANT
commands or are unclear with anything regarding the assignment. Also,
make sure you keep updating the code to bitbucket repository on a
timely basis.

mgovinda at binghamton dot edu
Back to Programming Design Patterns

Total Points: 50
•	
•	Correct user of git: 10 points
o	3 points: at least 8 commits in total.
o	4 points: 5 commits 72 hours before the submission deadline.
o	3 points: meaningful commit messages for each commit.
o	If more than 50% of the number of lines of code is committed in the last 24 hours: -5 points
o	If more than 50% of the number of lines of code is committed in the last 48 hours: -2.5 points
•	gzip has been created correctly (no executables, .class, backup file, or jar files): 5 points
•	Code compiles and runs according to the instructions in the assignment (which should be the same in the README.txt): 5 points.
•	Code generates valid output for the test cases: 20 points
•	Documentation for each method (just the return type) using javadoc style: 3 points
•	Command line arguments are validated: boundary conditions checks for missing input and output file names and if the provided input file does not exist: 7 points
•	Penalty for any exception that is not handled, including the ones while parsing the command line arguments: -5 points each time



-----------------------------------------------------------------------
### Justification
-----------------------------------------------------------------------
#### I used a list data structure as it keeps storing input data as it arrives.
#### Time complexity O(1) as it was always adding elements at the end of list. 

-----------------------------------------------------------------------
### Logic
-----------------------------------------------------------------------
#### I used a counter to double up as a reference for index of the array
#### The function insertSorted() takes a new value and inserts in the array. I have sorted the array after all elements are inserted.
#### The printInsertionSort() method takes a list data structure to print elements in the order that they arrive.
#### Value 100001 represents NULL value. I have later replaced that value with -1 for compact function.




-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating an official form will be
submitted to the Academic Honesty Committee of the Watson School to
determine the action that needs to be taken. "

Date: 06/17/2019.
