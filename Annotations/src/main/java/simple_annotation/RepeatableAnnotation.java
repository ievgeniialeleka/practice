package simple_annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ContainerAnnotation.class)
public @interface RepeatableAnnotation {
    String str() default "Hello";
    int number() default 5;
}
