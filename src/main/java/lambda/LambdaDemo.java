package lambda;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNum num=(n)->(n%2)==0;
        if(num.test(10)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        MulNumber mulNumber=()->{
            int mul=1;
            for (int i=1;i<=10;i++){
                mul*=i;
            }
            return mul;
        };
        System.out.println(mulNumber.mulNum());//3628800

        mulNumber=()->{
            double mul=1;
            for (int i=1;i<=10;i++){
                mul*=i;
            }
            return mul;
        };
        System.out.println(mulNumber.mulNum());//3628800.0

        // constructor References
        StringFunc stringFunc= MyStringOpt::new;
        System.out.println(stringFunc.func("Elahi"));//MyStringOpt{name='Elahi'}

        //Method References to static Methods
        String str=stringOp(MyStringOpt::strReverse,"java is perfect");
        System.out.println(str);//tcefrep si avaj
        MyStringOpt myStringOpt=new MyStringOpt();
        String str1=stringOp(myStringOpt::getString,"Hello Java");
        System.out.println(str1);//Hello Java

        //use Function interface
        Function<Integer,Integer> factorial=(n)->{
            int result=1;
            for(int i=1;i<=n;i++)
                result*=i;

            return result;
        };
        System.out.println(factorial.apply(5));//120

        //use BiFunction get two parameter from Integer type and return String type
        BiFunction<Integer,Integer,String> biFunction=(n,x)->{
            return String.valueOf((n*x));
        };
        System.out.println(biFunction.apply(5,6));//30

        //use Comparator interface
        Comparator<Integer> integerComparator=(a,b)-> a.compareTo(b);
        System.out.println(integerComparator.compare(10,20));//-1
        System.out.println(integerComparator.reversed().compare(10,20));//1

        //use Predicate interface just return boolean
        Predicate<String> notNull=(x)-> x!=null;
        System.out.println(notNull.test(null));//false
        Predicate<String> notEmpty=String::isEmpty;
        System.out.println(notEmpty.and(notEmpty).negate().test("habib"));//true
    }

    static String stringOp(StringFunc stringFunc,String str){
        return (String) stringFunc.func(str);
    }
}

class MyStringOpt extends SupreTest{

    private String name="habib";

    public MyStringOpt(String name) {
        this.name = name;
    }

    public MyStringOpt() { }

    static String strReverse(String str){
        String result="";
        for (int i=str.length()-1;i>=0;i--) {
            result += str.charAt(i);
        }
        return result;
    }

    @Override
    public String toString() {
        return "MyStringOpt{" +
                "name='" + name + '\'' +
                '}';
    }
}

class SupreTest{
    protected String getString(String str){
     return str;
    }
}
