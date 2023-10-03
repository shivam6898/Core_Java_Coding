package javaeight.functionalinterface;



//the interface which have single abstract method is known as functional interface
@FunctionalInterface
interface Interf{
    void show();
}


@FunctionalInterface
interface Calculation{
    public Integer multiply(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        //Lambda expression is no know name function , it doesn't have name, return type and access modifier
        Interf interf = () -> System.out.println("functional interface show method implementation");
        interf.show();

        Calculation calculation = (a,b) -> a*b;
        System.out.println(calculation.multiply(4,5));

    }
}
