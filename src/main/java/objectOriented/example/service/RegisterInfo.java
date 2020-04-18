package objectOriented.example.service;


import objectOriented.example.model.Person;

public interface RegisterInfo {

    void register(Person person);

    default void register() {
        System.out.println("not any person for register");
    }
}
