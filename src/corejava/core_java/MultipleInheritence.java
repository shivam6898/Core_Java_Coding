package corejava.core_java;

//In java multiple inheritance is possible with interface
//the problem is if multiple parent class have same method , then there is ambiguity to call
public class MultipleInheritence {
    public static void main(String[] args) {
    inter demo  = new Demo();
    demo.show();

    inter test  = new Test();
    test.show();
    }
}


interface inter {
     void show();

}
class Demo implements inter{

    @Override
    public void show() {
        System.out.println("from class demo");
    }
}


class Test implements inter{

    @Override
    public void show() {
        System.out.println("from class test");
    }
}
