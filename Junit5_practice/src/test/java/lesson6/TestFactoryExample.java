package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class TestFactoryExample {

    @BeforeEach
    void init() {
        System.out.println("Before each method");
    }

    @TestFactory
    Collection<DynamicTest> dynamictests() {
        List<Person> people = Arrays.asList(
                new Person("Ivan", "Ivanov", 33),
                new Person("Ann", "Petrova", 24),
                new Person("Artur", "Sidorov", 18)
        );
        int minAge = 18;
        return people.stream()
                .map(person -> dynamicTest(person.toString(),
                        () -> Assertions.assertTrue(person.getAge() >= minAge)))
                        .collect(Collectors.toList());
    }
}
