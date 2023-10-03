package Java_Coding;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatingCharacter {

    public static void main(String[] args) {
        String str  = "programming";
        Set<Character> set = new HashSet<>();
        for (char c :str.toCharArray()) {
            if (!set.add(c)){
                System.out.println(c);
                break;
            }
        }

         Map<Character, Long> collect =  str.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                Collectors.counting()
                ));

        for (Map.Entry<Character,Long> entry : collect.entrySet()){
            if (entry.getValue()>2){
                System.out.println(entry.getKey());
            }
        }
    }
}
