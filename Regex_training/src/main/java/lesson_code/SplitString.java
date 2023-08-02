package lesson_code;

public class SplitString {
    public static void main(String[] args) {
        String str = "Karaf provides enterprise ready features: shell console, remote access, hot deployment, " +
                "dynamic configuration and many more. Karaf projects provide additional features like clustering, " +
                "complete monitoring and alerting, application repository.";

        String[] split = str.split("\\.");
        for(String tmp: split) {
            System.out.println(tmp);
        }

    }
}
