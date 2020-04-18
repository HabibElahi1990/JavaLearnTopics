package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(3);
        integerList.add(1);
        integerList.add(6);
        integerList.add(4);
        integerList.add(8);
        integerList.add(10);
        integerList.add(9);
        integerList.add(5);
        integerList.add(7);

        //count
        long count = integerList.stream().count();
        System.out.println("count of list is " + count);//count of list is 1

        //filter ,sorted ,limit , skip , map,  forEach
        integerList.stream()
                .filter(a -> a >= 4)//   condition on list
                .sorted() //             sort on items of list
                .limit(4) //             limited by arg num
                .skip(1) //              skip items from first of list to count num
                .map(n -> Double.valueOf(n.toString())) // by map can convert type of stream to another type
                .forEach((n) -> System.err.print(n + " "));//6.0 8.0 9.0

        //Optional class
        // reduce
        // ifPresent
        Optional<Integer> reduce = integerList.stream()
                .reduce((a, b) -> a + b);
        reduce.ifPresent(n -> System.out.println("\nsum from numbers is " + reduce.get()));//sum from numbers is 55

        //collect convert and return type of collection to another type of collection
        Set<Integer> collect = integerList.stream().collect(Collectors.toSet());
        collect.stream().forEach((n) -> System.err.print(n + " "));//1 2 3 4 5 6 7 8 9 10

        Optional<Integer> max = integerList.stream().sorted().max(Integer::compare);
        max.ifPresent((n) -> System.out.println(max.orElseGet(() -> max.get())));//10


    }

}
