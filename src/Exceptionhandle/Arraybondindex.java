package Exceptionhandle;

public class Arraybondindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[4];
	
try {
	
	a[6]=8;
}	
catch(ArrayIndexOutOfBoundsException i) {
	System.out.println("this is");
}
	}

}
