package corejava;

//A static nested class is a nested class that is declared as static.
// It is associated with the outer class, but it doesn't have access to instance-specific members of the outer class.
class OuterClass {
    private static int outerStaticVar = 10;
    private int outerInstanceVar = 20;

    static class StaticNestedClass {
        void display() {
            System.out.println("StaticNestedClass: outerStaticVar = " + outerStaticVar); // Accessing static member of OuterClass
            // System.out.println("StaticNestedClass: outerInstanceVar = " + outerInstanceVar); // This would result in a compilation error
        }
    }

    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display();
    }
}

