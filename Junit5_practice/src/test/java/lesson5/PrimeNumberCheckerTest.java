package lesson5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCheckerTest {

    @Test
    void validate() {
    } private PrimeNumberChecker pnc;

    @BeforeEach
    void beforeEach() {
        pnc = new PrimeNumberChecker();
    }

    @AfterEach
    void afterEach() {
        pnc = null;
    }

    @ParameterizedTest
    @ValueSource(ints = {3,7,11,17})
    void test_validate_prime(int number) {
        boolean result = pnc.validate(number);
        assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("getValues")
    void test_validate_with_method(int number) {
        boolean result = pnc.validate(number);
        assertFalse(result);
    }

    public static Stream<Arguments> getValues() {
        return Stream.of(
                Arguments.of(4),
                Arguments.of(56),
                Arguments.of(9),
                Arguments.of(125)
        );
    }
}