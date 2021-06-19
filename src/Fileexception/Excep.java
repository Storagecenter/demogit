package Fileexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream m=null;
		try {
			 m=new FileInputStream("/home/naveen/Desktop/http.csv");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			m.close();
	System.out.println("this file found ");
	}}

}
