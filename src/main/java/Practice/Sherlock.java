package Practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

	/*
	 * Complete the 'isValid' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */

	public static String isValid(String s) {
		
		
		Map<Integer, HashSet<Character>> temp = new TreeMap<Integer, HashSet<Character>>();

		List<Character> charList = new ArrayList<Character>();

		for (char c : s.toCharArray()) {
			charList.add(c);
		}

		for (char c : charList) {

			Integer fre = Collections.frequency(charList, c);

			if (!temp.containsKey(fre)) {
				temp.put(fre, new HashSet<Character>());
			}

			temp.get(fre).add(c);
		}

		System.out.println(temp);
		Iterator<Map.Entry<Integer, HashSet<Character>>> it = temp.entrySet().iterator();
		String flag = "YES";

		while (it.hasNext()) {

			Entry<Integer, HashSet<Character>> p = it.next();

			if (p.getKey() % 2 > 0) {
				
				
				if(p.getValue().size()==1) {
					flag="YES";
				}

				if (p.getValue().size()> 1) {
					//if(p.getValue().size()%2  1)
					flag = "NO";
					break;
				}
			}
		}

		// ||(it.next().getValue().size()%2==0))
		System.out.println(flag);
		return flag;
		// Write your code here

	}

}

public class Sherlock {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		// String s = bufferedReader.readLine();
		String s = "ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd";
		String result = Result.isValid(s);

		// bufferedWriter.write(result);
		// bufferedWriter.newLine();

		// bufferedReader.close();
		// bufferedWriter.close();
	}
}
