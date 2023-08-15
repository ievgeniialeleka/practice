package homework.addtask.implementation;

import homework.addtask.annotations.RepeatableAnno;

import java.lang.reflect.Method;

public class Main {
    @RepeatableAnno(num1 = 50)
    @RepeatableAnno(num2 = 100)
    public void mathSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Main m = new Main();
        Class<?> cl = m.getClass();
        Method method = cl.getDeclaredMethod("mathSum", int.class, int.class);
        RepeatableAnno[] annos = method.getDeclaredAnnotationsByType(RepeatableAnno.class);
        int num1 = annos[0].num1();
        int num2 = annos[1].num2();
        m.mathSum(num1, num2);
    }
}

