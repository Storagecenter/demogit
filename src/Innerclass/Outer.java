package Innerclass;

public class Outer {

	int i = 6;
	public void in() {
		inner in =new inner();
		System.out.println("the ineer class is"+in.y);
		in.on();
	}

	class inner{
		int y = 7;
		
		 void on() {
			System.out.println("the outer class is"+i);
		}
	}}
