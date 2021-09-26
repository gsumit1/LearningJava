package SortedMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortedMap {
	
	public static void main(String[] arg) {
		
		SortedMap<String, String> sm=new TreeMap<String, String>();
		sm.put("girl", "boy");
		sm.put("boy", "15");
		
		
		
		
		
		Iterator<Entry<String, String>> x=sm.entrySet().iterator();
		
		while(x.hasNext()) {
			
			Map.Entry m = (Map.Entry)x.next(); 

			String key = (String)m.getKey(); 
			String value = (String)m.getValue(); 

			System.out.println("Key : " + key + 
							" value : " + value); 
			
			
			
			
			
		}
		
		
	}

}
