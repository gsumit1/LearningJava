package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BDayCandle_List {

	public static void main(String[] args) {
		List<Integer> a= new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(5);
		a.add(4);
		a.add(3);
		
		Collections.sort(a);
		
		int maxInt = a.get(a.size() - 1);

		int count = 0;
		for (int i = a.size()-1; i >= 0; i--) {

			if (a.get(i) == maxInt) {
				count++;
			} else
				break;
		}
		System.out.println(count);
		
		

	}

}
