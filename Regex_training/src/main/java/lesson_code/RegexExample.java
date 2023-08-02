package lesson_code;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a+y");
        Matcher m = p.matcher("aaay");
        boolean b = m.matches();
        System.out.println(b);

    }
}
