package temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
/*
public class CountTriplets {
	public static void main(String[] args) {
		// Long[] a= {1, 3, 9, 9, 27, 81};
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(3);
		l.add(9);
		l.add(9);
		l.add(27);
		l.add(81);
		List<Long> longList = new ArrayList<Long>();
		for (Integer i : l) {
			longList.add(i.longValue());
		}
		System.out.println(countTriplets(longList, 3));
	}

	static long countTriplets(List<Long> a, long r) {
		List<ArrayList<Integer>> o = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < a.size(); i++) {
			for (int j = 1; j < a.size(); j++) {
				for (int k = 2; k < a.size(); k++) {
					ArrayList<Integer> l = new ArrayList<Integer>();
					if ((a.get(i) * r == a.get(j)) && (a.get(j) * 3 == a.get(k))) {
						l.add(i);
						l.add(j);
						l.add(k);
					}
					if (!l.isEmpty())
						o.add(l);
				}
			}

		}
		System.out.println(o);
		Integer s = o.size();
		return s.longValue();
	}
} */

class CountTriplets {
	public static void main(String[] args) {
		// Long[] a= {1, 3, 9, 9, 27, 81};
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(3);
		l.add(9);
		l.add(7);
		l.add(27);
		l.add(81);
		List<Long> longList = new ArrayList<Long>();
		for (Integer i : l) {
			longList.add(i.longValue());
		}
		countTriplets1(longList, 3);
	}

	static void countTriplets1(List<Long> a, long r) {
		HashMap<Integer, Integer> t = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) % 3 == 0) {
				int cofficent = (int) Math.round(Math.pow(a.get(i).longValue(), 1.0 / r));
				t.put(i, cofficent);
			} else {
				t.put(i, -1);
			}
		}
		
		
		for(Entry<Integer, Integer> p: t.entrySet()) {
			
			
			
		}
		
		
		

		System.out.println(t);

	}

}