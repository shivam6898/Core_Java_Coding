package javaeight.forEach;

import java.util.*;
import java.util.stream.Stream;

public class forEach {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put(null,40);
        map.put("D",4);
        map.put("E",5);
       map.forEach((k,v) -> System.out.println("Key:" +k + " value:"+v));
        System.out.println("------------------------");
       map.forEach((k,v) -> {
           if (k!=null) {
               System.out.println("Key:" + k + " value:" + v);
           }
       });


       //-------------------List-------------------

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(null);
        list.stream().forEach(System.out::println);
        System.out.println("---------------------");
        list.stream().filter(Objects::nonNull)
                .forEach(System.out::println);


        List<String> stringList = Arrays.asList("abc", "java", "python");







    }
}
