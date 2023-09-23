package Java_Coding;

import java.util.ArrayList;
import java.util.List;

public class ReverseNumber {
    public static void main(String[] args) {
         int temp = 12345;
         List<Integer> revNum = new ArrayList<>();
         while (temp!=0){
             int rem = temp % 10;
             temp = temp/10;
             revNum.add(rem);
         }
        System.out.println("first way "+ revNum);

         //

        int number = 12345;
        int reverseNumber = 0;
        while (number!=0){
            int rem = number%10;
            reverseNumber  = reverseNumber * 10 +rem;
            number = number/10;
        }
        System.out.println("second way "+ reverseNumber);

    }
}
