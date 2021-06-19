package Fileexception;

public class Multipleexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			try {
				int j=5/0;
			}
			catch(Exception e) {
				System.out.println("this is not the result");
			}
			int j[]=new int[4];
			j[5]=6;
		}
			catch(ArrayIndexOutOfBoundsException i) 
			{
				System.out.println("thi sis"+i);
				//System.out.println("this is out");
			}
		}}

	


