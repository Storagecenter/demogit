package ReadFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Returnfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileWriter f=new FileWriter(new File("/home/naveen/Desktop/hd.txt"));
f.write("hi how are you");
f.close();
	}

}
