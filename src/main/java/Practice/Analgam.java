package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Analgam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = { "abc", "bca", "cab", "bbb", "aba", "baa", "ddd" };
		List<String> temp = Arrays.asList(a);
		System.out.println(groupAnagramsCategorizeBySorting(a));
	}

	public static List<List<String>> groupAnagramsCategorizeBySorting(String[] strs) {

		if (strs == null || strs.length == 0)
			return new ArrayList<>();

		Map<String, List<String>> stringAnagramsMap = new HashMap<>();
		for (String s : strs) {
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			String key = String.valueOf(arr);

			if (!stringAnagramsMap.containsKey(key))
				stringAnagramsMap.put(key, new ArrayList<>());

			stringAnagramsMap.get(key).add(s);
		}

		List<List<String>> resultList = new ArrayList<>();
		for (Map.Entry<String, List<String>> stringAnagrams : stringAnagramsMap.entrySet()) {
			resultList.add(stringAnagrams.getValue());
		}
		return resultList;
	}
}

class MyAnalgam {
	public static void main(String arg[]) {

		String[] a = { "abc", "bca", "cab", "bbb", "aba", "baa" };
		List<String> temp = Arrays.asList(a);
		Map<String, ArrayList<String>> data = new HashMap<String, ArrayList<String>>();
		for (String s : temp) {
			char[] t = s.toCharArray();
			Arrays.sort(t);
			String key = String.valueOf(t);

			if (!data.containsKey(key)) {
				data.put(key, new ArrayList<String>());
			}

			data.get(key).add(s);
		}
		Iterator<Map.Entry<String, ArrayList<String>>> getValues = data.entrySet().iterator();
		while (getValues.hasNext()) {
			Entry<String, ArrayList<String>> x = (Entry<String, ArrayList<String>>) getValues.next();
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
	}
}
