package javaeight.functionalinterface;


//static method are not by default available to all implementation classes
//implementation class dont have access directly need to call by Interface name

//with static method inside interface we can keep utility method inside interface without creating additional classes and objects
public interface InterfaceWithStaticMethod {

    static void staticMethod(){
        System.out.println("static method inside interface");
    }
}


class InterfaceWithStaticMethodImpl implements InterfaceWithStaticMethod{

    public static void main(String[] args) {
        InterfaceWithStaticMethod.staticMethod();
    }


}

