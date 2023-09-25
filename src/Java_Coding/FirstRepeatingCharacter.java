package Java_Coding;

import java.util.HashSet;
import java.util.Set;

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
    }
}
