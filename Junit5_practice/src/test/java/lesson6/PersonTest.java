package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        Person p = new Person("Ivan", "Ivanov");
        Assertions.assertAll(
                () -> assertEquals("Ivan", p.getFirstName()),
                () -> assertEquals("Ivanov", p.getLastName())
        );
    }

    @Test
    void assertTrueWithLambda() {
        List<String> list = Arrays.asList("ITVDN", "junit");
        assertFalse(list :: isEmpty);
        assertTrue(list.contains("ITVDN"));

    }

    @Test
    void testTimeout() throws InterruptedException {
        assertTimeout(Duration.ofMillis(500),
                () -> Thread.currentThread().sleep(400));
    }

}