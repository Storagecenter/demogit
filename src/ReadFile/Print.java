package ReadFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Print {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		PrintStream d=new PrintStream(new FileOutputStream("hdk.txt"));
		d.println("hai how are you");
		d.close();
		
	}

}
