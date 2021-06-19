package Exceptionhandle;

public class Arrayindex {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub

		try {
int a=5/0;
int j[]=new int[4];
j[5]=6;
		}
		catch(ArithmeticException a) {
			a.printStackTrace();
			//////System.out.println("this is");
		
	}
		catch(ArrayIndexOutOfBoundsException i) 
		{
			//System.out.println("this is out");
		}
	System.out.println("Execute final result");
	}

}
