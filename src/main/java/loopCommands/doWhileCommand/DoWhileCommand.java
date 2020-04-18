package loopCommands.doWhileCommand;

public class DoWhileCommand {
    public static void main(String[] args) {
        // via do - while expression you can execute a loop that at least execute once
        int i=5;
        do{
            System.out.println("do " + i);
            i++;
        }while (i<=5); // do 5

        i=5;
        do{
            System.out.println("do " + i);
            i++;
        }while (i<8);
        //do 5
        //do 6
        //do 7
    }
}
