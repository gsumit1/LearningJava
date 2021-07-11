package Practice;

import java.util.HashMap;
import java.util.Map;

public class PairShoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[] = { 2, 2, 2, 6, 7, 3, 9, 6, 8 };
		Map<Integer, Integer> a = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			for (int k = 0; k < c.length; k++) {
				if (c[i] == c[k]) {
					count++;
				}
			}

			if (!a.containsKey(c[i]) && ((count/2)>0)) {
				a.put(c[i], count/2);
			}
			count = 0;
		}

		System.out.println(a);

	}

}
