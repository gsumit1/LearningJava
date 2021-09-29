package temp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p=Pattern.compile("rt");
		Matcher m=p.matcher("rtrtrtrt");
		int c=0;
		while(m.find()) {
			c++;
		}
		System.out.println(c);
	}

}
