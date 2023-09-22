package javaeight;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MethodRef {
    public static void main(String[] args) {
        // Lambda expression
        Supplier<List<String>> listSupplier1 = () -> new ArrayList<>();

        // Constructor reference
        Supplier<List<String>> listSupplier2 = ArrayList::new;

        List<String> list1 = listSupplier1.get();
        List<String> list2 = listSupplier2.get();

        System.out.println(list1.getClass()); // Output: class java.util.ArrayList
        System.out.println(list2.getClass()); // Output: class java.util.ArrayList

        List<String> stringList  = Arrays.asList("java", "python" , "javascript");
        List<String> filList=   stringList.stream()
                .filter(Predicate.not(str -> str.equals("java")))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(filList);

    }
}

