package temp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.emory.mathcs.backport.java.util.Arrays;

public class Alternating {

	public static void main(String[] args) {

		String s = "ABABABAB";

		char[] p = s.toCharArray();

		int count = 0;
		for (int i = 0; i <= p.length; i++) {

			try {
				System.out.print( p[i]+"     " +p[i+1]);
				System.out.print("\n");
				if (p[i] == p[i + 1]) {
					count++;
					//i++;
				} 
			} catch (Exception e) {
			}
		}

		System.out.println(count);

		// System.out.println(get(p,0,0));
	}



}
