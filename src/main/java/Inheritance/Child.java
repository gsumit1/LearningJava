package Inheritance;

public class Child extends Parent {
	Child(int i, float f) {
		super(i, f);
	}
	public int method(String p) {
		return Integer.parseInt(p);
	}
	public static void main(String[] args) {
		Child c = new Child(1, 1.5F);	
		Parent p=new Child(1, 1.5F);
		
		Parent cp = new Parent(1, 1.5F);	
		
		
		c.method();
		c.method(12);
		System.out.println(p.method("12"));
	}
}

class Parent {
	int i;
	float f;
	Parent(int a, float b) {
		i = a;
		f = b;
	}
	void method() {
		System.out.println(i+f);
	}
	public void method(float p) {
		System.out.println(f);
	}
	public void method(int p) {
		System.out.println(i);
	}
	public int method(String p) {
		return Integer.parseInt(p) + 4;
	}
	protected void myMethod(int p) {
		System.out.println(p);
	}
}
