package hillel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonHillelTest {
    @ParameterizedTest
    @MethodSource("integerStreamProvider")
    public void divisionTestWithParams(List<PersonHillel> p) {
        Assertions.assertEquals(p.get(0), p.get(1));
        Assertions.assertEquals(p.get(0).getName(), p.get(1).getName());
    }

    public static Stream<Arguments> integerStreamProvider() {
        return Stream.of(
                Arguments.arguments(List.of(new PersonHillel("John"), new PersonHillel("John"))),
                Arguments.arguments(List.of(new PersonHillel("Dan"), new PersonHillel("Dan"))));
    }

}