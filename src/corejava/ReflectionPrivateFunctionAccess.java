package corejava;

import java.lang.reflect.Method;


public class ReflectionPrivateFunctionAccess {
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    public static void main(String[] args) throws Exception {
        ReflectionPrivateFunctionAccess myObj = new ReflectionPrivateFunctionAccess();

        // Get the Class object for MyClass
        Class<?> clazz = myObj.getClass();

        // Get the private method by its name
        Method privateMethod = clazz.getDeclaredMethod("privateMethod");

        // Make the private method accessible
        privateMethod.setAccessible(true);

        // Invoke the private method
        privateMethod.invoke(myObj);
    }
}
