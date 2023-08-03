package lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @org.junit.jupiter.api.Test
    void sum() {
        Numbers num = new Numbers();
        int actual = num.sum(5);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }
}