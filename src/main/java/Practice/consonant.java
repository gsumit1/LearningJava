package Practice;

import java.util.Arrays;
import java.util.List;

public class consonant {

	public static void main(String[] args) {
		Character[] vowel= {'a','e','i','u','o','A','E','I','U','O'};		
		List<Character> ls=Arrays.asList(vowel);		
		String s="My name is Sumit";		
		StringBuffer sb=new StringBuffer(s);				
		for(int i=0; i<sb.length();i++) {
			if(ls.contains(sb.charAt(i))) {
				sb.replace(i, i+1, "");
			}
		}
		System.out.println(sb);
	}

}
