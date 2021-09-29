package temp;

import java.util.HashMap;
import java.util.List;

public class Sherlock {

	public static void main(String arg[]) {

		String s = "cdcd";

		char[] a = s.toCharArray();

		String key="";
		
		HashMap<String, List<String>> h=new HashMap<String,List<String>>();
		for (int i = 0; i < a.length; i++) {
			
			
			key=key+a[i];
			
			getCount(key,s);
			
			

		}

	}

	static void getCount(String key, String parent) {
		
		int l=key.length();
		
		char[] c=parent.toCharArray();
		
		int count=0;
		
		for(int i=1; i<c.length; i++) {
			
			if(l==1) {
				if(key==c[i]) {
					
				}
			}
			
			
			
		}
		
		
		
		
		

	}

}
