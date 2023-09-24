package Java_Coding;

import java.util.Arrays;

public class NumberOfOccerenceOfCharacter {

    public static void main(String[] args) {
        String str  = "hello";
        //1.
        long count  = str.chars().filter(ch -> (char) ch  == 'l').count();

        //2.
        Arrays.asList(str.split("")).stream().filter(s -> s.equals("l")).count();
    }
}
