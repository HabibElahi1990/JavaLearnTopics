package operators;

public class Arithmetic {

    public static void main(String[] args) {
        // arithmetic operator example
        int a=10;
        int b=5;
        System.out.println("a =" +a);//a =10
        System.out.println("b =" +b);//b =5
        System.out.println("addition operator (+) example a+b --->  "+ (a+b));//addition operator (+) example a+b --->  15
        System.out.println("subtraction operator (-) example a-b --->  "+ (a-b));//subtraction operator (-) example a-b --->  5
        System.out.println("multiplication operator (*) example a*b --->  "+ (a*b));//multiplication operator (*) example a*b --->  50
        System.out.println("division operator (/) example a/b --->  "+ (a/b));//division operator (/) example a/b --->  2
        System.out.println("modulus operator (%) example a%b --->  "+ (a%b));//modulus operator (%) example a%b --->  0
        System.out.println("increment operator (++) example a++ --->  "+ (a++));
        // first a +1 and print 10 for this sample a but the value of a equals 11
        // increment operator (++) example a++ --->  10
        System.out.println("increment operator (++) example ++a --->  "+ (++a));
        //the value of a =11 and the first 1 + 11 =12
        //increment operator (++) example ++a --->  12
        System.out.println("addition assignment operator (+=) example a+=b --->  "+ (a+=b));//addition assignment operator (+=) example a+=b --->  17
        System.out.println("subtraction assignment operator (-=) example a-=b --->  "+ (a-=b));//subtraction assignment operator (-=) example a-=b --->  12
        System.out.println("multiplication assignment operator (*=) example a*=b --->  "+ (a*=b));//multiplication assignment operator (*=) example a*=b --->  60
        System.out.println("division assignment operator (/=) example a/=b --->  "+ (a/=b));//division assignment operator (/=) example a/=b --->  12
        System.out.println("modulus assignment operator (%=) example a%=b --->  "+ (a%=b));//modulus assignment operator (%=) example a%=b --->  2
        System.out.println("decrement operator (--) example a-- --->  "+ (a--));//decrement operator (--) example a-- --->  2
        System.out.println("decrement operator (--) example --a --->  "+ (--a));//decrement operator (--) example --a --->  0
    }
}
