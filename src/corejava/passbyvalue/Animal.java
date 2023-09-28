package corejava.passbyvalue;

//java is pass by value
public class Animal {
    public static int legs = 2;

    public static void main(String[] args) {
        int value  = 1;
        changeLocalvar(value);
        System.out.println(value);

        Animal animal = new Animal();
        changeObjReference(animal);
        System.out.println(animal.legs);
    }

    //will not change the value , cause seprate copy of value is created and there value is changed
    public static void changeLocalvar(int copyOfValue ){
        copyOfValue  = 10;
    }

    //here we are passing the value as memory reference(memory address of Object)
    public static void changeObjReference(Animal copyOfAnimal){
        copyOfAnimal.legs = 4;
    }



}
