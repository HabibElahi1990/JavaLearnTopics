package array.example;

/**
 * Created by h.elahi on 12/28/2019.
 */
public class ProgressBarByArray {
    public static void main(String[] args) {
        // initials for arrays
        int[] intArray=new int[]{4,3,5,8,1,2,9,12};
        for(int i=0;i<intArray.length;i++){
            //print progress bar * for each items of intArray
            for(int j=0;j<intArray[i];j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
