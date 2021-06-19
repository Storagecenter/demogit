package methodoverload;

public class method {

	public void test() {
		System.out.println("this is without parameter");
	}
	
	public void test(int a) {
		
		System.out.println("this is with single parameter"+a);
	}
	public void test (float b) {
		System.out.println("this is with float"+b);
		
	}
	public  void test (int a, int b) {
		System.out.println("this is with two parameter"+a+b);
	}
	
	
	
}
