package stringProperties;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getWordsOfString(scanner);
        compareTimeBetweenStringAndStringBuffer();
    }

    public static void getWordsOfString(Scanner scanner) {

        String str = scanner.nextLine();
        int word = 1;
        for (var i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == ' '
                    || str.charAt(i) == '\n'
                    || str.charAt(i) == '\t') && (i > 1 && !(str.charAt(i - 1) == ' '
                    || str.charAt(i - 1) == '\n'
                    || str.charAt(i - 1) == '\t'))
                    && (i!=str.length()-1)
            ) {
                word++;
            }
        }
        System.out.println("The count words of « " + str + " » is " + word);
        //The count words of « My name is Habib. I love Java. » is 7
    }

    private static void compareTimeBetweenStringAndStringBuffer() {
        String str = "";
        long startTime = System.currentTimeMillis();
        System.out.println("string startTime is "+startTime);
        for (int i = 0; i < 10000; i++) {
            str+=" * ";
        }
        Long currentTimeMillis=System.currentTimeMillis();
        System.out.println("string endTime is "+currentTimeMillis);
        System.out.println("diff time is "+ (currentTimeMillis-startTime));
        // Using StringBuffer
        StringBuffer bf = new StringBuffer();
        startTime = System.currentTimeMillis();
        System.out.println("StringBuffer startTime is "+startTime);
        for (int i = 0; i < 10000; i++) {
            bf.append(" / ");
        }
        currentTimeMillis=System.currentTimeMillis();
        System.out.println("StringBuffer endTime is "+currentTimeMillis);
        System.out.println("diff time is "+ (currentTimeMillis-startTime));

        /*output
        string startTime is 1581931730291
        string endTime is 1581931730417
        diff time is 126
        StringBuffer startTime is 1581931730428
        StringBuffer endTime is 1581931730429
        diff time is 1
         */
    }
}


