package array.example;

public class SumTwoMatrices {
    public static void main(String args[]) {
        //initial two matrices
        int array1[][] = {{1, 2, 3}, {4, 5, 6}};
        int array2[][] = {{1, 2, 3}, {4, 5, 6}};

        int c[][] = new int[2][3];

        //adding two matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = array1[i][j] + array2[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.print("\n");
        }

        //output
        /*
        2 4 6
        8 10 12
         */

    }
}
