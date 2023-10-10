package javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Define a Consumer that prints each element in the list
        Consumer<Integer> printConsumer = (number) -> {
            System.out.println(number);
        };

        // Use the forEach method of the List interface to apply the Consumer to each element
        numbers.forEach(printConsumer);
    }
}
