package array.example;

public class ReversingString {
    public static void main(String[] args) {
        String str="Hello java!";
        System.out.println("reversing Hello java! by Array and for loop is -->"+reverseStringByForLoop(str));
        //reversing Hello java! by Array and for loop is -->!avaj olleH
        System.out.println("reversing Hello java! by recursive method is -->"+reverseStringByRecursiveMethod(str));
        //reversing Hello java! by recursive method is -->!avaj olleH
    }

    private static String reverseStringByForLoop(String str){
        String[] strArray=new String[str.length()];
        for(var i=0;i<str.length();i++){
            strArray[i]= String.valueOf(str.charAt(i));
        }
        StringBuilder reverseStr= new StringBuilder();
        for(var i=strArray.length-1;i>=0;i--){
            reverseStr.append(strArray[i]);
        }
        return reverseStr.toString();
    }

    private static String reverseStringByRecursiveMethod(String str){

        if(str.isEmpty())
            return str;

        System.out.println("str :"+str);
        System.out.println("substring :"+str.substring(1));
        System.out.println("charAt :"+str.charAt(0));
        System.out.println("subString + charAt :"+str.substring(1)+str.charAt(0));

// at the this sentence we get subString(1)
        return reverseStringByRecursiveMethod(str.substring(1))+str.charAt(0);
    }


}
