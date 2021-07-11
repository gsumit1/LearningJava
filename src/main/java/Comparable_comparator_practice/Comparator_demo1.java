package Comparable_comparator_practice;

import java.util.*;

//A class to represent a Student1. 
class Student1 {
	int rollno;
	String name, address;

	public Student1(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	String getName(){
		return this.name;
		
	}
	

	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

class Sortbyroll11 implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.rollno-o2.rollno;
	}
	
}

class Sortbyname1 implements Comparator<Student1> {
	@Override
	public int compare(Student1 a, Student1 b) {
		return a.name.compareTo(b.name);
	}

}


public class Comparator_demo1 {

	public static void main(String[] args) {
		ArrayList<Student1> ar = new ArrayList<Student1>();
		ar.add(new Student1(111, "bbbb", "london"));
		ar.add(new Student1(131, "aaaa", "nyc"));
		ar.add(new Student1(121, "cccc", "jaipur"));
		
		Comparator<Student1> cm1=Comparator.comparing(Student1::getName); 
		Collections.sort(ar,cm1);  
		
		System.out.println("Unsorted");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyroll11());

		System.out.println("\nSorted by rollno");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyname1());

		System.out.println("\nSorted by name");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
	}
}
