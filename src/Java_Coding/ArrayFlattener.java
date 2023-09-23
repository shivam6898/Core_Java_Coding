package Java_Coding;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {
    public static void main(String[] args) {
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        List<Object> flattenedList = flattenArray(array);
        
        // Print the flattened array
        for (Object element : flattenedList) {
            System.out.print(element + " ");
        }
    }
    
    public static List<Object> flattenArray(Object[] array) {
        List<Object> flattenedList = new ArrayList<>();
        for (Object element : array) {
            if (element instanceof Object[]) {
                // If the element is an array, recursively flatten it
                flattenedList.addAll(flattenArray((Object[]) element));
            } else {
                // If the element is not an array, add it to the flattened list
                flattenedList.add(element);
            }
        }
        return flattenedList;
    }
}
