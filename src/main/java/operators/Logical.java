package operators;

public class Logical {
    public static void main(String[] args) {

        // Logical operator example
        var a = 1;
        var b = 2;

        var result = a & b;
        System.out.println("Logical AND operator (&) example a & b --->  " + result);//0
        result = a | b;
        System.out.println("Logical OR operator (|) example a | b --->  " + result);//3
        result = a ^ b;
        System.out.println("Logical XOR operator (^) example a ^ b --->  " + result);//3
        result = a &= b;
        System.out.println("Equal to operator (&=) example a &= b --->  " + result);//0
        result = a |= b;
        System.out.println("Equal to operator (|=) example a |= b --->  " + result);//2
        result = a ^= b;
        System.out.println("Equal to operator (^=) example a ^= b --->  " + result);//0
        result = a > b ? a : b;
        System.out.println("Equal to operator (?:) example a == b ? a : b --->  " + result);//2

        shortCircuitLgicalOperators(a, b);
        //Short-circuit OR  operator (||) true
        //Short-circuit AND  operator (&&) false
        //logical unary NOT operator (!) true

    }

    private static void shortCircuitLgicalOperators(int a, int b) {
        if (a > 1 || b < 10) {
            System.out.println("Short-circuit OR  operator (||) " + true);
        } else {
            System.out.println("Short-circuit OR  operator (||) " + false);
        }
        if (a > 1 && b < 10) {
            System.out.println("Short-circuit AND  operator (&&) " + true);
        } else {
            System.out.println("Short-circuit AND  operator (&&) " + false);
        }
        if (!(a == b)) {
            System.out.println("logical unary NOT operator (!) " + true);
        } else {
            System.out.println("logical unary NOT operator (!) " + false);
        }
    }
}
