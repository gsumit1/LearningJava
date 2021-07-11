package Practice;

import java.util.Arrays;

public class MinMax {

	public static void main(String[] args) {
		Integer[] a = { 396285104, 573261094, 759641832, 819230764, 364801279 };
		Arrays.sort(a);
		long min = 0;
		for (int a1 : Arrays.copyOfRange(a, 0, 4)) {
			min = min + a1;
		}
		System.out.println("min "+min);

		
		long max = 0;
		for (int a2 : Arrays.copyOfRange(a, 1, 5)) {
			max = max + a2;
		}
		System.out.println("min "+max);
	}

}
