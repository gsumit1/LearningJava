package Comparable_comparator_practice;

import java.util.ArrayList;
import java.util.Collections;

class Human implements Comparable<Human> {
	String Race;
	Human(String Race) {
		this.Race = Race;
	}
	@Override
	public int compareTo(Human o) {
		int last = this.Race.compareTo(o.Race);
		// Sorting by first name if last name is same d
		return last == 0 ? this.Race.compareTo(o.Race) : last;
	}
}

class Employee extends Human {
	String firstName;
	String lastName;
	String bookName;
	int age;
	float salary;

	Employee(String first, String last, String book, Integer age, Float salary, String race) {
		super(race);
		this.firstName = first;
		this.lastName = last;
		this.bookName = book;
		this.age = age;
		this.salary = salary;
	}

	// @Override
	public int compareTo1(Employee au) {
		int last = this.lastName.compareTo(au.lastName);
		// Sorting by first name if last name is same d
		return last == 0 ? this.firstName.compareTo(au.firstName) : last;
	}

	// @Override
	public int compareTo(Employee e) {
		if (this.age == e.age)
			return 0;
		else if (this.age > e.age)
			return 1;
		else
			return -1;
	}
}

public class Employee_comparable {
	public static void main(String args[]) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Henry", "Miller", "Tropic of Cancer", 10, 2000F, "Turks"));
		al.add(new Employee("Nalo", "Hopkinson", "Brown Girl in the Ring", 25, 1000F, "Hindi"));
		al.add(new Employee("Frank", "Miller", "300", 15, 1500F, "Bongs"));
		al.add(new Employee("Deborah", "Hopkinson", "Sky Boys", 2, 1000F, "Afgan"));
		al.add(new Employee("George R. R.", "Martin", "Song of Ice and Fire", 11, 2000F, "Hun"));
		Collections.sort(al);
		for (Employee str : al) {
			System.out.println(str.firstName + " " + str.lastName + " " + "Book: " + str.bookName + " " + str.age + " "
					+ str.Race);
		}
	}
}
