package methodoverload;

public class Const {
	
	int a;
	int b;
	int c;
	
	Const(int ac,int bc,int cc){

            a =ac;
		     b=bc;
		c=cc;  
		
	}
   Const(int d){
	a=b=c= d;
   }
public int ad(){
	return a+b+c;
}
}
