package javaeight.functionalinterface;

import java.util.function.Predicate;

public class PredicateJoining {

    public static void main(String[] args) {
        Predicate<String> checkLength  = s -> s.length() > 5 ;
        Predicate<String> checkLengthIsEven  = s -> s.length() %2 == 0 ;

        //if two predicate is true  then true
        System.out.println("After merging with and " + checkLength.and(checkLengthIsEven).test("test"));

        //one condition is true
        System.out.println("After merging with or " + checkLength.or(checkLengthIsEven).test("test"));

        //true to false , and false to true
        System.out.println("After merging with negate " + checkLength.or(checkLengthIsEven).test("test"));

    }
}
