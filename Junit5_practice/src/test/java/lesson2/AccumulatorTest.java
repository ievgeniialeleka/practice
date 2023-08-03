package lesson2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AccumulatorTest {

    private Accumulator accumulator;
    private int number;
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before each method");
        accumulator = new Accumulator();
        number = 10;
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each method");
        accumulator = null;
    }
    @Test
    void accumulate() {
        System.out.println("Accumulate test");
        accumulator.accumulate(number);
        accumulator.accumulate(number * 2);
        int actual = accumulator.getCounter();
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
        //   @Disabled("Tested in accumulate method")
    void getCounter() {
        System.out.println("Get counter test");
        accumulator.accumulate(number);
        int actual = accumulator.getCounter();
        int expected = 10;
        assertEquals(expected, actual);
    }
}