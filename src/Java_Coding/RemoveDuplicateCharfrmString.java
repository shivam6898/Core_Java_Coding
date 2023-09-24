package Java_Coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharfrmString {
    public static void main(String[] args) {
        String str ="programming";
        Set<String> set  = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (String s : str.split("")) {
            if (set.add(s)) {
                sb.append(s);
            }
        }
        System.out.println(sb);

        //2.
        System.out.println(Arrays.stream(str.split("")).filter(s -> set.add(s)).collect(Collectors.joining()));
    }
}
