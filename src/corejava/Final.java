package corejava;


//final class can not be inherited
//final variable value can not be changed
//final method can not be overridden
public  class Final {
   //  final int x ;  CE : must be initialized
    //can be initialized in instance block
    {
       // x= 10;
    }

    //can be initialized inside constructor
    Final(){
       // x=10;
    }

    ////can not  be initialized inside method
    void set(){
        //x =10;
    }

    public final void show(){
        System.out.println("JAVASE");
    }
}

class Final2 extends Final{

    //can not be override
//    public final void show(){
//        System.out.println("JAVASE");
//    }

}
