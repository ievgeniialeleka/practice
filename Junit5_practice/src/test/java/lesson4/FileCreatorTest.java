package lesson4;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileCreatorTest {


    @Test
    void testByAnnotationTest() throws IOException {
        IOException exception = assertThrows(IOException.class, () -> FileCreator.createTempFile(), "Exception not thrown");
        String expected = "NoSuchFileException";
        assertEquals(expected, exception.getMessage());
    }

}