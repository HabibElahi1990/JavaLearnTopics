package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class LambdaExercise {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(5));
        personList.add(new Person(4));
        personList.add(new Person(7));
        personList.add(new Person(6));
        personList.add(new Person(6));
        personList.add(new Person(2));
        personList.add(new Person(2));

        Collections.sort(personList, (p1, p2) -> p1.getId() - p2.getId());
        Function<List<Person>, String> function = pList -> {
            String str = "";
            for (Person p : pList) {
                str += p.getId() + " ";
            }

            return str;
        };
        System.out.println(function.apply(personList));//2 2 4 5 6 6 7
        List<Person> distinctPersonList = getDistinctPerson(personList, (p1, p2) -> p1.getId() != p2.getId());
        System.out.println(function.apply(distinctPersonList));//2 4 5 6 7
    }

    static List<Person> getDistinctPerson(List<Person> personList, BiPredicate<Person, Person> condition) {
        List<Person> distinctPersonList = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if ((i + 1) != personList.size()) {
                if (condition.test(personList.get(i), personList.get(i + 1))) {
                    distinctPersonList.add(personList.get(i));
                }
            } else {
                distinctPersonList.add(personList.get(i));
            }
        }

        return distinctPersonList;
    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
