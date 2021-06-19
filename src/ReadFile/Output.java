package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output {

	public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub

		File f=new File("/home/naveen/Desktop/hdk.txt");
		FileOutputStream  f1 = new FileOutputStream(f);
		int s=1223;
		f1.write(s);
		f1.close();
		
	}
	

}
