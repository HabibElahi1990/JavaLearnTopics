package objectOriented.example.model;

public class Person {

    private String personCode;
    private Zone zone;

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return this.personCode+ "  "+getZone().getName();
    }
}
