package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		List<String> myArray = new ArrayList<String>();
		myArray.add("Sumit");
		myArray.add("Raja");
		List<String> myArray1 = new ArrayList<String>();
		myArray1.add("Piyali");
		myArray1.add("Guddu");

		/* Methods */
		System.out.println(myArray.get(0));
		System.out.println(myArray.contains("Sumit"));
		System.out.println(myArray.indexOf("Raja"));
		System.out.println(myArray.isEmpty());
		System.out.println(myArray.addAll(myArray1));
		System.out.println(myArray);
		// myArray.clear();
		System.out.println(myArray.size());
		myArray.set(3, "we");
		System.out.println(myArray);
		

		/* Cursor */
		Iterator<String> a = myArray.iterator();
		while (a.hasNext()) {
			System.out.println(a.next());
		}

		/* Linked List */
		LinkedList<String> l = new LinkedList<String>(myArray);
		l.addLast("nana");
		System.out.println(l);
		System.out.println(l.getLast());

		Iterator<String> x = myArray1.iterator();
		while (x.hasNext()) {
			System.out.println(x.next());
		}
		
		List<ArrayList<String>> list=new ArrayList<ArrayList<String>>();

	}

}
