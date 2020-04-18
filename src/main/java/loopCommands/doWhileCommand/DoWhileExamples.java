package loopCommands.doWhileCommand;

import java.util.Random;
import java.util.Scanner;

public class DoWhileExamples {
    public static void main(String[] args) {
        getFirstNumber();
        System.out.println("******************************************************************");
        getAvgFromNumbers();
    }

    private static void getAvgFromNumbers() {
        int sum = 0;
        int i = 0;
        Random rand=new Random();
            int random = 0;
            do {
                if(i==10){
                    break;
                }
                random =rand.nextInt(20)+1;// get random number between 1 until 20
                System.out.println("number_" + (i+1) + " = " + random);
                sum += random;
                i++;
            } while (random >= 0);



        System.out.println("avg = " + sum / 10);
        //number_1 = 17
        //number_2 = 12
        //number_3 = 12
        //number_4 = 19
        //number_5 = 16
        //number_6 = 1
        //number_7 = 5
        //number_8 = 3
        //number_9 = 6
        //number_10 = 8
        //avg = 9
    }

    static void getFirstNumber() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 2;
        boolean firstNum = true;
        do {
            if (num % i == 0) {
                firstNum = false;
                break;
            }
            i++;
        }
        while (num > 1 && i != num);
        if (!firstNum) {
            System.out.println(num + " is not the first number.");
        } else {
            System.out.println(num + " is  the first number.");
        }

        //output 11 is  the first number.
    }
}
