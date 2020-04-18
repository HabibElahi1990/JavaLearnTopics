package conditionalCommands.ifCommand;

import java.util.Scanner;

public class IfExamples {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        getMaxNumber(scanner);
        getMinNumber(scanner);
    }

    static void getMaxNumber(Scanner scanner) {
        int a = scanner.nextInt(); // 4
        int b = scanner.nextInt(); // 5
        int c = scanner.nextInt(); // 1
        int d = scanner.nextInt(); // 8
        int max = 0;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max < c)
            max = c;
        if (max < d)
            max = d;

        System.out.println("max is " + max); //max is 8
    }

    static void getMinNumber(Scanner scanner) {
        int a = scanner.nextInt(); // 4
        int b = scanner.nextInt(); // 5
        int c = scanner.nextInt(); // 1
        int d = scanner.nextInt(); // 8
        int e = scanner.nextInt(); // 9
        int f = scanner.nextInt(); // 2
        int min = 0;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min > c)
            min = c;
        if (min > d) min = d;
        if (min > e) min =e;
        if (min > f) min = f;

        System.out.println("min is " + min); //min is 2
    }
}
