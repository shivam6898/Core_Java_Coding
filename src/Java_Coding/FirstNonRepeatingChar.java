package Java_Coding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "sshivam";
        Optional<Character> firstNonRepeating = findFirstNonRepeatingCharacter(input);

        if (firstNonRepeating.isPresent()) {
            System.out.println("First non-repeating character: " + firstNonRepeating.get());
        } else {
            System.out.println("No non-repeating characters found.");
        }
    }

    public static Optional<Character> findFirstNonRepeatingCharacter(String input) {
        Map<Character, Long> charCounts = input.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch ->ch ,LinkedHashMap::new,Collectors.counting()));

        for (Map.Entry<Character, Long> entry : charCounts.entrySet()) {
            if (entry.getValue() == 1) {
                return Optional.of(entry.getKey());
            }
        }

        return Optional.empty();
    }


}
