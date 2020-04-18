package loopCommands.whileCommand;

public class WhileCommand {
    public static void main(String[] args) {
        // via while expression you can execute a loop like for
        int i = 5;
        while (i <= 5) {
            System.out.println("while " + i);
            i++;
        }// while 5

        i = 5;
        while (i < 8) {
            {
                System.out.println("while " + i);
                i++;
            }
            //while 5
            //while 6
            //while 7
        }
    }
}
