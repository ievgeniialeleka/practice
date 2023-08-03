package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.temporal.ChronoUnit;

import static java.util.concurrent.TimeUnit.DAYS;

public class ParameterizedExampleTest {

    @ParameterizedTest
    @ValueSource(strings = {"junit4", "junit5", "junit3"})
    void testContainsJunit(String input) {
        Assertions.assertTrue(input.contains("junit"));
    }

    @ParameterizedTest
    @EnumSource(value = ChronoUnit.class, mode = EnumSource.Mode.EXCLUDE, names = {"DAYS"})
    void testEnum(ChronoUnit chronounit) {
        System.out.println(chronounit);
        Assertions.assertNotNull(chronounit);
    }
}
