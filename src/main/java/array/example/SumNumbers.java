package array.example;

/**
 * Created by h.elahi on 1/4/2020.
 */
public class SumNumbers {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        //use for-each style for loop
        for (int x: num) {
            sum+=x;
        }
        System.out.println("sum is : "+ sum);//sum is : 55
    }
}
