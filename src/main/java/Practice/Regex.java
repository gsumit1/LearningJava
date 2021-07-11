package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("rt");
		Matcher m=p.matcher("rtgrtgrtg");
		int c=0;
		while(m.find()) {c++;}
		System.out.println(c);
	}

}





class PatternClass {
	public static void main(String[] arg ) {
		
		Pattern p= Pattern.compile("rgrgrgrgrg");
		Matcher m=p.matcher("rg");
		int c=0;
		while(m.find()) {
			c++;
		}
		System.out.println(c);
	}
}
