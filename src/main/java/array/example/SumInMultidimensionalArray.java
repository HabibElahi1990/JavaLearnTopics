package array.example;

/**
 * Created by h.elahi on 12/28/2019.
 */
public class SumInMultidimensionalArray {
    public static void main(String[] args) {
        int[][] intArray = new int[][]{
                {1, 2, 3, 4, 5, 6},
                {4, 5, 6, 7, 8, 9, 10}
        };
        for (int i = 0; i < intArray[0].length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < intArray[1].length; j++) {
                System.out.print(intArray[0][i] * intArray[1][j] + " ");
            }
            System.out.print(" ] \n");
        }

      /* output
        // [ 4 5 6 7 8 9 10  ]
        // [ 8 10 12 14 16 18 20  ]
        // [ 12 15 18 21 24 27 30  ]
        // [ 16 20 24 28 32 36 40  ]
        //  [ 20 25 30 35 40 45 50  ]
        //  [ 24 30 36 42 48 54 60  ]
      */
    }
}
