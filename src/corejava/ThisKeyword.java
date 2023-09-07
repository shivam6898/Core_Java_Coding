package corejava;


class ThisKeyword {

    int number; // Instance variable
    OtherClass otherClass = new OtherClass();


    //1.cons chaining
    ThisKeyword(){
        this(10);
    }

    ThisKeyword(int number) {
        // Differentiating Between Instance Variables and Local Variables:
        this.number = number;
    }

    //2.returning current Object
    ThisKeyword printNumber(int number) {
        // Using "this" to differentiate between the method parameter and the instance variable
        System.out.println("Parameter number: " + number);
        System.out.println("Instance variable number: " + this.number);
        print();
        return this;
    }

    //3.Passing the Current Object as an Argument
    void print(){
        otherClass.print(this);
    }

}

class OtherClass {

    public void print(ThisKeyword thisKeyword) {
        System.out.println(thisKeyword.number + " In other class");
    }
}

class Main {
    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();
        ThisKeyword thisKeyword = obj.printNumber(99);
        System.out.println(thisKeyword.number + " returning current object ");
    }
}
