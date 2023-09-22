package corejava;

//1.Make the class final: This prevents other classes from extending your immutable class and potentially changing its behavior.
//2.Declare all fields as private and final: This ensures that the state of the object cannot be modified after initialization.
//3.Provide no setter methods: Avoid providing methods that allow external code to modify the object's state.
//4.Initialize all fields in the constructor: Ensure that all fields are set to their initial values during object creation.
//5.Don't return mutable objects: If your class contains references to mutable objects (e.g., collections),
// make sure you don't return them directly or provide methods that allow external code to modify them.
public final class Immutable {
    private final String name;
    private final int age;

    public Immutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

        public static void main(String[] args) {
           Immutable immutable = new Immutable("Alice", 30);
            System.out.println(immutable.getName()); // Output: Alice
            System.out.println(immutable.getAge());  // Output: 30
        }
}
