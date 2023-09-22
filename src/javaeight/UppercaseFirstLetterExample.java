package javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class UppercaseFirstLetterExample {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("java", "python", "javascript");

        List<String> capitalizedList = stringList.stream()
            .map(str -> str.substring(0, 1).toUpperCase() +str.substring(1,str.length()-1)+ str.substring(str.length()-1).toUpperCase())
            .collect(Collectors.toList());
        out.println("Capitalized Strings: " + capitalizedList);
        // Output: [Java, Python, Javascript]

        String input = "java";

        out.println(input.chars()
                .mapToObj(c -> {
            char  ch = (char) c;
            if (input.charAt(0) == ch){
                return Character.toUpperCase(ch);
            }
            return  ch;
        }).map(Objects::toString).collect(Collectors.joining()));
    }
}
