package objectconstruct;

public class test {

	int a;
	int b;
	test(int c,int d){
		
		a=c;
		b=d;
	}
	
	public boolean equals(test td){
	if(td.a==a|td.b!=b) 
		return true;
	else 
		return false;
	
	
	
}
}