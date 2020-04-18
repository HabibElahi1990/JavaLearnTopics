package objectOriented.example.model;

public class Reference {
    private String name;
    private Person person;

    public Reference(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String referenceInfoWithPersonInfo() {
        StringBuilder builder = new StringBuilder("Reference name is ");
        builder.append(this.getName());
        builder.append(" *** person type is ");
        if (person instanceof IndividualPerson) {
            builder.append(" IndividualPerson ")
                    .append(person.toString());
        }
        if (person instanceof LegalPerson) {
            builder.append(" LegalPerson ").append(person.toString());
        }
        return builder.toString();
    }
}
