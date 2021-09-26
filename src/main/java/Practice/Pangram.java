package Practice;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {

		String s = "We promptly judged antique ivory buckles for the prize999 !@#$%%";

		char[] s1 = s.replaceAll("[^A-Za-z]", "").toLowerCase().toCharArray();

		Set<Character> ch = new HashSet<Character>();

		for (char p : s1) {
			ch.add(p);

		}
		
		if(ch.size()==26) {System.out.println("pangram");}
		
		

	}

}
