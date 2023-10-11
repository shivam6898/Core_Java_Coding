package javaeight;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

    public static void main(String[] args) {
        ArrayList<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("a");
        listWithDuplicates.add("b");
        listWithDuplicates.add("a");
        listWithDuplicates.add("b");
        ArrayList<String> listWithoutDuplicates = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(listWithoutDuplicates);

    }
}
