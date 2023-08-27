package javaeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IntermediateOperation {

    public static void main(String[] args) {
        //1. filter
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

         // Result: [2, 4, 6, 8, 10]


        //2. map
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

         // Result: [4, 5, 3]

        //3.distinct
        List<Integer> dnumber = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5);

        List<Integer> distinctNumbers = dnumber.stream()
                .distinct()
                .collect(Collectors.toList());

         // Result: [1, 2, 3, 4, 5]

        //4.sorted
        List<Integer> snumbers = Arrays.asList(5, 3, 1, 4, 2);

        List<Integer> sortedNumbers = snumbers.stream()
                .sorted()
                .collect(Collectors.toList());

         // Result: [1, 2, 3, 4, 5]

        List<String> reverseOrder = Arrays.asList("John", "Alice", "Bob");

        List<String> sortedNames = reverseOrder.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

          // Result: ["John", "Bob", "Alice"]


        //5.limits
        List<Integer> lnumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> limitedNumbers = lnumbers.stream()
                .limit(5)
                .collect(Collectors.toList());

         // Result: [1, 2, 3, 4, 5]

        //6.skip
        List<Integer> skipnumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> skippedNumbers = skipnumbers.stream()
                .skip(5)
                .collect(Collectors.toList());

        // Result: [6, 7, 8, 9, 10]

        //7.flatmap
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> flatList = nestedLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

         // Result: [1, 2, 3, 4, 5, 6, 7, 8]

        //8.peek
        List<String> peeknames = Arrays.asList("John", "Alice", "Bob");

        List<String> upperCaseNames = peeknames.stream()
                .map(String::toUpperCase)
                .peek(System.out::println)
                .collect(Collectors.toList());

                // Result:
                // JOHN
                // ALICE
                // BOB

        //find length of list of string
        List<String> list = Arrays.asList("John", "Alice", "Bob", "Alice", "Carol");
        Map<String, Integer> map = list.stream().distinct()
                .collect(Collectors.toMap(Function.identity(),String::length));
        System.out.println(": " + map);

        List<String> takenWhile = list.stream()
                .takeWhile(name -> name.length() < 5)
                .collect(Collectors.toList());
        System.out.println("TakeWhile: " + takenWhile);

        List<String> droppedWhile = list.stream()
                .dropWhile(name -> name.length() < 5)
                .collect(Collectors.toList());
        System.out.println("DropWhile: " + droppedWhile);

        //filter not
        List<String> filteredNotNames = list.stream()
                .filter(Predicate.not(name -> name.equals("Alice")))
                .collect(Collectors.toList());
        System.out.println("FilterNot: " + filteredNotNames);

        //flatMapToInt
        List<List<Integer>> nestedLists1 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        int sumOfNestedLists = nestedLists1.stream()
                .flatMapToInt(list1 -> list1.stream().mapToInt(Integer::intValue))
                .sum();
        System.out.println("FlatMapToInt: " + sumOfNestedLists);











    }
}
