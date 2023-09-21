package corejava.nestedclasses;

//An inner class is a nested class that is not declared as static.
// It is closely associated with an instance of the outer class and can access both static and instance members of the outer class.
public class Inner_OuterClass {
    private int outerInstanceVar = 20;

    class InnerClass {
        void display() {
            System.out.println("InnerClass: outerInstanceVar = " + outerInstanceVar); // Accessing instance member of OuterClass
        }
    }

    public static void main(String[] args) {
        Inner_OuterClass outerObj = new Inner_OuterClass();
        Inner_OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display();
    }
}

