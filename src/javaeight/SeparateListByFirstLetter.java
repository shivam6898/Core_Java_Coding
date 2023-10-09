package javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateListByFirstLetter {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Bat");
        list.add("Cat");
        list.add("Dog");
        list.add("Elephant");
        list.add("Fish");

        List<String> listA = list.stream()
                .filter(word -> "ABC".contains(String.valueOf(word.charAt(0))))
                .collect(Collectors.toList());
        List<String> listB = list.stream()
                .filter(word -> "DEF".contains(String.valueOf(word.charAt(0))))
                .collect(Collectors.toList());

        System.out.println("Name start with A, B, C "+listA);
        System.out.println("Name start with D, E, F "+listB);

    }
}
