package objectconstruct;

public class Base {

	int ab;
	int bc;
	int cd;
	
	Base(int a,int b,int c)
	{
	   ab=a;
	   bc=b;
	   cd=c;
	}
	Base(Base ob){
		ab =ob.ab;
		bc=ob.bc;
		cd=ob.cd;
	}
	public int add(){
		return ab;
	}
	
	
}
