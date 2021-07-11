package Practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DivisibleSum {

	// Complete the divisibleSumPairs function below.
	static int divisibleSumPairs(int n, int k, int[] a) {
		System.out.println("h");
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (((a[i] + a[j]) % k) == 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {

		int[] a = { 1, 3, 2, 6, 1, 2 };

		int result = divisibleSumPairs(6, 3, a);
		System.out.println(result);

	}
}
