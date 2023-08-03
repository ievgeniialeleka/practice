package lesson4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreator {
    public static Path createTempFile() throws IOException {
        Path temp = Files.createTempDirectory("temp");
        temp.toFile().delete();
        try {
            return Files.createTempFile(temp, "test", ".txt");
        } catch (IOException e) {
            throw new IOException("NoSuchFileException");
        }
    }
}
