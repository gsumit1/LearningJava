import java.io.*;
import java.util.*;

class Result {
	@SuppressWarnings("null")
	public static Integer pickingNumbers(List<Integer> l) {

		Integer[] items = new Integer[l.size()];
		items = l.toArray(items);

		// Write your code here
		// int[] b = { 1, 2, 2, 1, 12, 17 };

		// System.out.println(Arrays.toString(getPartition(b, 0, 5)));

		Integer[] s = getPartition(items, 0, items.length - 1);

		@SuppressWarnings("unchecked")
		Map<Integer, Integer> temp = new LinkedHashMap();

		for (int a : s) {
			temp.put(a, 0);
		}

		for (int i : temp.keySet()) {
			int u = 0;
			for (int p : s) {
				if (i == p) {
					u++;
				}
			}
			temp.put(i, u);
		}
		List<Integer> c = new ArrayList<Integer>();
		List<Integer> p = new ArrayList<Integer>(temp.keySet());
		for (int j = 0; j < p.size(); j++) {
			int key = p.get(j);
			int value = temp.get(key);
			c.add(value);
		}
		for (int j = 0; j < p.size() - 1; j++) {		
			if (p.get(j + 1) - p.get(j) == 1) {
				int key = p.get(j);
				int key1 = p.get(j + 1);
				int value1 = temp.get(key);
				int value2 = temp.get(key1);
				int t = value1 + value2;
				c.add(t);
			}
		}

		System.out.println(c);

		return Collections.max(c);

	}

	static Integer[] getPartition(Integer[] a, int start, int end) {
		int i = start;
		int j = end;
		int pivot = a[start];
		while (i < j) {

			while (a[i] <= pivot) {

				if (i == end) {
					break;
				}
				i++;
			}

			while (a[j] >= pivot) {

				if (j == start) {
					break;
				}
				j--;
			}

			if (i < j) {
				swap(a, i, j);
				i++;
				j--;
			}
		}
		swap(a, start, j);
		if (start < j) {
			getPartition(a, start, j);
		}
		if (end > i) {
			getPartition(a, i, end);
		}
		return a;
	}

	static void swap(Integer[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static int pickingNumbers1(List<Integer> a) {
		int frequency[] = new int[101];
		int result = Integer.MIN_VALUE;

		for (int i = 0; i < a.size(); i++) {
			int index=a.get(i);
			frequency[index]++; //frequency[index]=frequency[index]+1
		}
		
		System.out.println(frequency);

		for (int i = 1; i <= 100; i++) {
			result = Math.max(result, frequency[i] + frequency[i - 1]);
		}
		return result;

	}

}



public class PickingNumbers {
	public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * int n = Integer.parseInt(bufferedReader.readLine().trim());
		 * 
		 * String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$",
		 * "").split(" ");
		 * 
		 * List<Integer> a = new ArrayList<>();
		 * 
		 * for (int i = 0; i < n; i++) { int aItem = Integer.parseInt(aTemp[i]);
		 * a.add(aItem); }
		 */

		// Result.pickingNumbers();
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(6);
		a.add(6);
		a.add(6);
		a.add(6);
		a.add(6);
		a.add(6);
		a.add(6);
		a.add(6);
		a.add(6);
		a.add(6);
		a.add(6);

		int result = Result.pickingNumbers1(a);
		System.out.println(result);

		// bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();

		// bufferedReader.close(); bufferedWriter.close();

	}

}
