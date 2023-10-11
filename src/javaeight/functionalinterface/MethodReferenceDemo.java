package javaeight.functionalinterface;


@FunctionalInterface
interface FunctionalInterfaceDemo{
    public void singleAbstractMethod();
}


public class MethodReferenceDemo {
    public static void main(String[] args) {
        //if no test impl is provided then write lambda expression
        FunctionalInterfaceDemo demo = ()  -> System.out.println("Functional Interface impl ");
        demo.singleAbstractMethod();



        //Method Referencing
        FunctionalInterfaceDemo functionalInterfaceDemo  = Test::testImpl;
        functionalInterfaceDemo.singleAbstractMethod();
    }
}


class Test {
    public static void testImpl(){
        System.out.println("test impl of abstract method");
    }

}
