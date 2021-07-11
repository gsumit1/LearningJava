package exceptions;
/*
class Super {
	void show() {
		System.out.println("parent class");
	}
}

public class Overriding extends Super {
	void show() throws ArrayIndexOutOfBoundsException {
		System.out.println("parent class");
	}
	public static void main(String[] args) {
		Super s = new Overriding();
		s.show();
	}
}



class Excep {
	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2 };
			arr[2] = 3 / 0;
		} catch (Exception e) // This block handles all Exception
		{
			System.out.println("Generic exception");
		} 
	}
}
*/
class MyException extends Exception {
	private int ex;

	MyException(int a) {
		ex = a;
	}

	public String toString() {
		return "MyException[" + ex + "] is less than zero";
	}
}

class Demo {
	static void sum(int a, int b) throws MyException {
		if (a < 0) {
			throw new MyException(a); // calling constructor of user-defined exception class
		} else {
			System.out.println(a + b);
		}
	}

	public static void main(String[] args) {
		try {
			sum(-10, 10);
		} catch (MyException me) {
			System.out.println(me); // it calls the toString() method of user-defined Exception
		}
	}
}