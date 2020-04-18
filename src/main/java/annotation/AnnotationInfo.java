package annotation;

import java.lang.annotation.*;

/**
 * Created by h.elahi on 7/2/2019.
 */
/*
*AnnotationDemo methods can’t have parameters.
* Java AnnotationDemo methods can have default values.
*/
/*@Documented
If a type declaration is annotated with Documented, its annotations become part of the public API of the annotated elements.
 */
/* @Target we can use values
        * ElementType.METHOD ---Method declaration
        * ElementType.ANNOTATION_TYPE  ---AnnotationDemo type declaration
        * ElementType.CONSTRUCTOR ---Constructor declaration
        * ElementType.FIELD  ---Field declaration (includes enum constants)
        * ElementType.LOCAL_VARIABLE  ---Local variable declaration
        * ElementType.PACKAGE  ---Package declaration
        * ElementType.PARAMETER  ---Parameter declaration
        * ElementType.TYPE  ---Class, interface (including annotation type), or enum declaration
 */
/* @Retention we can use values
        * RetentionPolicy.RUNTIME  ---Annotations are to be recorded in the class file by the compiler and retained by the VM at run time.
        * RetentionPolicy.SOURCE   ---Annotations are to be discarded by the compiler.
        * RetentionPolicy.CLASS    ---Annotations are to be recorded in the class file by the compiler but need not be retained by the VM at run time.  This is the default behavior.
*/

@CopyRight(owner = "Habib Elahi",year = "2019")
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationInfo {

    //if you do`nt default for member you should define and initial
    // it when use this annotation
    int id();


    String name() default "";

    String description() default "";

    boolean upperCase() default false;

    boolean lowerCase() default false;
}
