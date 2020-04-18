package objectOriented.learn.composition;

/**
 * Created by h.elahi on 6/15/2019.
 */
// Student class
public class Student extends Person {
    private String firstName;
    private String lastName;
    private String studentCode;

    //composition has-a relationship
    private Course course;

    public Student() {
        this.course = new Course();
        course.setName("Math");
        course.setUnit(1);
    }

    public String getCOurseName() {
        return course.getName();
    }

    //implement abstract class
    protected String fullName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
