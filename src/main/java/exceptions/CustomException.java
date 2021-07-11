package exceptions;

public class CustomException {

	static ArithmeticException e;

	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("not  valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {

		// ArithmeticException e=new ArithmeticException();
		// throw e;

		try {
			validate(13);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		System.out.println("rest of the code...");
	}

}

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}
}
