package objectconstruct;

public class Resultobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Base b1 =new Base(1, 1, 1);
         Base b2 =new Base(b1);
	
	
	//System.out.println(+b1.add());
	System.out.println(+b2.add());
	}
	

}
