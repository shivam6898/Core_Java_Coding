package javaeight;

import java.util.Arrays;
import java.util.List;


public class IntermidiateOperation {

    public static void main(String[] args) {

        //filter
        List<String> lines = Arrays.asList("spring", "node", "java");
        lines.stream().filter(line -> !line.equals("node")); //i dont like node

        List<Integer> numbers  = Arrays.asList(1,2,3,4,5,6);
        numbers.stream().filter(n -> n % 2 == 0);


    }
}
