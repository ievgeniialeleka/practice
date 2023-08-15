package homework.task2.handlers;

import homework.task2.annotations.CalculatorAnnotation;

/**
 * @author Eve Leleka
 */

public class CalculatorHandler {

    /**
     * calculates sum of two numbers
     * @param num1 first number
     * @param num2 second number
     */
    @CalculatorAnnotation(num1 = 7, num2 = 13)
    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * calculates difference between two numbers
     * @param num1 first number
     * @param num2 second number
     */
    @CalculatorAnnotation(num1 = 18, num2 = 8)
    public int getDiff(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * calculates product of two numbers
     * @param num1 first number
     * @param num2 second number
     */
    @CalculatorAnnotation(num1 = 5, num2 = 10)
    public int getProduct(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * calculates quotuient of two numbers
     * @param num1 first number
     * @param num2 second number
     */
    @CalculatorAnnotation(num1 = 36, num2 = 2)
        public int getQuotient(int num1, int num2) {
            return num1 / num2;
        }
    }



