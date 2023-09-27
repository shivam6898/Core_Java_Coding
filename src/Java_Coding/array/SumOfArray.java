package Java_Coding.array;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] intArr = {10,20,30,40};
        int sum = 0;
        for (int i=0 ; i <intArr.length; i++){
            sum = sum+ intArr[i];
        }
        System.out.println(sum);

        System.out.println(
                Arrays.stream(intArr).sum()
        );
    }
}
