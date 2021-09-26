package Practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
class Result {

	public static long repeatedString(String s, long n) {

		int count = 0, rem = 0;

		for (char i : s.toCharArray()) {
			if (i == 'a') {
				count++;
			}
		}

		long l = n / s.length();

		long r = n % s.length();

		for (int j = 0; j < r; j++) {
			if (s.toCharArray()[j] == 'a') {
				rem++;
			}
		}

		return l * count + rem;

	}

}*/

public class repearedString {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		long n = Long.parseLong(bufferedReader.readLine().trim());

		//long result = Result.repeatedString(s, n);

		//bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
