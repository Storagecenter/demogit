package Exceptionhandle;

public class Throwa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int i=5;

		try {
			int j=i/0;
		}
		catch(ArithmeticException j) {
			System.out.println("this is"+j);
		}

}}
