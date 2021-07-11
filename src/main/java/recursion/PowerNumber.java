package recursion;

public class PowerNumber {

	public static void main(String[] args) {
		

		System.out.println(power(4, 3));
	}

	static Integer power(Integer base, Integer power) {

		if (power != 0) {

			return base * power(base, power - 1);

		}

		return 1;
	}

}

