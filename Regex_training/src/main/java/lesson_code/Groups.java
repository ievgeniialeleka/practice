package lesson_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {

    public static void myMatches(String regex, String input) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);

        if(m.matches()) {
            System.out.println("First group: " + m.group(1));
            System.out.println("Second group: " + m.group(2));
        } else {
            System.out.println("Nothing");
        }
    }

    public static void main(String[] args) {
        //первая группа - наибольшее количество символов, но при этом остается минимальное количество для второй группы
        myMatches("([a-z]*)([a-z]+)", "abcdxyz");

        //первая группа - наименьшее количество, вторая - все остальное
        myMatches("([a-z]?)([a-z]+)", "abcdxyz");

        //первой группе - все, второй - ничего, потому что первая от 1 до n, а вторая от 0 до n
        myMatches("([a-z]+)([a-z]*)", "abcdxyz");

        //строка не соответствует регулярному выражению, потому что по одному символу из группы
        myMatches("([a-z]?)([a-z]?)", "abcdxyz");
    }
}
