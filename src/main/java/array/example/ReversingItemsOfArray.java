package array.example;

import java.util.Arrays;

/**
 * Created by h.elahi on 12/28/2019.
 */
public class ReversingItemsOfArray {
    public static void main(String[] args) {
        int[] intArray=new int[]{1,8,9,4,6,3,4,7,85,2};
        int[] reversingIntArray=new int[intArray.length];
        for (int i=1;i<=intArray.length;i++) {
            reversingIntArray[i-1]=intArray[intArray.length-i];
        }
        intArray=reversingIntArray;
        //output is [2, 85, 7, 4, 3, 6, 4, 9, 8, 1]
        System.out.println(Arrays.toString(intArray));
    }
}
