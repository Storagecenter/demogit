package Filecreate;

import java.io.File;
import java.io.IOException;

public class path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f =new File("/home/naveen/Desktop/hdks.txt");			
		
		if(f.exists()) {
			System.out.println("the file exists");
		}
		else {
			System.out.println("doesnot exist");
		}
	}

}
