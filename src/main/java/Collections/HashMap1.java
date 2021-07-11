package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String, String> a=new HashMap<String,String>();
		for(int i=0; i<10; i++) {
			a.put(String.valueOf(i), String.valueOf(i));
		}
			
		System.out.println(a.values());
		for(String p: a.keySet()) {
			System.out.println(p.toString());	
		}
			
		for(Map.Entry<String,String> e:a.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getKey());
		}
				
		for (Map.Entry<String, String> e: a.entrySet()) {
			System.out.println(e.getKey()+"  "+ e.getValue());
		}
		
	}

}
