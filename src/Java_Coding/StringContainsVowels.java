package Java_Coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringContainsVowels {

    public static void main(String[] args) {
        String input = "Hell23434o";
        System.out.println(stringContainsVowels(input)); // true
        System.out.println(stringContainsVowels("TV")); // false

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        // Check if any character in the string is a vowel using a stream
        boolean containsVowel = input.chars()
                .mapToObj(c -> (char) c)
                .anyMatch(c -> vowels.contains(c));
    }

    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }

}