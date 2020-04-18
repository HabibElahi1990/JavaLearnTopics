package conditionalCommands.switchCaseCommand;

public class SwitchCaseCommand {
    public static void main(String[] args) {
        //switch case is similar to if-else if the value if initial switch was equal in case then the body of case will be execute
        // and then by break then switch is finish and compiler goto next code after block switch
        // if neither of cases not execute  and use write default then default will be execute.
        int i = 0;
        switch (i) {
            case 0:
                System.out.println("switch case");
                break;
            default:
                System.out.println("default in switch case");
        }
        //output switch case
    }
}
