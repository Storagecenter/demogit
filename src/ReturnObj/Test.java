package ReturnObj;

public class Test {
int a;
	Test(int i){
		a=i;
	}
	Test icr() {
		Test t1=new Test(a+10);
		return t1;
	}
	
}

