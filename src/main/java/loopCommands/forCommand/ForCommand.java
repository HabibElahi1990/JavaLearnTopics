package loopCommands.forCommand;

public class ForCommand {
    public static void main(String[] args) {
        // via using for you can have a expression for loop
        //for is create from 3 part
        // first initialization
        // second condition
        // third  iteration
        // for (initialization;condition;iteration)
        for (int i = 0; i < 3; i++) {
            System.out.print(i +" ");
        }
        //0 1 2

        System.out.println("\n******************************************************************");
        // the condition must be always as Boolean
        int i=0;
        for(;true;){
            if(i==5){
                break;
            }
            System.out.print(i +" ");
            i++;
        }
        //0 1 2 3 4
        System.out.println("\n******************************************************************");
        //the iteration can ++,--,*,/,...
        for(var x=1;x<50;x*=2){
            System.out.println(x);
            if(50%x==0){
                System.out.println(" x = "+x);
            }

        }
        /* output
            1
            x = 1
            2
            x = 2
            4
            8
            16
            32
        */
    }

}
