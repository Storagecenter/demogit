package ReadFile;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("/home/naveen/Desktop/hd.txt");
		FileWriter r =new FileWriter(f);
		//FileInputStream r=new FileInputStream(f);
		r.write("this is text");
		r.append("how r u ");
		r.close();
		System.out.println("its completed");
	}
}
