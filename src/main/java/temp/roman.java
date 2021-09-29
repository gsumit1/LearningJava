package temp;

public class roman {
	public static void main(String arg[]) {

		System.out.println(getName(25));

	}

	static String getName(int i) {
		String s = "";
		
		if (i == 0)
			return s;
		
		if (i >= 20) {
			if (i/10==2) {
				s = s + "XX";
				i = i - 20;
				getName(i);
			}
		}
		if (i == 5) {
			s = s + "V";
			i = i - 5;
			getName(i);
		}

		return s;
	}

}
