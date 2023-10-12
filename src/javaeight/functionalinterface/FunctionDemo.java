package javaeight.functionalinterface;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<Integer,Integer> squareMe =  i -> i*i;

        Function<Integer,Double> squareMeWithDoubleReturn =  i -> Double.valueOf(i*i);

        System.out.println(squareMe.apply(10));
        System.out.println(squareMeWithDoubleReturn.apply(10));
    }
}
