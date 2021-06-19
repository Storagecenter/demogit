package Filecreate;

import java.io.File;
import java.io.IOException;

public class Filedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fd=new File("/home/naveen/Desktop/hd.txt");
		try {
			fd.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
