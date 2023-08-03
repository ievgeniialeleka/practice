package lesson6;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionTest {

    @Test
    void testJava17Installed() {
        Assumptions.assumeTrue(System.getProperty("java.version").contains("17"));
        System.out.println("Everything is fine");
    }

    @Test
    void testJava8Installed() {
        Assumptions.assumeTrue(System.getProperty("java.version").contains("1.8"));
        System.out.println("Need to update");
    }
}
