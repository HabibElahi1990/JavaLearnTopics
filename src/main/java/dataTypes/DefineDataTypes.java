package dataTypes;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DefineDataTypes {
    public static void main(String[] args) {
        // Primitive data types - includes byte, short, int, long, float, double, boolean and char
        // The wrapper  data types - includes Byte, Short, Integer, Long, Float, Double, Boolean and Character
        //Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in the other parts)

        //The Byte data type is a 8-bit  Stores whole numbers from  (-128 to  127)
        byte b=127;
        System.out.println("Byte "+b);//Byte 127

        //The int data type is a 32-bit Stores whole numbers from  (-(2 ^ 31) to (2^31)– 1)
        int i=32;
        System.out.println("Integer "+i);//Integer 32

        //The short data type is a 16-bit Stores whole numbers from -32,768 to 32,767
        short s=32767;
        System.out.println("Short "+s);//Short 32767

        //The long data type is a 64-bit Stores whole numbers from (-(2 ^ 63) to (2^63)– 1)
        long l=32767L;
        System.out.println("Long "+l);//Long 32767

        //The float data type is a 32-bit Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        float f=32767f;
        System.out.println("Float "+f);//Float 32767.0

        //The double data type is a 64-bit Stores fractional numbers. Sufficient for storing 15 decimal digits
        double d=32767D;
        System.out.println("Double "+d);//Double 32767.0

        //The boolean data type is a 1-bit Stores true or false values
        boolean bo=true;
        System.out.println("Boolean "+bo);//Boolean true

        //The char data type is a 16-bit Stores a single character/letter or ASCII values
        char c='A';
        System.out.println("Character "+c);//Character A

    }
}
