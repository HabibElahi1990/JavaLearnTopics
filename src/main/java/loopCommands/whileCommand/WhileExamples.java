package loopCommands.whileCommand;

public class WhileExamples {
    public static void main(String[] args) {
        specifyCountTypeCharacterOfString();
    }

    static void specifyCountTypeCharacterOfString(){
        String str="My name is Habib. my age is 29. my cellphone is *********48";
        int letter=0;
        int digit=0;
        int character=0;
        var i=0;
        while (i<str.length()){
            if((str.charAt(i)>='A'&& str.charAt(i)<='Z')
                    || (str.charAt(i)>='a'&& str.charAt(i)<='z')){
                letter++;
            }
            else if(str.charAt(i)>='0'&& str.charAt(i)<='9'){
                digit++;
            }else {
                character++;
            }
            i++;
        }
        System.out.println("The type of "+str+" is ");
        System.out.println(" count of letter is "+ letter);
        System.out.println(" count of digit is "+ digit);
        System.out.println(" count of another character is "+ character);

        //output is
        // The type of My name is Habib. my age is 29. my cellphone is *********48 is
        // count of letter is 33
        // count of digit is 4
        // count of another character is 22
    }
}
