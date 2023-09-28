package corejava.serelization;

import java.io.*;

// Define a class that implements Serializable
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}


//serialization is the  Process of writing state of an object to file.

// you cannot serialize static variables in Java using the standard Java serialization mechanism.
// Static variables are associated with the class itself, not with instances of the class.
// Serialization is designed to save the state of an object (i.e., the values of its non-static fields)
// and then restore that state when deserializing an object. Since static variables are not part of an instance's
// state, they are not saved or restored during serialization.

//transient is not part serialization


public class SerializationExample {
    public static void main(String[] args) {
        // Serialize an object
        try {
            Student student = new Student("John Doe", 20);
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Student object has been serialized to student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize an object
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student deserializedStudent = (Student) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Student object has been deserialized:");
            System.out.println(deserializedStudent);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
