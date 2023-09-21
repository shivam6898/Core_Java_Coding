package design_pattern.creational;

//The Singleton design pattern is a creational design pattern
// that restricts the instantiation of a class to a single instance
// and provides a global point of access to that instance.
// It ensures that there is only one instance of the class in the application
// and provides a way to access that instance from anywhere within the application.
public class SingletonDesignPattern {

    // Private static variable to hold the single instance of the class
    private static SingletonDesignPattern instance;

    // Private constructor to prevent direct instantiation of the class
    private SingletonDesignPattern() {
        // Initialization code here
    }

    // Public static method to provide access to the single instance
    public static SingletonDesignPattern getInstance() {
        if (instance == null) {
            // If the instance doesn't exist, create it
            instance = new SingletonDesignPattern();
        }
        return instance;
    }

    // Add your business methods and data members here

    public static void main(String[] args) {
        SingletonDesignPattern instance1 = SingletonDesignPattern.getInstance();
        SingletonDesignPattern instance2 = SingletonDesignPattern.getInstance();
        // Both instances should be the same
        System.out.println(instance1 == instance2); // true
    }
}
