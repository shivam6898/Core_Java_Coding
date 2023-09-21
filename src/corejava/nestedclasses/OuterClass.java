package corejava.nestedclasses;
//A local inner class is defined within a method or block of code
// and has limited visibility within that method or block.
class Local_Inner_OuterClass {
    void outerMethod() {
        class LocalInnerClass {
            void display() {
                System.out.println("LocalInnerClass: Inside outerMethod");
            }
        }

        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }

    public static void main(String[] args) {
        Local_Inner_OuterClass outerObj = new Local_Inner_OuterClass();
        outerObj.outerMethod();
    }
}

