package stream;


public class Person implements Comparable<Person> {
    private Integer id;
    private String name;
    private String nationalCode;
    private Integer birthYear;

    public Person(Integer id, String name, String nationalCode, Integer birthYear) {
        this.id = id;
        this.name = name;
        this.nationalCode = nationalCode;
        this.birthYear = birthYear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationalCode=" + nationalCode +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return o.getId();
    }
}
