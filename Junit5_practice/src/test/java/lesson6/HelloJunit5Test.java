package lesson6;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.RepeatedTest.LONG_DISPLAY_NAME;

@DisplayName("Override class name")
class HelloJunit5Test {

    HelloJunit5 ob = new HelloJunit5();

    @org.junit.jupiter.api.Test
    @DisplayName("Test print")
    void printSmth() {
        String actual = ob.printSmth();
        String expected = "Hello";
        assertEquals(expected, actual);
    }

    @Test
    void baseAssertions() {
        Assertions.assertEquals(2, 1+1, "Optional message");
        assertEquals(3, 2+1, () -> "Lazy evaluation message");
    }

    @RepeatedTest(value = 5, name = LONG_DISPLAY_NAME)
    void print(RepetitionInfo info, TestInfo testinfo) {

        System.out.println(info.getCurrentRepetition() + " - " + testinfo.getDisplayName());
    }


}