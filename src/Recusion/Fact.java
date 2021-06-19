package Recusion;

public class Fact {

	public int fact(int i)
	{
		int r;
		if(i==1) 
			return 1;
		r =  fact(i-1)*i;
		return r;
	}
}
