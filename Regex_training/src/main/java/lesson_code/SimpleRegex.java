package lesson_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleRegex {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[а-я]+", Pattern.CASE_INSENSITIVE| Pattern.UNICODE_CASE);
        Matcher m = p.matcher("Привет");

//        Pattern p = Pattern.compile("[a-z&&[^d]]+");
//        Matcher m = p.matcher("abcd");

//        Pattern p = Pattern.compile("[a-zA-Z]+\\s*[a-zA-Z]+");
//        Matcher m = p.matcher("Hello World");
        boolean b = m.matches();
        System.out.println(b);
    }
}
