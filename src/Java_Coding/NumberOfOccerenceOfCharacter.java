package Java_Coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfOccerenceOfCharacter {

    public static void main(String[] args) {
        String str  ="aab sbas sjkjas sakjsak sjksajsjasjsajsas slksalsksksalksla";
        str = str.replaceAll(" ","");
        //1.
        long count  = str.chars().filter(ch -> (char) ch  == 'l').count();

        //2.
        Arrays.asList(str.split("")).stream().filter(s -> s.equals("l")).count();

        //3.
        char [] charArr = str.toCharArray();
        HashMap<Character,Long> hashMap = new HashMap<>();
        for (char c: charArr) {
            if (hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c) +1);
            }else {
                hashMap.put(c,1L);
            }
        }

        for (Map.Entry<Character,Long> entry:hashMap.entrySet()) {
            System.out.println("Key:"+ entry.getKey() +" value: " + entry.getValue());

        }
    }
}
