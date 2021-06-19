package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m= new HashMap<Integer,String>();
		
		m.put(1,"Naveen");
		m.put(2, "arun");
		m.put(3, "aishu");
		m.put(4, "vijay");
		
		for(Entry<Integer, String> n:m.entrySet()) {
			//System.out.println(m.getOrDefault(args, defaultValue));
			
		}

	}

}
