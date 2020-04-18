package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by h.elahi on 5/16/2019.
 */
public class GenericsDemo {

    public static void main(String args[]) {
        GenericsType<Integer> integerGenericsType = new GenericsType<Integer>();
        integerGenericsType.setT(123);
        System.out.println(integerGenericsType.getT());//123

        GenericsType<String> stringGenericsType = new GenericsType<String>();
        stringGenericsType.setT("Habib");
        System.out.println(stringGenericsType.getT());//Habib

        GenericsType<Integer> integerGenericsType1 = new GenericsType<Integer>();
        integerGenericsType1.setT(456);
        System.out.println(integerGenericsType1.getT());//456

//        System.out.println(GenericsType.equalGenericsType(integerGenericsType,stringGenericsType));//compile error
        System.out.println(GenericsType.equalGenericsType(integerGenericsType, integerGenericsType1));//flase
        integerGenericsType1.setT(123);
        System.out.println(GenericsType.equalGenericsType(integerGenericsType, integerGenericsType1)); //true

        GenericsTypeBounded<Integer> integerGenericsTypeBounded = new GenericsTypeBounded<Integer>();
        integerGenericsTypeBounded.setObj(1234);
        System.out.println(integerGenericsTypeBounded.getObj());//1234

        /* when use data type String for GenericsTypeBounded we observe below error like under example
       * Error:(29, 29) java: type argument java.lang.String is not within bounds of type-variable T
       * for GenericsTypeBounded we just can use Integer because we define  <T extends Number>
         */

        // use row type it meant we don`t illustrate type in <> for class
        // in blew example GenericsTypeBounded not have type as <>
        GenericsTypeBounded genericsTypeBounded=new GenericsTypeBounded();
        genericsTypeBounded.setObj(5f);//5.0
        System.out.println(genericsTypeBounded.getObj());
        genericsTypeBounded.setObj(5d);//5.0
        System.out.println(genericsTypeBounded.getObj());
        genericsTypeBounded.setObj(5);//5
        System.out.println(genericsTypeBounded.getObj());

//        GenericsTypeBounded<String> stringGenericsTypeBounded=new GenericsTypeBounded<String>();

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(3); ints.add(5); ints.add(10);
//        double sum = sum(ints); this line is error because there is not related between
//        list<Integer> and List<Double> and kinds of types that extend Number
//        so we collision exception

        List<Number> numberList=new ArrayList<Number>();
        numberList.add(3);
        numberList.add(5);
        double numberSum = sum(numberList);
        System.out.println("Sum of numberSum= "+numberSum);//8.0

        //we use Java GenericsDemo Upper Bounded Wildcard
        double sum = sum1(ints);
        System.out.println("Sum of ints="+sum);//18.0


        //ConstructorGeneric
        ConstructorGeneric constructorGeneric=new ConstructorGeneric(10);
        ConstructorGeneric constructorGeneric1=new ConstructorGeneric(10.34);
        constructorGeneric.showVal();  // 10.0
        constructorGeneric1.showVal(); // 10.34

    }

    private static Double sum(List<Number> numList) {
        double sum = 0;
        for (Number number : numList) {
            sum+=number.doubleValue();
        }
        return sum;
    }


    private static Double sum1(List<? extends Number> numList) {
        double sum = 0;
        for (Number number : numList) {
            sum+=number.doubleValue();
        }
        return sum;
    }
}
