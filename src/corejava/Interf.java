package corejava;

public interface Interf {

    //abstact method by default puublic abstract
    public abstract void show();

    //default method with default Keyword
    default void display(){
        System.out.println("default method in interface");
        print();
    }

    private void print(){
        System.out.println("private method");
    }


    //static method
     static void main(String[] args) {
        Impl impl = new Impl();
        impl.show();
        impl.display();
        System.out.println("static main method execution with interface");
    }
}


class Impl implements Interf{

    @Override
    public void show() {
        System.out.println("implemented method");
    }
}

//implemented method
//default method in interface
//private method
//static main method execution with interface
