package temp;

public class RecursiveDigitSum {

	public static void main(String[] args) {
		//long value = superDigit("4757362", 10000);

		// long p=getValue(value);
		
		
		//System.out.println((int) getValue(4757362));
		
		
		//System.out.println(getValue(236597883164949013647557503887777957581322677585182091237081212450264153894792080839770354971367849468392849771243717614028258935027765347922552060281345643327741736668042619863368189118434875700729290740916035));
		
		

	}

	private static double getValue(double v) {

		if (v < 10) {
			return v;
		}

		char[] a = String.valueOf(v).toCharArray();
		int sum = 0;
		for (char i : a) {
			sum = sum + Character.getNumericValue(i);
		}

		
		return getValue(sum);
	}

	


	public static long superDigit(String n, int k) {
		String temp = "";
		int n1 = 0;
		while (n1 < k) {

			temp = temp + n;
			n1++;
		}
		return Long.parseLong(temp);

	}

}
