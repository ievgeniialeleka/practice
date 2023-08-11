package com.itvdn.general;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreatingNewObject {

    String a;
    int b;

    public CreatingNewObject() {}

    public CreatingNewObject(String a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "CreatingNewObject{" +
                "a='" + a + '\'' +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> cl = CreatingNewObject.class;
        Class<?>[] paramTypes = new Class<?>[] {
              java.lang.String.class,
              int.class
        };
        Constructor<?> ctr = cl.getConstructor(paramTypes);
        CreatingNewObject newObj = (CreatingNewObject) ctr.newInstance("String", 4);
        System.out.println(newObj.toString());

    }
}
