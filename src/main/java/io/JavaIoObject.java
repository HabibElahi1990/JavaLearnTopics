package io;

import java.io.Serializable;

public class JavaIoObject implements Serializable {
    private String firstName;
    private String lastName;
    private transient Integer age;
    private Integer grade;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "JavaIoObject{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public static void main(String[] args) {
        double num1 = 10e+102;
        double num2 = 6e+08;
        System.out.println(num1+num2);
        System.out.println(calculate(num1,num2));
    }

     private static strictfp double calculate(double num1, double num2) {
        return (num1 + num2);
    }
}
