package Practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result2 {

	/*
	 * Complete the 'twoStrings' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. STRING s1 2. STRING s2
	 */

	public static String twoStrings(String s1, String s2) {

		Set<Character> p = new HashSet<Character>();
		Set<Character> q = new HashSet<Character>();

		for (char a : s1.toCharArray()) {
			p.add(a);
		}

		for (char b : s2.toCharArray()) {
			q.add(b);
		}

		boolean w = p.retainAll(q);
		
		
		
		System.out.println(p);
		System.out.println(q);

		if (p.isEmpty()) {
			return "NO";
		}

		return "Yes";
		// Write your code here

	}

}

public class RepeatedString {
	public static void main(String[] args) throws IOException {

		String result = Result2.twoStrings("hello", "world");
		System.out.println(result);

	}
}
