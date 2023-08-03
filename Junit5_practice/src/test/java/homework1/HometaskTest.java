package homework1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HometaskTest {

    private Hometask ht;
    private int[] arr;

    @BeforeEach
    void beforeEach() {
        ht = new Hometask();
    }

    @AfterEach
    void afterEach() {
        ht = null;
    }

    @Test
    void shouldReturn_1_WhenArrayIs6634() {
        arr = new int[]{6, 6, 3, 4};
        int actual = ht.array667(arr);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void whenArrayIsEmpty_Expect_0() {
        arr = new int[10];
        int actual = ht.array667(arr);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void array667_with1Element_returns0() {
        arr = new int[]{6};
        int actual = ht.array667(arr);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void array667_whenArrayIs66745_returns2() {
        arr = new int[]{6, 6, 7, 4, 5};
        int actual = ht.array667(arr);
        int expected = 2;
        assertEquals(expected, actual);
    }
}