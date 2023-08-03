package lesson5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AssertionTest {

    @Test
    void test_exceptionmessage() {
        UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class,
                () -> methodThatThrowsException(),
                "Exception not thrown");
        String expected = "Operation not supported";
        assertEquals(expected, exception.getMessage());
    }

    private void methodThatThrowsException() {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Test
    void test_assertthatHasSameItems() {
        List<String> list = Arrays.asList("Java", "Kotlin", "Scala");
       // assertThat(list);
    }


}