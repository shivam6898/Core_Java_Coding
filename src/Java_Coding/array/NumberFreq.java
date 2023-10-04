package Java_Coding.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberFreq {
    public static void main(String[] args) {
        int[] arr = {10,20,30,10,15,40,50};
        Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((key,value) -> {
                    System.out.println("KEY:"+key + " VALUE:"+value);
                });

        //2.
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i:arr) {
            if (hashMap.containsKey(i)){
                hashMap.put(i,hashMap.get(i) +1);
            }else {
                hashMap.put(i,1);
            }
        }
        System.out.println(hashMap);
    }
}
