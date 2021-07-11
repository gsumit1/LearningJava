package String;

public class Practice {
	public static void main(String[] args) {
		/*String methods*/
		String s="Sumit ghosh";
		System.out.println(s.charAt(1));
		System.out.println(s.lastIndexOf("h"));
		System.out.println(s.concat(" ghosh"));
		System.out.println(s.contentEquals("Sumit ghosh"));
		System.out.println(s.indexOf("ghosh"));
		System.out.println(s.length());
		System.out.println(s.matches("ghosh"));
		System.out.println(s.toCharArray());
		char[] c=s.toCharArray();
		System.out.println(c[2]);
		System.out.println(s.substring(3, 7));		
		String[] b=s.split(" ");
		System.out.println(b[0]);
		System.out.println(s.toUpperCase());
		
		
		String s1="Hello"+new String("my");
		s1+="winder";
		s1.concat("me");
		
		System.out.println(s1);
		
		
		/*String buffer*/
		StringBuffer m=new StringBuffer(s);
		System.out.println(m.reverse());
		System.out.println(m.delete(3, 5));
		System.out.println(m.append("tttt"));
		
		/*String Builder*/
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
		
		
	}

}
