package lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionTest {
    @Test
    void when_AssertionIsEqual_ThenEqual() {
        String actual = "ITVDN";
        String expected = "ITVDN";
        String message = "Actual and expected are not equal";
        assertEquals(expected, actual, message);
    }

    @Test
    void when_AssertionDoubleIsEqual_ThenEqual() {
        double actual = 0.33;
        double expected = 0.34;
        double delta = 0.1;
        String message = "The difference between actual and expected is more than " + delta;
        assertEquals(expected, actual, delta, message);
    }

    @Test
    void when_AssertionArrayIsEqual_ThenEqual() {
        char[] actual = {'J', 'u', 'n', 'i', 't'};
        char[] expected = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    void given_NullArray_WhenAssertionArrayIsEqual_ThenEquals() {
        int[] actual = null;
        int[] expected = null;

        assertArrayEquals(expected, actual);
    }

    @Test
    void when_AssertionNullTrue_ThenTrue() {
        Object ob = null;
        String message = "Object is not null";

        assertNull(ob, message);
    }

    @Test
    public void when_AssertionNotNullTrue_ThenTrue() {
        Object ob = new Object();
        String message = "Object should not be null";

        assertNotNull(ob, message);
    }

    @Test
    void when_AssertionSameIsTrue_ThenTrue() {
        String actual = "TEST";
        String expected = new String("TEST").intern();
        String message = "Objects must be the same";

        assertSame(expected, actual, message);
    }

    @Test
    void when_AssertNotSameIsTrue_ThenTrue() {
        Object cat = new Object();
        Object dog = new Object();
        String message = "Objects must be different";

        assertNotSame(cat, dog, message);
    }

    @Test
    void when_AssertionConidition_ThenVerify() {
        assertTrue(5 < 6, "5 is less than 6");
        assertFalse(5 > 6, "5 is not greater than 6");
    }

    @Test
    void whenCheckingExceptionMessage_ThenEquals() {
        UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class,
                () -> methodthatshouldthrowexception(), "Exception not thrown");

        String expected = "Operation not supported";
        assertEquals(expected, exception.getMessage());
    }
    private void methodthatshouldthrowexception() {
        throw new UnsupportedOperationException("Operation not supported");
    }

}