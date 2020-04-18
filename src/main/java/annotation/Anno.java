package annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
@Repeatable(RepeatAnnotation.class)
public @interface Anno {
    String str() default "str";
    int val() default 0;
}
