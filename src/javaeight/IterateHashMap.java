package javaeight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);


        System.out.println("using iterator......");
        //using iterator
        Iterator<String>  keyIterator= hashMap.keySet().iterator();
        while (keyIterator.hasNext()){
            String key  = keyIterator.next();
            System.out.println("Key:"+ key + " Value:" + hashMap.get(key));
        }

        Iterator<Integer>  valueIterator= hashMap.values().iterator();
        while (valueIterator.hasNext()){
            Integer value  = valueIterator.next();
            System.out.println("Value:" + value);
        }

        //using loop
        System.out.println("using loop.........");
        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            System.out.println("Key:"+ entry.getKey() + " Value:" + entry.getValue());
        }

        //using java 8
        System.out.println("using java 8...........");
        hashMap.forEach((key,value) -> System.out.println("Key:" + key + " value:"+value));

    }
}
