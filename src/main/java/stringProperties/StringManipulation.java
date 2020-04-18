package stringProperties;

import java.security.SecureRandom;
import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "Hello! My name is Habib";
//        subSequence
        javaStringSubSequence(str);//Hello!
//        substring
        javaStringSubString(str);//Hello!

        char[] chars=new  char[5];
        str.getChars(0,5,chars,0);
        System.out.println(chars);//Hello

//        subSequence vs substring
        if (str.subSequence(0, 6) == str.substring(0, 6)) {
            System.out.println("subSequence==substring");
        }
        if (str.subSequence(0, 6).equals(str.substring(0, 6))) {
            System.out.println("subSequence equal substring");//subSequence equal substring
        }

//        compare to between two String
        javaCompareTo((String) str.subSequence(0, 6), str.substring(0, 6));//0
        javaCompareTo("Hello!", "Hello! ");//-1
        javaCompareTo("Hello! ", "Hello!");//1

//        convert string to char
        javaStringConvertToChar(str);

//        split of string
        javaStringSplit(str);

//        convert string to bytes and convert bytes to string
        javaStringBytes(str);

//        convert string to char array and convert char array to string
        javaStringToChar(str);

        //java String Buffer
        //StringBuffer is the thread safe utility class to perform several operations on Strings
        javaStringBuffer(str);

        //java String Builder
        javaStringBuilder(str);

        //use  StringBuilder is better than StringBuffer in large data in memory and time

        String name="Habib";
        String lastName="Elahi";
        System.out.println(String.join(",",name ,lastName));//Habib,Elahi

    }

    // Internally it invokes the substring() method.
    private static void javaStringSubSequence(String str) {
        System.out.println(str.subSequence(0, 6));
    }

    private static void javaStringSubString(String str) {
        System.out.println(str.substring(0, 6));
    }

    private static void javaCompareTo(String firstStr, String secondStr) {
        System.out.println(firstStr.compareTo(secondStr));
    }

    private static void javaStringConvertToChar(String str) {
        char strChar = str.charAt(10);
        System.out.println(strChar);//n
        char[] charArray = str.toCharArray();
        System.out.println(charArray);//Hello! My name is Habib
        char[] strCharArray = new char[10];
        str.getChars(0, 10, strCharArray, 0);
        System.out.println(strCharArray);//Hello! My
    }

    private static void javaStringSplit(String str){
        System.out.println(Arrays.toString(str.split("My")));//[Hello! ,  name is Habib]
    }

    private static void javaStringBytes(String str){

        byte[] bytes=str.getBytes();
        System.out.println(Arrays.toString(bytes));//[72, 101, 108, 108, 111, 33, 32, 77, 121, 32, 110, 97, 109, 101, 32, 105, 115, 32, 72, 97, 98, 105, 98]

        String byteString=new String(bytes);
        System.out.println(byteString);//Hello! My name is Habib
    }

    private static void javaStringToChar(String str){
        char[] chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));//[H, e, l, l, o, !,  , M, y,  , n, a, m, e,  , i, s,  , H, a, b, i, b]

        String newStr= new String(chars);
        System.out.println(newStr);//Hello! My name is Habib
    }

    private static void javaStringBuffer(String str){
        System.out.println("***************************************");
        StringBuffer stringBuffer=new StringBuffer(str);
        System.out.println(stringBuffer.length());//23
        System.out.println(stringBuffer.capacity());//16 + 23 =39 (16 is base and 23 is length of str and because initial by constructor)
        System.out.println(stringBuffer.append(" ").append("Elahi"));//Hello! My name is Habib Elahi
        System.out.println(stringBuffer.delete(1,5));//H! My name is Habib Elahi
        System.out.println(stringBuffer.deleteCharAt(19));//H! My name is HabibElahi
        System.out.println(stringBuffer.indexOf("My"));//3
        System.out.println(stringBuffer.insert(stringBuffer.length()," from Iran"));//H! My name is HabibElahi from Iran
        System.out.println(stringBuffer.replace(0,2,"Hi! "));//Hi!  My name is HabibElahi from Iran
        System.out.println(stringBuffer.reverse());//narI morf ihalEbibaH si eman yM  !iH
        System.out.println("***************************************");
    }

    private static void javaStringBuilder(String str){
        System.out.println("***************************************");
        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.length());//23
        System.out.println(stringBuilder.capacity());//16 + 23 =39 (16 is base and 23 is length of str and because initial by constructor)
        System.out.println(stringBuilder.append(" ").append("Elahi"));//Hello! My name is Habib Elahi
        System.out.println(stringBuilder.delete(1,5));//H! My name is Habib Elahi
        System.out.println(stringBuilder.deleteCharAt(19));//H! My name is HabibElahi
        System.out.println(stringBuilder.indexOf("My"));//3
        System.out.println(stringBuilder.insert(stringBuilder.length()," from Iran"));//H! My name is HabibElahi from Iran
        System.out.println(stringBuilder.replace(0,2,"Hi! "));//Hi!  My name is HabibElahi from Iran
        System.out.println(stringBuilder.reverse());//narI morf ihalEbibaH si eman yM  !iH
        System.out.println("***************************************");
    }

}
