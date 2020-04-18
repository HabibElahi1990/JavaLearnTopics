package javaEnum.example;

public class Person {
    String name;
    Integer age;
    int salary;
    EducationInfo.GetEducationInfo education;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public EducationInfo.GetEducationInfo getEducation() {
        return education;
    }

    public void setEducation(EducationInfo.GetEducationInfo education) {
        this.education = education;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", education='" + education.name() +
                ", salary=" + salary + '\'' +
                '}';
    }
}
