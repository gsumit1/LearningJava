package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>();
		int i = 0;
		while (i < 10) {
			a.add(i);
			i++;
		}

		Iterator<Integer> l = a.iterator();
		while (l.hasNext()) {
			System.out.println(l.next());
		}

	}

}
