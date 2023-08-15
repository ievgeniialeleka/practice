package homework.task2.annotations;

import java.lang.annotation.*;

/**
 * @author Eve Leleka
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CalculatorAnnotation {
    int num1() default 0;
    int num2() default 0;
}
