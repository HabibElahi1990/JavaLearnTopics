package array.learn;

import java.util.Arrays;

/**
 * Created by h.elahi on 5/16/2019.
 */
public class JavaArrays {

    public static void main(String[] args) {
        //initialize one dimensional Array
        Integer[] arrayInteger=new Integer[4];

        for(int i=0;i<arrayInteger.length;i++){
            System.out.print(i +",");
            System.out.println("initialize one dimensional Array");

        }
         /* output
        0,initialize one dimensional Array
        1,initialize one dimensional Array
        2,initialize one dimensional Array
        3,initialize one dimensional Array
         */

        //initialize multidimensional Array
        Integer[][] arrayInt=new Integer[2][3];

        for(int i=0;i<arrayInt.length;i++){
            for(int j=0;j<arrayInt[i].length;j++) {
                arrayInt[i][j]=j;
                System.out.println(i+" = "+arrayInt[i][j]);
            }
        }
          /*output
        0 = 0
        0 = 1
        0 = 2
        1 = 0
        1 = 1
        1 = 2
         */
        //initialize Array using shortcut syntax
        Integer[][] integerArrays={{1,2,3,4,6},{1,2,3,4,5,6}};

        Integer[] integerArray={1,2,3,4,6};
        Integer[] integerArrayCopy=new Integer[integerArray.length*2];
        //by System.arraycopy we can copy one array
        System.arraycopy(integerArray,0,integerArrayCopy,0,integerArray.length);
        System.out.println(Arrays.asList(integerArrayCopy));//[1, 2, 3, 4, 6, null, null, null, null, null]
        integerArrayCopy[5]=7;
        integerArrayCopy[6]=5;
        integerArrayCopy[7]=8;
        integerArrayCopy[8]=10;
        integerArrayCopy[9]=9;

        //get list of array
        System.out.println(Arrays.asList(integerArray));//[1, 2, 3, 4, 6, 7, 5, 8, 10, 9]

        //sort array items by  Arrays.sort
        Arrays.sort(integerArray);
        System.out.println(Arrays.asList(integerArray));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        // compare two array 0=equal , 1 means the second array is inside first array and -1 is two array not equal
        Integer[] t1={1,2,3,4,5,6};
        Integer[] t2={1,2,3,4,5};
        Integer[] t3={1,2,3,4,5,7};

        System.out.println(Arrays.compare(t1,t2));
        System.out.println(Arrays.compare(t1,t3));
    }

}
