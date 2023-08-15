package homework.addtask.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ContainerAnno {
    RepeatableAnno[] value();

}
