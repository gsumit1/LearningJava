package Practice;
import java.util.regex.*;

class MatchSequence {
    public static void main(String[] args) {
        String hello = "HelloxxxHelloxxxHello";
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(hello);

        int count = 0;
        while (matcher.find())
            count++;

        System.out.println(count);    // prints 3
    }
}

class MatchSequence1 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("su");
        Matcher m=p.matcher("sumitsumitsumit");
        
        int c=0;
        while(m.find()) {
        	c++;
        }
        System.out.println(c);
        
    }
}