package corejava.core_java;

class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }

    public void fetch() {
        System.out.println("Fetching the ball");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void scratch() {
        System.out.println("Scratching furniture");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal genericAnimal = new Animal();

        // Using instanceof for type checking
        if (dog instanceof Dog) {
            System.out.println("dog is an instance of Dog");
            Dog myDog = (Dog) dog; // Casting is safe here
            myDog.fetch();
        }

        if (cat instanceof Cat) {
            System.out.println("cat is an instance of Cat");
            Cat myCat = (Cat) cat; // Casting is safe here
            myCat.scratch();
        }

        if (genericAnimal instanceof Dog) {
            // This block will not be executed since genericAnimal is not an instance of Dog
            Dog myDog = (Dog) genericAnimal; // This would throw a ClassCastException
        }
    }
}
