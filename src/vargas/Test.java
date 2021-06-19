package vargas;

public class Test {

	static void sum(int ... var) 
	{
		
		int sum=0;
		for(int i: var) {
			sum =sum +i;
			
		}
		System.out.println("the value is"+sum);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         sum();
         sum(1);
         sum(1,1);
         sum(1,1,1);
	}

}
