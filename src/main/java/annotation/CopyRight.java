package annotation;

import java.lang.annotation.*;

/**
 * Created by h.elahi on 7/2/2019.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE,ElementType.TYPE})
public @interface CopyRight {

    String year() default "";

    String owner() default "";
}
