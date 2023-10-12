package corejava.core_java.concurrentmodificationexception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//ConcurrentModificationException is an exception that occurs when you try to modify a collection
// (e.g., a List, Set, or Map)
public class ConcurrentModificationException {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("someValue");

        //Incorrect way
        for (String item : myList) {
            if (item.equals("someValue")) {
              //  myList.remove(item); // This will throw ConcurrentModificationException
            }
        }

        //correct way
        // 1. If you need to modify a collection while iterating over it,
        // use the iterator's remove() method to safely remove elements from the collection.
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("someValue")) {
                iterator.remove(); // Safe removal
            }
        }
        System.out.println(myList);


        //2. Java provides synchronized collections that are designed for use in multi-threaded environments.
        // These collections ensure that modifications are synchronized and don't lead to concurrent modification issues.
        // You can create synchronized collections using the Collections.synchronizedXXX methods.
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        //3.Java also provides specialized concurrent collections in the java.util.concurrent package,
        // such as ConcurrentHashMap and CopyOnWriteArrayList,
        // which are designed for concurrent access without the risk of concurrent modification exceptions
        List<String> copyOnWriteList = new CopyOnWriteArrayList<>();

        //CopyOnWriteArrayList create the copy of ArrayList, and store the modification on copy
        //and apply when iteration completes

    }
}
