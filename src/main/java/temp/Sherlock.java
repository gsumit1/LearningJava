package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sherlock {

	public static void main(String arg[]) {

		String s = "KKKK";

		HashMap<String, Integer> f = new HashMap<String, Integer>();
		int pair = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				try {
					StringBuffer t = new StringBuffer(s.substring(j, j + i));
					char[] p = t.toString().toCharArray();
					Arrays.sort(p);
					String ss = String.valueOf(p).toString();
					if (!f.containsKey(ss)) {
						if (!t.toString().isEmpty())
							f.put(ss, 0);
					}
					int count = f.get(ss) + 1;
					f.put(ss, count);
				} catch (Exception e) {
				}
			}
		}
		for (Entry<String, Integer> v : f.entrySet()) {
			pair = pair + v.getValue() * (v.getValue() - 1) / 2;
		}
	}
}
