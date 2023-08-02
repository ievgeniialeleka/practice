package lesson_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailChecker {
    public static void main(String[] args) {
        String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)?";
        String input = "адреса электоронной почты: firstemail@gmail.com и secondemail@gmail.com";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println("email is " + m.group());
        }

        Pattern p1 = Pattern.compile("a+y");
        Matcher m1 = p1.matcher("aaaay");
        boolean b = m1.matches();
        System.out.println(b);

        Pattern p2 = Pattern.compile("\\d+\\s?");
        String[] arr = p2.split("Java3is56a 567nice000language");
        for(String tmp : arr) {
            System.out.println(tmp);
        }


    }
}
