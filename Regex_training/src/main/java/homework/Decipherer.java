package homework;

public class Decipherer {

    public static String deciphe(String input) {
        String regex = "\\b(?:in|on|under|by|from|to|with|for|at|of|over|into|before|after|above|below|between)\\b";
        String result = input.replaceAll(regex, "JAVA");
        return result;
    }
    public static void main(String[] args) {

        String input = "Karaf is a lightweight, powerful, and enterprise ready modulith runtime. " +
                "It provides all the ecosystem and bootstrapping options you need for your applications. " +
                "It runs on premise or on cloud. This modulith runtime supports several frameworks and different " +
                "kind of applications: REST/API, Web, Spring Boot, and much more.";

        System.out.println(deciphe(input));
    }
}
