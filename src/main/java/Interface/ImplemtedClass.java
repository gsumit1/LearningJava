package Interface;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImplemtedClass extends MyClass {
	
	public static void main(String arg[]) {
		System.out.println(i);
		
		
		Pattern p=Pattern.compile("m");
		Matcher m=p.matcher("asdadasdasdmmsdadasda");
		int c=0;
		while(m.find()) {
			c++;
			
		}
		System.out.println(c);
		
	}

	@Override
	String myDetails2(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
