package StaticBlock;

public class StaticBlock {

	static int m = 10;

	static {
		m = 12;
		System.out.println(m);
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		StaticBlock sb = new StaticBlock();
		System.out.println(sb.m);
	}

}
