package objectOriented.example;


import objectOriented.example.model.IndividualPerson;
import objectOriented.example.model.LegalPerson;
import objectOriented.example.model.Person;
import objectOriented.example.model.Zone;
import objectOriented.example.service.RegisterInfo;
import objectOriented.example.service.RegisterPersonInfo;

public class PersonMain {

    public static void main(String[] args) {
        RegisterInfo registerInfo=new RegisterPersonInfo();

        System.out.println("not person demonstrated");
        registerInfo.register();
        System.out.println("********************************************************************************");

        //output
        //not person demonstrated
        //not any person for register
        Zone zone=((RegisterPersonInfo) registerInfo).registerPlaceOfPerson();

        // register IndividualPerson
        System.out.println("register IndividualPerson");
        Person person=new IndividualPerson();
        person.setZone(zone);
        ((IndividualPerson) person).setFirstName("Habib");
        ((IndividualPerson) person).setLastName("Elahi");
         person.setPersonCode("11900");
         registerInfo.register(person);
         /*output
         register IndividualPerson
         Reference name is Individual Reference  *** person type is  IndividualPerson Habib Elahi 11900  zone name
          */

        System.out.println("********************************************************************************");
        // register LegalPerson
        System.out.println("register LegalPerson");
        person=new LegalPerson();
        person.setZone(zone);
        ((LegalPerson) person).setName("Habib Hospital");
        person.setPersonCode("244");
        registerInfo.register(person);
        /*output
        register LegalPerson
        Reference name is Legal Reference  *** person type is  LegalPerson Habib Hospital 244  zone name
         */
        System.out.println("********************************************************************************");
    }
}
