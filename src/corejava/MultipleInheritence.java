package corejava;

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
