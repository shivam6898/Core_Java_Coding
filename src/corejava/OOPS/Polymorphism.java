package corejava.OOPS;

public class Polymorphism {
    public static void main(String[] args) {
       A a = new A();
       a.show();
       a.print();
      // a.display()  not accessible to A class
        System.out.println("---------------------");

       B b = new B();
       b.show();
       b.print();
       b.display();
        System.out.println("---------------------");

       A aa = new B();
       aa.show();
       aa.print();
       A.methodHidding();
      // aa.display();  not accesible to A class
        System.out.println("---------------------");

       // B bb = new A();    child reference can not be use to hold parent object


    }
}


class A {

    public void show(){
        System.out.println("Java SE");
    }

    public void print(){
        System.out.println("Java SE1");
    }

    public static void methodHidding(){
        System.out.println("JAVA SE1 Method Hidding");
    }
}

class B extends A {

    @Override
    public void show() {
        System.out.println("JAva EE");
    }
    public void display() {
        System.out.println("Java EE1");
    }
    public static void methodHidding(){
        System.out.println("JAVA EE1");
    }

}


//Java SE
//Java SE1
//---------------------
//JAva EE
//Java SE1
//Java EE1
//---------------------
//JAva EE
//Java SE1
//---------------------
//
