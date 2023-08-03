package lesson5;

public class PrimeNumberChecker {
    public static boolean validate(int number) {
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
