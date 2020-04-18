package stream;

import java.util.ArrayList;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Habib", "119", 1369));
        people.add(new Person(2, "Ali", "120", 1370));
        people.add(new Person(3, "Hasan", "121", 1350));
        people.add(new Person(4, "Reza", "119", 1365));
        people.add(new Person(5, "Majid", "119", 1364));

        people.stream().filter((n)->n.getBirthYear()>1360)
                .filter(n->n.getNationalCode().equals("119"))
                .sorted(Comparable::compareTo)
                .forEach(n-> System.out.println(n.toString()));

        /*
        Person{id=1, name='Habib', nationalCode=119, birthYear=1369}
        Person{id=4, name='Reza', nationalCode=119, birthYear=1365}
        Person{id=5, name='Majid', nationalCode=119, birthYear=1364}
         */

    }
}
