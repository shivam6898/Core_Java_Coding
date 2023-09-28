package Java_Coding;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfEvens = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .mapToInt(Integer::intValue) // Convert to int for sum()
                .sum();

       // numbers.stream().reduce(0,(a,b) -> a+b);

        System.out.println("Sum of even numbers: " + sumOfEvens);
    }
}
