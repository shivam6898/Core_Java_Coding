package corejava.collection;

import java.util.Enumeration;
import java.util.Vector;

//Enumeration:
//
//Enumeration is an older interface that has been part of Java since its early versions.
//It is part of the java.util package.
//It provides two methods: hasMoreElements() and nextElement().
//It is used primarily with legacy collections like Vector and Hashtable.
//Example of using Enumeration with a Vector:
public class EnumerationExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        vector.add("Three");

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            System.out.println(element);
        }
    }
}
