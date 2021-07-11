package Practice;

import javax.xml.stream.events.Characters;

public class camelCase {
	public static void main(String arg[]) {
		String s = "iAmDone";
		char[] c = s.toCharArray();
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (Character.isUpperCase(c[i])) {
				count++;
			}
		}
		System.out.println(count);
	}

}

class myTest {
	public static void main(String arg[]) {

		String s = "iAmSumit";

		char[] a = s.toCharArray();
		int count = 0;

		for (char i : a) {

			if (Character.isUpperCase(i)) {

				count++;
			}

		}
		System.out.println(count);

	}
}