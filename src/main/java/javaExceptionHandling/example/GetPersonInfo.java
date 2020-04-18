package javaExceptionHandling.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetPersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String name = scanner.nextLine();
            String nationalCode = scanner.nextLine();
            int age = scanner.nextInt();
            if (name.trim().isEmpty()) {
                throw new PersonInfoException(1, "name is empty");
            }
            if (nationalCode.isEmpty() || nationalCode.length() != 10) {
                throw new PersonInfoException(2, "nationalCode is invalid");
            }
            if (age <= 0 || age >= 150) {
                throw new PersonInfoException(3, "age is invalid");
            }
            Person person = new Person(name, nationalCode, age);
            System.out.println(person.toString());
            //Person{name='Habib Elahi', nationalCode='1190090244', age=29}
        } catch (PersonInfoException e) {
            System.out.println("PersonInfoException error");
            System.out.println(e.toString());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException error ");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(" exception non unknown");
            System.out.println(e.getMessage());
        }

        //output
        /*
        if input for age does not match with Inter like seven then
        InputMismatchException error
        java.util.InputMismatchException
	    at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	    at java.base/java.util.Scanner.next(Scanner.java:1594)
	    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	    at example.GetPersonInfo.main(GetPersonInfo.java:12)
         */

            /*
            Habib Elahi
            119009024
            27
            PersonInfoException error
            2 : example.PersonInfoException: nationalCode is invalid
            */

            /*
            Habib Elahi
            1190090244
            -10
            PersonInfoException error
            3 : example.PersonInfoException: age is invalid
            */
    }
}
