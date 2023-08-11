package com.itvdn.homework.task2;

import com.itvdn.homework.additionaltask.Animal;

import java.lang.reflect.Member;

public class ClassInfo {

    public static void printMembers(Member[] mems) {
        for (int i = 0; i < mems.length; i++) {
            if(mems[i].getDeclaringClass() == Object.class) {
                continue;
            }
            System.out.println(mems[i]);
        }
    }

    public static void getClassInfo(String str) throws ClassNotFoundException {
        Class<?> cl1 = Class.forName(str);
        System.out.println("Name of the class: " + cl1);
        System.out.println("\nClass fields: ");
        printMembers(cl1.getFields());
        System.out.println("\nClass constructors: ");
        printMembers(cl1.getConstructors());
        System.out.println("\nClass methods: ");
        printMembers(cl1.getMethods());
    }

    public static void main(String[] args) throws ClassNotFoundException {
        getClassInfo("java.lang.String");
    }

}
