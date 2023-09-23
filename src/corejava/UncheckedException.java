package corejava;

//create custom exception
class NegativeNumberException extends RuntimeException{
    public NegativeNumberException(String number_is_negative) {
        super(number_is_negative);
    }
}


public class UncheckedException {

    public static int cube(int a ) throws NegativeNumberException {
        if (a>0){
            return a*a;
        }else{
            throw new NegativeNumberException("NUMBER IS NEGATIVE");
        }
    }

    public static void main(String[] args) {
        cube(-10);
    }
}
