package javaeight;

import java.util.*;
import java.util.stream.Collectors;

public class SeparateNumericAndCharExample {
    public static void main(String[] args) {
        String input = "a1b2c3";

        List<Character> numericChars = input.chars()
            .filter(Character::isDigit)
            .mapToObj(c -> (char) c)
            .collect(Collectors.toList());

        String nonNumericChars = input.chars()
            .filter(c -> !Character.isDigit(c))
            .mapToObj(c -> (char) c)
            .collect(Collectors.toList()).stream()
                .map(String::valueOf).collect(Collectors.joining());

        System.out.println("Numeric Characters: " + numericChars); // Output: [1, 2, 3]
        System.out.println("Non-Numeric Characters: " + nonNumericChars); // Output: [a, b, c]


    }
}
