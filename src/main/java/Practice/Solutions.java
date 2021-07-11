package Practice;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solutions {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {

		String[] a = s.split(":");
		Pattern p = Pattern.compile("PM");
		Matcher pm = p.matcher(s);

		String m = "";

		if (pm.find()) {

			if (Integer.parseInt(a[0]) < 12) {

				Integer h = Integer.parseInt(a[0]) + 12;

				System.out.println(h.toString() + ":" + a[1] + ":" + a[2].substring(0, 2));

				m = h.toString() + ":" + a[1] + ":" + a[2].substring(0, 2);
			} else {
				Integer h = Integer.parseInt(a[0]);

				System.out.println(h.toString() + ":" + a[1] + ":" + a[2].substring(0, 2));

				m = h.toString() + ":" + a[1] + ":" + a[2].substring(0, 2);
			}

		} else {
			if (Integer.parseInt(a[0]) == 12) {

				String h = "00";

				System.out.println(h.toString() + ":" + a[1] + ":" + a[2].substring(0, 2));

				m = h + ":" + a[1] + ":" + a[2].substring(0, 2);
			}
			else {
				Integer h = Integer.parseInt(a[0]);

				System.out.println(h.toString() + ":" + a[1] + ":" + a[2].substring(0, 2));

				m = "0"+h.toString() + ":" + a[1] + ":" + a[2].substring(0, 2);
			}
		}

		return m;

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bw = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		// String s = scan.nextLine();

		String result = timeConversion("06:40:03AM");

		// bw.write(result);
		// bw.newLine();

		// bw.close();
	}
}
