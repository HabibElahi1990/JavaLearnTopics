package conditionalCommands.ifCommand;

public class IfCommand {

    public static void main(String[] args) {
        // if is for comparing between two thing
        int a=10;
        int b=20;
        // the below command in always true but we use if to check
        // if a>b then print 10>20
        if(a>b){
            System.out.println("10>20");
        }

        // we can via else command after if body`s check the conditional the is not true in if
        else{
            System.out.println("20>10");
        }
        //output is 20>10

/********************************************************************************************/

        // we can use of more than one if else too
        int c=15;
        if (a > b) {
            System.out.println("10>20");
        }else if(a>c){
            System.out.println("10>15");
        }else {
            System.out.println("15>10");
        }
        //output is 15>10

/********************************************************************************************/
        // we can use nested if else
        if(b>a){
            System.out.println("20>10");
            if(c>a){
                System.out.println("15>10");
            }else {
                System.out.println("10>15");
            }
        }else {
            System.out.println("10>20");
        }

        //output is
        //20>10
        //15>10
    }
}
