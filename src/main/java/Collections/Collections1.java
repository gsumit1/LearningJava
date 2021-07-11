package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myArray = new ArrayList<String>();
		myArray.add("Sumit");
		myArray.add("Raja");

		System.out.println(Collections.max(myArray));

		Collections.reverse(myArray);
		System.out.println(myArray);
		Collections.sort(myArray);
		System.out.println(myArray);

		String[] a = { "sumit", "raja", "guddu" };

		Integer[] no = { 1, 2, 3, 4, 5, 6, 7, 8 };

		List<Integer> i = Arrays.asList(no);

		System.out.println(i);
		List<String> myArray1 = Arrays.asList(a);
		System.out.println(myArray1);

		Arrays.sort(a);

		System.out.println(a[0]);

	}

}
