package javaeight.functionalinterface;

import java.util.function.Predicate;

public class PredicateFunctionDemo {
    public static void main(String[] args) {

        Predicate<String> checkLength  =  s -> s.length() >5 ;
        System.out.println("The length od string is ggreater than 5" + checkLength.test("abcd"));

    }
}
