package ReadFile;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class Readfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File f = new File("/home/naveen/Desktop/hd.txt");
FileReader f2=new FileReader(f);
long l =f.length();
for(long i=0;i<l;i++) {
	System.out.println((char)f2.read());
	f2.close();
}

	}

}
