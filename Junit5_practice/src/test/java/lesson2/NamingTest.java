package lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NamingTest {

    private Naming naming = new Naming();

    @Test
    void isAdult_AgeIsLessThan18_False() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    void isAdult_False_AgeIsLessThan18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    void test_IsNotAnAdultWhenAgeIsLessThan18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    void isNotAnAdultWhenAgeIsLessThan18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    void should_ReturnFalse_When_AgeIsLessThan18() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    void when_AgeIsLessThan18_Expect_isAdultFalse() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }

    @Test
    void given_TryToBuyACigarette_When_AgeIsLessThan18_Then_ExpectIsAdultAsFalse() {
        boolean result = naming.isAdult(17);
        assertFalse(result);
    }
}