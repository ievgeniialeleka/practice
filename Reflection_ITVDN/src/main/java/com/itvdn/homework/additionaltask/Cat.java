package com.itvdn.homework.additionaltask;

import java.lang.reflect.Field;
import java.util.logging.Logger;

public class Cat {

    public static final Logger LOG = Logger.getLogger("LOGGER");

    public static String changeNameFieldUsingReflection(Object ob, String newName) {
        Class<?> cl = ob.getClass();
        try {
            Field field = cl.getDeclaredField("name");
            field.setAccessible(true);
            field.set(ob, newName);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOG.info(e.getMessage());
        }
        return cl.getName();
    }

    public static int changeAgeFieldUsingReflection(Object ob, int newAge) {
        Class<?> cl = ob.getClass();
        int result = 0;
        try {
            Field field = cl.getDeclaredField("age");
            field.setAccessible(true);
            field.setInt(ob, newAge);
            result = field.getInt(ob);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOG.info(e.getMessage());
        }
        return result;
    }

    public static boolean changeTailFieldUsingReflection(Object ob, boolean newTail) {
        Class<?> cl = ob.getClass();
        boolean result = true;
        try {
            Field field = cl.getDeclaredField("tail");
            field.setAccessible(true);
            field.setBoolean(ob, newTail);
            result = field.getBoolean(ob);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOG.info(e.getMessage());
        }
        return result;
    }

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

        Animal animal = new Animal("Barsik", 5, true);

        System.out.println("Initial value of name field is " + animal.getName());
        changeNameFieldUsingReflection(animal, "Tiger");
        System.out.println("Modified value of name field is " + animal.getName());

        System.out.println("Initial value of age field is " + animal.getAge());
        changeAgeFieldUsingReflection(animal, 1);
        System.out.println("Modified value of age field is " + animal.getAge());

        System.out.println("Initial value of tail field is " + animal.isTail());
        changeTailFieldUsingReflection(animal, false);
        System.out.println("Modified value of tail field is " + animal.isTail());
    }
}
