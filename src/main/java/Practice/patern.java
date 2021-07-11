package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patern {
public static void main(String[] args) {
	String s="rtrtrtrt";
	Pattern p=Pattern.compile("rt");
	Matcher m=p.matcher(s);
	
	
	int i=0;
	while(m.find()) {
		i++;
		
	} 
	System.out.println(i);
}
}
