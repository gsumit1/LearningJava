package Practice;

import java.util.Arrays;
/*
public class BDayCandle_Array {
	public static void main(String[] args) {
		Integer[] a = { 4, 4, 2, 1, 5, 5 };
		Arrays.sort(a);
		int maxInt = a[a.length - 1];

		int count = 0;
		for (int i = a.length-1; i >= 0; i--) {

			if (a[i] == maxInt) {
				count++;
			} else
				break;
		}
		System.out.println(count);
	}
} */

public class bdayCandle {
	public static void main(String arg[]) {

		Integer[] a = { 5, 5, 5, 5, 4, 4, 4, 4, 3, 1, 6, 6, 6, 6, 6 };
		Arrays.sort(a);

		int max = a[a.length - 1];
		int count = 0;

		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == max) {
				count++;
			} else
				break;
		}
		System.out.println(count);

	}

}
