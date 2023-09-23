package corejava.collection;

import java.util.ArrayList;
import java.util.Iterator;


//Iterator:
//
//        Iterator is a newer and more versatile interface introduced in Java 1.2.
//        It is part of the java.util package.
//        It provides three methods: hasNext(), next(), and remove() (optional).
//        It is used with modern collections like ArrayList, LinkedList, and others.
//        Example of using Iterator with an ArrayList:
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
