package corejava.nestedclasses;


interface Greeting {
    String greet(String str);
}

//An anonymous inner class is used to create an instance of a class or interface on-the-fly
// without explicitly defining a separate class.
public class AnonymousInnerOuter {

    void sayHello() {
        Greeting greeting = new Greeting() {
            @Override
            public String greet(String str) {
                return  "AnonymousInnerClass: Hello!" + str;
            }
        };

        System.out.println(greeting.greet("Java"));
    }

    public static void main(String[] args) {
        AnonymousInnerOuter outerObj = new AnonymousInnerOuter();
        outerObj.sayHello();
    }
}
