package temp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import edu.emory.mathcs.backport.java.util.Arrays;

public class analgam {

	public static void main(String[] args) {
		String[] a = { "abc", "bca", "cab", "bbb", "aba", "baa", "ddd" };
		List<String> x = Arrays.asList(a);
		HashMap<String, List<String>> t = new HashMap<String, List<String>>();
		for (String s : x) {
			char[] u = s.toCharArray();
			Arrays.sort(u);

			String p = String.valueOf(u);

			if (!t.containsKey(p)) {
				t.put(p, new ArrayList<String>());
			}
			t.get(p).add(s);
		}
		for(Map.Entry<String, List<String>> r: t.entrySet()) {
			System.out.println(r.getValue());
		}

	}
	
	
	

}
