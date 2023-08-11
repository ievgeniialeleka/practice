package com.itvdn.homework.task3;

import com.itvdn.homework.additionaltask.Animal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassContentInfo {

    public static String getModifierValue(int modifier) {
        return switch (modifier) {
            case 1 -> "public";
            case 2 -> "private";
            case 3 -> "default";
            case 4 -> "protected";
            default -> "modifier not found";
        };
    }

    public static void getClassInfo(Object ob) throws IllegalAccessException {
        Class<?> cl = ob.getClass();
        Field[] fields = cl.getDeclaredFields();
        for(Field field : fields) {
            String modifier = getModifierValue(field.getModifiers());
            field.setAccessible(true);
            System.out.println((char) 27 + "[31m" + "FIELDS: ");
            System.out.println("Field " + field.getName() + " - value " + field.get(ob) + ", type - " + field.getType() +
                    ", modifier - " + modifier);
        }

        Constructor<?>[] constructors = cl.getDeclaredConstructors();
        int index = 0;
        System.out.println("\n" + (char) 27 + "[34m" + "CONSTRUCTORS: ");
        for(Constructor<?> ctr : constructors) {
            System.out.println("\nConstructor " + ++index + ": ");
            System.out.println("Modifier: " + getModifierValue(ctr.getModifiers()));
            System.out.println("Parameters number: " + ctr.getParameterCount());
            Class<?>[] paramTypes = ctr.getParameterTypes();
            for(Class<?> types : paramTypes) {
                System.out.println(types.getName());
            }
        }

        Method[] methods = cl.getDeclaredMethods();
        System.out.println("\n" + (char) 27 + "[36m" + "METHODS: ");
        for(Method m : methods) {
            System.out.println("\nMethod name: " + m.getName());
            System.out.println("Modifier: " + getModifierValue(m.getModifiers()));
            System.out.println("Parameters count: " + m.getParameterCount());
            Class<?>[] paramTypes = m.getParameterTypes();
            System.out.println("List of parameters types: ");
            for(Class<?> params : paramTypes) {
                System.out.println(params.getName());
            }
            System.out.println("Return type: " + m.getReturnType());
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Animal animal = new Animal("Barsik", 2, true);
        getClassInfo(animal);
    }
}
