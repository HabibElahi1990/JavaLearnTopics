package javaExceptionHandling.example;

public class Person {
    private String name;
    private String nationalCode;
    private Integer age;

    public Person() {
    }

    public Person(String name, String nationalCode, Integer age) {
        this.name = name;
        this.nationalCode = nationalCode;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", age=" + age +
                '}';
    }
}
