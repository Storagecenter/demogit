package Fileexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptiom {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
       
			sample();
		
        
	}

	static void sample() throws FileNotFoundException {
		FileInputStream m=new FileInputStream("/home/naveen/Desktop/http.csv"); 
	}
}
