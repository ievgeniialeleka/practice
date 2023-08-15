package homework.task2.implementation;

import homework.task2.annotations.CalculatorAnnotation;
import homework.task2.handlers.CalculatorHandler;

import java.lang.reflect.Method;

/**
 * @author Eve Leleka
 */

public class Main {

    public static void main(String[] args) {

        int result = 0;
        CalculatorHandler calculatorHandler = new CalculatorHandler();
        Class<?> cl = CalculatorHandler.class;

            try {
                Method method1 = cl.getDeclaredMethod("getSum", int.class, int.class);
                CalculatorAnnotation annotation1 = method1.getDeclaredAnnotation(CalculatorAnnotation.class);
                result = calculatorHandler.getSum(annotation1.num1(), annotation1.num2());
                System.out.println("Addition result: " + result);

                Method method2 = cl.getDeclaredMethod("getDiff", int.class, int.class);
                CalculatorAnnotation annotation2 = method2.getDeclaredAnnotation(CalculatorAnnotation.class);
                result = calculatorHandler.getDiff(annotation2.num1(), annotation2.num2());
                System.out.println("Subtraction result: " + result);

                Method method3 = cl.getDeclaredMethod("getProduct", int.class, int.class);
                CalculatorAnnotation annotation3 = method3.getDeclaredAnnotation(CalculatorAnnotation.class);
                result = calculatorHandler.getProduct(annotation3.num1(), annotation3.num2());
                System.out.println("Multiplication result: " + result);

                Method method4 = cl.getDeclaredMethod("getQuotient", int.class, int.class);
                CalculatorAnnotation annotation4 = method4.getDeclaredAnnotation(CalculatorAnnotation.class);
                result = calculatorHandler.getQuotient(annotation4.num1(), annotation4.num2());
                System.out.println("Division result " + result);

            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }



    }
}
