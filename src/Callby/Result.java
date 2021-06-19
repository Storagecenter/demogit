 package Callby;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //int c=10,d=15;
 
 Value t1=new Value();
 t1.c=10;
 t1.d=16;
 System.out.println("i before passing="+t1.c);
 System.out.println("j before passing="+t1.d);
 
 Value t2=new Value(t1);
 System.out.println("i after passing="+t1.c);
 System.out.println("j after passing="+t1.d);
 
	}

}
