package Java_Coding;



//the interface which have single abstract method is known as functional interface
@FunctionalInterface
interface Interf{
    void show();
}

public class LambdaExpression {
    public static void main(String[] args) {
        //Lambda expression is no know name function , it doesn't have name, return type and access modifier
        Interf interf = () -> System.out.println("functional interface show method implementation");
        interf.show();
    }
}
