import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SalesbyMatch {

	static void sockMerchant(int n, int[] a) {	
		Map<Integer,Integer> t=new HashMap();
		for (int b: a) {
			t.put(b, 0);
		}
		int s=0;
		for(int j:t.keySet()) {
			int u=0;
			for(int p: a) {
				if(j==p) {
					u++;
				} 
			}
			s=s+u/2;
		}
		System.out.println(s);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
/*
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}
*/
		
		int n=9;
		int ar[]= {10, 10, 11, 12, 13, 11, 12, 15, 13};
		//int result = 
		sockMerchant(n, ar);
//System.out.println(result);
		//bufferedWriter.write(String.valueOf(result));
		//bufferedWriter.newLine();

		//bufferedWriter.close();

		scanner.close();
	}
}
