package loopCommands.forCommand;

import java.util.Scanner;

public class ForExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        perfectNumber(scanner);
        System.out.println("******************************************************************");
        printStars();
        System.out.println("******************************************************************");
        makeSquare(scanner);
        System.out.println("******************************************************************");
        squareAndCubeNumber();
        System.out.println("******************************************************************");
        useLabel();
    }

    static void perfectNumber(Scanner scanner) {
        //use Scanner class for get value of user in console
        System.out.println("inter a number");
        String status = "yes";
        //use while for get number for continue
        while (status.equals("yes")) {
            int number = scanner.nextInt();
            int sum = 0;
            // check number for perfect number
            for (int i = 1; i <= number; i++) {
                if (number % i == 0 && number != i) {
                    System.out.println(i);
                    sum += i;
                }
            }
            if (sum == number) {
                System.out.println(number + " is a perfect number");
            } else {
                System.out.println(number + " is not a perfect number");
            }

            System.out.println("are you continue? yes/no");
            status = scanner.next();
        }
    }

    static void printStars() {
        /* output blew codes
         ***************
         ***************
         ***************
         ***************
         */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        /* output blew codes
         *
         *  *
         *    *
         *      *
         *    *
         *  *
         *
         */
        System.out.println("\t\t\t*");
        System.out.print("\t\t*\t\t*\n");
        System.out.print("\t*\t\t\t\t*\n");
        System.out.print("*\t\t\t\t\t\t*\n");
        System.out.print("\t*\t\t\t\t*\n");
        System.out.print("\t\t*\t\t*\n");
        System.out.println("\t\t\t*");

        /* output blew codes
         *
         **
         ***
         ****
         *****
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void makeSquare(Scanner scanner) {
        Integer number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print("*\t");
        }
        System.out.println();
        for (int i = 0; i < number - 2; i++) {
            System.out.print('*');
            for (int j = 1; j < number; j++) {
                System.out.print('\t');
            }
            System.out.println('*');
        }
        for (int i = 0; i < number; i++) {
            System.out.print("*\t");
        }

        /* output from code for number 4
         *	*	*	*
         *			*
         *			*
         *	*	*	*
         */
    }

    static void squareAndCubeNumber() {
                /* output blew codes
        number	square	cube
        1		1		1
        2		4		8
        3		9		27
        4		16		64
        5		25		125
        6		36		216
        7		49		343
        8		64		512
        9		81		729
        10		100		1000
         */
        System.out.println("number\tsquare\tcube");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            System.out.print("\t\t" + i * i);
            System.out.print("\t\t" + i * i * i + "\n");
        }
    }

    static void useLabel(){
        // define label first
        first:
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (j == 10) break first;
                System.out.print(" j" + j);
            }
            System.out.println();
        }
        //output is  j0 j1 j2 j3 j4 j5 j6 j7 j8 j9
        System.out.println();

        first:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (j==5) {
                    System.out.println();
                    continue ;
                }
                System.out.print(j+" ");
                if(j==7)
                    break first;
            }
        }
        //output is
        //0 1 2 3 4
        //6 7
    }


}
