package Java_Coding.array;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] intArr = {10, 9, 20, 11, 30, 40};
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum = sum + intArr[i];
        }
        System.out.println(sum);

       // System.out.println(Arrays.stream(intArr).sum());

        //sum of even numbers
        int sumOfEven = 0;
        for (int i : intArr) {
            if (i % 2 == 0) {
                sumOfEven +=i;
            }
        }
        System.out.println(sumOfEven);
    }
}
