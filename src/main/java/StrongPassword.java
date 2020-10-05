import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword {

	// Complete the minimumNumber function below.
	static int minimumNumber(int n, String password) {

		int special = 0;
		int capital = 0;
		int small = 0;
		int digit = 0;

		char[] ch = password.toCharArray();

		for (int i = 0; i < n; i++) {

			if (Character.isUpperCase(ch[i])) {
				capital++;
			} else if (Character.isLowerCase(ch[i])) {
				small++;
			}

			else if (Character.isDigit(ch[i])) {
				digit++;
			} else
				special++;
		}

		int extra = 0;
		if (special > 0) {
			extra++;
		}
		if (capital >0) {
			extra++;
		}
		if (small > 0) {
			extra++;
		}
		if (digit > 0) {
			extra++;
		}

		if (n >= 6) {
			return (4-extra);

		} else {
			
			if((extra-4)+n>=6) {
				return (4-extra);
			}
			else {
				
				return (6-extra);
			}
			
		}

		

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		/*
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String password = scanner.nextLine();
		
		*/

		int answer = minimumNumber(3, "#Ha");
		System.out.println(answer);

		/*
		bufferedWriter.write(String.valueOf(answer));
		bufferedWriter.newLine();

		bufferedWriter.close(); */

		scanner.close();
	}
}
