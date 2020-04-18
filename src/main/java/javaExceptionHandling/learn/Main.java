package javaExceptionHandling.learn;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws ArithmeticException {
        int d = 0;
        //int result = 10 / 0;
        //after this code and run
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at learn.Main.main(learn.Main.java:4)
	    */

        // by try - catch - finally  we can manage exception for do`nt stop automatically program
        // and show a appropriate message to user
        // the finally scope certainly execute after try or try-catch
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException error is divided a num on 0");//ArithmeticException error is divided a num on 0
            System.out.println("ArithmeticException getMessage method" + e.getMessage());//ArithmeticException getMessage method/ by zero
            System.out.println("ArithmeticException getCause method " + e.getCause());
            System.out.println("ArithmeticException getLocalizedMessage method " + e.getLocalizedMessage());// / by zero
            e.printStackTrace();
            /* java.lang.ArithmeticException: / by zero
	            at learn.Main.main(learn.Main.java:12)*/
        } finally {
            System.out.println("after try or try-catch execute");//after try or try-catch execute
        }

        System.out.println("*****************************************************");
        Random random=new Random();
        int a=random.nextInt(1);
        int b=random.nextInt(1);
        try {
            try {
                if(a==0){
                    throw new IllegalCallerException("the first num is not zero");
                }
            }catch (IllegalCallerException e){
                System.out.println("IllegalCallerException error is " + e.getMessage());
            }

            dividedNum(a,0);
            b=a/b;
        } catch (MyExceptionHandling myExceptionHandling) {
            System.out.println("myExceptionHandling error is "+myExceptionHandling.toString());
            myExceptionHandling.printStackTrace();
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException getMessage method is "+e.getMessage());
        }

        //output is
        /*
         IllegalCallerException error is the first num is not zero
         myExceptionHandling error is 1 : the two arg is 0
         java.lang.ArithmeticException: / by zero
         myExceptionHandling error is 1 : the two arg is 0
	     at learn.Main.main(learn.Main.java:17)
         1 : the two arg is 0
         at learn.Main.dividedNum(learn.Main.java:56)
	     at learn.Main.main(learn.Main.java:44)
         */
    }

    private static void dividedNum(int a,int b) throws MyExceptionHandling {
        if(b==0){
            throw new MyExceptionHandling(1,"the two arg is 0");
        }
    }
}
