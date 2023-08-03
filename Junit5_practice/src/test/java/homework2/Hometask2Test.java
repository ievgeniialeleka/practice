package homework2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Hometask2Test {

    private Hometask2 task;
    private String s;

    @BeforeEach
    public void beforeEach() {
        task = new Hometask2();
        s = "Hello";
    }

    @AfterEach
    public void afterEach() {
        s = null;
        task = null;
    }

    @Test
    void getSubstring() {
        String actual = task.getSubstring(s, 0, 2);
        String expected = "He";
        assertEquals(expected, actual);
    }

    @Test
    void isEmpty_StringNotEmpty_False() {
        boolean result = task.isEmpty(s);
        assertFalse(result);
    }

    @Test
    void replace() {
        String actual = task.replace(s, 'l', 'k');
        String expected = "Hekko";
        assertEquals(expected, actual);
    }

}