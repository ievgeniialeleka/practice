package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {

    public static void validateLogin() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your login: ");

        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(br.readLine());

        if (m.matches()) {
            System.out.println("Your login has been saved");
        } else {
            System.out.println("Error! Login must contain only latin letters.");
            System.out.println("Try again");
            validateLogin();
        }
    }

    public static void validatePassword() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your password: ");

        Pattern p = Pattern.compile("[a-zA-Z]+[0-9]+");
        Matcher m = p.matcher(br.readLine());

        if (m.matches()) {
            System.out.println("Your password has been saved");
        } else {
            System.out.println("Error! Password must contain latin symbols and digits.");
            System.out.println("Try again");
            validatePassword();
        }
    }

    public static void main(String[] args) throws IOException {

        validateLogin();
        validatePassword();


    }
}
