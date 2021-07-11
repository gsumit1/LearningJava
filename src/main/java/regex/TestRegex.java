package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String regex = "^[a-zA-Z][a-zA-Z0-9_].*[^_]$";
	      Pattern pattern = Pattern.compile(regex);
	      Matcher matcher = pattern.matcher("oooooooooooooooooo________a");
	      if (matcher.find()) {
	          System.out.println(matcher.group(0));
	      }

	}

}
