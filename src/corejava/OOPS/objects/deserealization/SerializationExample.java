package corejava.OOPS.objects.deserealization;

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


public class SerializationExample {
    public static void main(String[] args) {
        // Serialize an object to file
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

        // Deserialize an object from file to object
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