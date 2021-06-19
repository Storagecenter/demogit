package StaticBlock;

public class Stc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() method");
		   System.out.println("the value of instance var a is"+i);
		   System.out.println("the value of instance var  b is"+j);
	}
   static int i=5,j;
   static {
	   System.out.println("This static info is");
	   j=i*2;
   }
}
