package Java_Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilterAndCount {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> stringList = Arrays.asList("Hello", "World", "Java", "is", "awesome");

        // Character to search and count
        char targetChar = 'a';

        // Count occurrences of the target character in each string
        long charCount = stringList.stream()
                .mapToLong(str -> str.chars().filter(ch -> ch == targetChar).count())
                .sum();

        System.out.println("Total occurrences of '" + targetChar + "': " + charCount);

        // Object to filter based on (e.g., strings containing 'is')
        String filterObject = "is";

        // Filter the strings based on the object
        List<String> filteredStrings = stringList.stream()
                .filter(str -> str.contains(filterObject))
                .collect(Collectors.toList());

        System.out.println("Filtered strings containing '" + filterObject + "': " + filteredStrings);
    }
}
