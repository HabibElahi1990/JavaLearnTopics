package objectOriented.example.service;


import objectOriented.example.model.*;

public class RegisterPersonInfo extends RegisterPerson {
    @Override
    public Zone registerPlaceOfPerson() {
        Zone zone=new Zone();
        zone.setId(1L);
        zone.setCode("1");
        zone.setName("zone name");
        zone.setCode("zone Code");
        return zone;
    }

    @Override
    public void register(Person person) {
        if (person instanceof IndividualPerson) {
            Reference reference = new Reference(person);
            reference.setName("Individual Reference ");
            System.out.println(reference.referenceInfoWithPersonInfo());
        }

        if (person instanceof LegalPerson) {
            Reference reference = new Reference(person);
            reference.setName("Legal Reference ");
            System.out.println(reference.referenceInfoWithPersonInfo());
        }

    }
}
