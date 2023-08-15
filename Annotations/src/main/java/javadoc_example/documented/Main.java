package javadoc_example.documented;

import java.lang.annotation.Documented;

public class Main {

    @Documented
    @interface ClassPreamble {
        String author();
        String date();
        int currentRevision() default 1;
        String lastModified() default "N/A";
        String lastModifiedBy() default "N/A";
        String[] reviewers();
    }

   
    @ClassPreamble(
            author = "Eve",
            date = "24/06/2023",
            currentRevision = 5,
            lastModified = "24/06/2023",
            lastModifiedBy = "Eve",
            reviewers = {"Eve", "Alex", "Bob"}
    )
    public static void main(String[] args) {
    }
}

