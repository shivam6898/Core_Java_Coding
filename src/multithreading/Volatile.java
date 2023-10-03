package multithreading;


//Volatile maintains the most recent updated value for the shared variable
//if multiple threads trying to create the separate object for Singleton class , it will not be created
public class Volatile {

    private static volatile Volatile volatileInstance;

    private Volatile() {

    }

    public static Volatile getInstance() {
        if (volatileInstance == null) {
            volatileInstance = new Volatile();
        }
        return volatileInstance;
    }

    public static void main(String[] args) {
        System.out.println(Volatile.getInstance());
        System.out.println(Volatile.getInstance());
    }
}
