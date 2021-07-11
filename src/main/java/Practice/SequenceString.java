package Practice;

public class SequenceString {

	public static void main(String[] args) {
		String r = "rrrrrrsssttttttrrrrrr";
		char[] s = r.toCharArray();
		String p ="";
		for (int i = 0; i < s.length; i++) {

			if (s[i] == 'r') {
				p=p+s[i];
			}

		}
		for (int i = 0; i < s.length; i++) {

			if (s[i] == 's') {
				p=p+s[i];
			}

		}
		for (int i = 0; i < s.length; i++) {

			if (s[i] == 't') {
				p=p+s[i];
			}

		}
		System.out.println(p);
	}

}
