package Java_Coding.array;


import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateInteger {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 10, 15, 40, 50};

        //Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());

        Set<Integer> set = new HashSet<>();
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer num : arr) {
            if (set.add(num)) {
                uniqueList.add(num);
            }
        }
        System.out.println(uniqueList);


    }
}
