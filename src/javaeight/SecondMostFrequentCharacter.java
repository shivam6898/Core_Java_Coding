package javaeight;

import java.util.*;
import java.util.stream.Collectors;

public class SecondMostFrequentCharacter {
    public static void main(String[] args) {
        String str = "aaaaaaaabbbccccc";

        Map<Character, Long> characterCountMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        List<Map.Entry<Character, Long>> sortedEntries = characterCountMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .collect(Collectors.toList());
        System.out.println(sortedEntries);

        if (sortedEntries.size() >= 2) {
            Map.Entry<Character, Long> secondMostFrequent = sortedEntries.get(1);
            System.out.println("Second most frequent character: " + secondMostFrequent.getKey());
        } else {
            System.out.println("No second most frequent character found.");
        }
    }
}
