import java.io.*;
import java.util.*;

public class CamelCase {

	// Complete the camelcase function below.
	static int camelcaseDetect(String s) {

		char[] a = s.toCharArray();
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			if (Character.isUpperCase(a[i])) {
				count++;
			}
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		int result = camelcaseDetect(s);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedWriter.close();

		scanner.close();
	}
}
