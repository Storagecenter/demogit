package Multipleinterface;

public class Teste  implements Testa,Testb,Testc,Testd{

	public void add(int a,int b) {
		System.out.println("the value is:"+(a+b));
	}
	public void sub(int a,int b) {
		System.out.println("the  value  is:"+(b-a));
	}
	public void mul(int a,int c,int b) {
		System.out.println("the  value is:"+(a*c*b));
	}
	public void div(int a,int b) {
		System.out.println("the value is:"+(b/a));
	}
	
}
