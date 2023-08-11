package com.itvdn.general;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokingMethodByName {

    int a;
    int b;

    public void setNumber(int a) {
        this.a = a;
    }

    public int getNumber() {
        return a;
    }

    public int getSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        InvokingMethodByName inv1 = new InvokingMethodByName();
        Class<?> cl = inv1.getClass();
        Class<?>[] paramTypes = new Class<?>[] {
                int.class
        };

        try {
            Method method = cl.getMethod("setNumber", paramTypes);
            Object[] arguments = new Object[] {5};
            method.invoke(inv1, arguments);
            System.out.println(inv1.getNumber());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Class<?>[] paramTypes2 = new Class<?>[] {
                int.class,
                int.class
        };

        try {
            Method method2 = cl.getMethod("getSum", paramTypes2);
            Object[] arguments2 = new Object[] {3,5};
            int result = (Integer)method2.invoke(inv1, arguments2);
            System.out.println(result);

        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
