package lesson_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneChecker {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\+[1-9]\\d{2}\\(\\d{2}\\)(\\d{2}-){2}\\d{3}");
        Matcher m = p.matcher("+380(67)12-34-567");
        boolean b = m.matches();
        System.out.println(b);
    }
}
