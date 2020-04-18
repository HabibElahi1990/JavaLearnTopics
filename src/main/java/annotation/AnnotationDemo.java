package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by h.elahi on 5/16/2019.
 */
@CopyRight(owner = "Habib Elahi", year = "2020")
public class AnnotationDemo {
    public final static String GET_METHOD_PREFIX = "get";

    private String name;
    private String lastName;
    private Integer cellPhone;
    private Integer nationalCOde;

    @AnnotationInfo(id = 1, description = "description about name", name = "name", upperCase = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @AnnotationInfo(id = 2, description = "description about lastName", name = "lastName", lowerCase = true)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @AnnotationInfo(id = 3, description = "description about cellPhone", name = "cellPhone", lowerCase = true)
    public Integer getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(Integer cellPhone) {
        this.cellPhone = cellPhone;
    }

    public static void main(String[] args) {
        annotationTest();
    }

    @Anno(str = "str1", val = 1)
    @Anno(str = "str2", val = 2)
    @Anno(str = "str3", val = 3)
    public Integer getNationalCOde() {
        return nationalCOde;
    }

    public void setNationalCOde(Integer nationalCOde) {
        this.nationalCOde = nationalCOde;
    }

    @Override
    @AnnotationMarker
    public String toString() {
        return "AnnotationDemo{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    private static void annotationTest() {
        //get all method in AnnotationDemo class
        Method[] methods = AnnotationDemo.class.getMethods();
        StringBuilder str = new StringBuilder();
        for (Method method : methods) {
            String methodName = method.getName();
            //get AnnotationInfo for methods startWith get
            if (methodName.startsWith(GET_METHOD_PREFIX)) {
                AnnotationInfo annotationInfo = method.getAnnotation(AnnotationInfo.class);
                if (annotationInfo != null) {
                    str.append(annotationInfo.description()).append(" ").append(annotationInfo.upperCase() ? annotationInfo.name().toUpperCase() :
                            (annotationInfo.lowerCase() ? annotationInfo.name().toLowerCase() : annotationInfo.name())).append("\n");
                }


                Annotation anno = method.getAnnotation(RepeatAnnotation.class);
                if (anno != null)
                    System.out.println(anno);
                //@RepeatAnnotation(value={@Anno(val=1, str="str1"), @Anno(val=2, str="str2"), @Anno(val=3, str="str3")})
            }

            if (method.isAnnotationPresent(AnnotationMarker.class)) {
                System.out.println("AnnotationMarker is use");
                //AnnotationMarker is use
            }

        }
        System.out.println(str.toString());


    }
}
