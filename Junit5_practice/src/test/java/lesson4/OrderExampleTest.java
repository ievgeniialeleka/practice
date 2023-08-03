package lesson4;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderExampleTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeOrderExampleTest.class");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterOrderExampleTest.class");
    }
    @Test
    @Order(3)
    void test() {
        OrderExample.printDetail("test");
    }

    @Test
    @Order(2)
    void firsttest() {
        OrderExample.printDetail("first test");
    }

    @Test
    @Order(1)
    void secondtest() {
        OrderExample.printDetail("second test");
    }

}