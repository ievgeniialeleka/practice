package homework.addtask.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ContainerAnno.class)
public @interface RepeatableAnno {
    int num1() default 0;
    int num2() default 0;
}
