package com.itvdn.homework.additionaltask;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.itvdn.homework.additionaltask.Cat.*;

class CatTest {

    private static Animal animal;

    @BeforeAll
    static void beforeAll() {
        animal = new Animal("Barsik", 5, true);
    }

    @AfterAll
    static void afterAll() {
        animal = null;
    }
    @Test
    void testChangeNameFieldUsingReflection() {
        changeNameFieldUsingReflection(animal, "Tiger");
        String actual = animal.getName();
        String expected = "Tiger";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testChangeAgeFieldUsingReflection() {
        changeAgeFieldUsingReflection(animal, 1);
        int actual = animal.getAge();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testChangeTailFieldUsingReflection() {
        changeTailFieldUsingReflection(animal, false);
        boolean actual = animal.isTail();
        boolean expected = false;
        Assertions.assertEquals(expected,actual);

    }
}