package javaeight.functionalinterface;


//if we add single abstract method to interface all implementation claases need to implement
//the abstract method , but with we can write deafault method inside interface and can override to particular class to implement
public interface DefaultMethodInterface {

    default void printName(){
        System.out.println("deafault method of implementation");
    }
}


class DefaultMethodInterfaceImpl implements DefaultMethodInterface{
    //if we are not happy with default implementation of deafault method  override it
    //we can not write deafult keyword in class , in class deafult keyword is use in switch case
    //we need to add public as we can not reduce access type
    @Override
    public void printName(){
        System.out.println("deafault method of implementation overidden");
    }

    public static void main(String[] args) {
        DefaultMethodInterfaceImpl defaultMethodInterface = new DefaultMethodInterfaceImpl();
        defaultMethodInterface.printName();
    }

}
