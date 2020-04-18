package conditionalCommands.switchCaseCommand;

import java.util.Random;
import java.util.Scanner;

public class SwitchCaseExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthForSwitch= scanner.nextInt();//10
        //get season by while statement
        getSeasonBySwitch(monthForSwitch);//Autumn

        //use the Random class for operation
        Random random=new Random();
        int num1=scanner.nextInt(); // 4
        int num2=scanner.nextInt(); // 5
        int result = mathGame(num1, num2, random.nextInt(3) + 1);
        System.out.println("num1 , num2 is "+num1 +" "+num2 +" result = "+result );
        // output
        //minus
        //num1 , num2 is 4 5 result = -1
    }
    private static void getSeasonBySwitch(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("mistake Month");
        }
    }

    private static int mathGame(int num1, int num2, int operation){
        int result = 0;
        switch (operation) {
            case 0:
                System.out.println("sum");
                result = (num1 + num2);
                break;
            case 1:
                System.out.println("mul");
                result = (num1 * num2);
                break;
            case 2:
                System.out.println("minus");
                result = (num1 - num2);
                break;
            case 3:
                System.out.println("div");
                if (num2 != 0)
                    result = (num1 / num2);
                else
                    result = 1;
                break;
        }
        return result;
    }
}


