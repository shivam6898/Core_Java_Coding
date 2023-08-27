package javaeight;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeExample {

    public static void main(String[] args) {


        String str = "shhivaam";
        Set<String> set  =  new HashSet();
        String stt = Arrays.asList(str.split("")).stream()
                .filter(ch -> set.add(ch))
                .collect(Collectors.joining());
        System.out.println(stt);

        String str2 = "A1A2A3";

        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        Arrays.asList(str2.split("")).stream()
                .filter(ch -> ch.contains(str)).collect(Collectors.joining());


        //aac,abb,ccd
        List<String> list = new ArrayList<>();
        list.add("aac");
        list.add("aab");
        list.add("aad");

        List<String> collect = list.stream().map(str1 -> Arrays.asList(str1.split("")).stream()
                .filter(ch -> set.add(ch))
                .collect(Collectors.joining())
        ).collect(Collectors.toList());
        System.out.println(collect);












    }
}
