package myArrayList.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
	private String result="";

	@Override
	public void writeToFile(String str) {
		BufferedWriter br = null;
		try {
			br = new BufferedWriter(new FileWriter(str));
			//for (String data : resultList) {
				br.write(result+"\n");
			//}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	//Write to console.

	@Override
	public void writeToStdout(String s) 
	{
		System.out.println(s + " \n");
	}


	public void storeNewResult(String res) 
	{
	//resList.add(res);
		result = result + "\n"+res;
		writeToStdout(res);
	}

		
}

