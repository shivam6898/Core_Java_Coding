package corejava.core_java;

//it is object reference or reference varaiable beacause it  always ref super class memeory
//super class var,constructor, method
public class SuperKeyword   {

    public static void main(String[] args) {
      SubClass  subClass = new SubClass("test");
        subClass.demo();
    }

}

class ParentClass {
    public String name = "parent-classvar";

    ParentClass(String str){
        System.out.println("Parent constr call---"+ str);
    }

    public void method(){
        System.out.println("Parent class method");
    }

    public final void  print(){
        System.out.println("these final method can not be overriden in subclass");
    }

}

class SubClass extends ParentClass  {

    public String name = "sub-classvar";

    SubClass(String str) {
        super(str);
    }

    public void method(){
        System.out.println("SubClass class method");
    }

    public void demo(){
        System.out.println(name);
        System.out.println(super.name);
        method();
        super.method();
        super.print();
    }
}
//Parent constr call---test
//sub-classvar
//parent-classvar
//SubClass class method
//Parent class method
//these final method can not be overriden in subclass