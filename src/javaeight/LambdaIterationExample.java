package javaeight;

import java.util.ArrayList;
import java.util.List;

//Iterate a list using lambda expressions
public class LambdaIterationExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Using lambda expression to iterate over the list
        fruits.forEach(fruit -> {
            System.out.println(fruit);
        });
    }
}
