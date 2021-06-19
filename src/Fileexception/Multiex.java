package Fileexception;

public class Multiex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int j=5/0;
			int i[]=new int[4];
			i[5]=6;
		}
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException i) {
			i.printStackTrace();
		}
	}

}
