package javaeight;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,3,4,5,6,7,8,9,10);
        integerList.stream().filter(n -> n%2==0).forEach(System.out::print);
        System.out.println("----------");
        integerList.parallelStream().filter(n-> n%2==0).forEach(System.out::print);


    }
}
