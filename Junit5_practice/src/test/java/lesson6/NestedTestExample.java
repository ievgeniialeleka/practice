package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ArgumentsSources;

import java.util.stream.Stream;

public class NestedTestExample {

    @Nested
    class CheckAgeOfPerson {

        @ParameterizedTest
        @ArgumentsSource(PersonProvider.class)
        void checkAgeGreaterThan18(Person person) {
            Assertions.assertTrue(person.getAge() >= 18);
        }
    }

    @Nested
    class CheckNameOfPerson {

        @ParameterizedTest
        @ArgumentsSource(PersonProvider.class)
        void checkFirstNameLongerThan4(Person person) {
            Assertions.assertTrue(person.getFirstName().length() >= 4);
        }
    }

    static class PersonProvider implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    new Person("Ivan", "Ivanov", 33),
                    new Person("Anna", "Petrova", 24),
                    new Person("Artur", "Sidorov", 18)
            ).map(Arguments::of);
        }
    }
}
