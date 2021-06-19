package ReturnObj;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t2=new Test(10);
		Test t3;
		System.out.println("Test before value a="+t2.a);
		
		
		t3=t2.icr();
		System.out.println("test after calling a="+t3.a);
		
		t3=t3.icr();
		System.out.println("test after a="+t3.a);
	}

}
