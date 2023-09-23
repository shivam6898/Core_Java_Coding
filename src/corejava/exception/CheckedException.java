package corejava.exception;

class AgeException extends Exception{
    public AgeException(String messaage){
        super(messaage);
    }
}

public class CheckedException {
    public static String checkAge(int age) throws AgeException {
        if (age >18){
            return "registered";
        }else {
            throw new AgeException("AGE IS BELOW 18");
        }
    }
    public static void main(String[] args) {
        //here try catch is mandatory must be handeled by programmer
        try {
            checkAge(10);
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }
}
