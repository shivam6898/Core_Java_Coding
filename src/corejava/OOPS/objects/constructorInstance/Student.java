package corejava.OOPS.objects.constructorInstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Student {

    private int id = 101;
    private String name ="Ramesh";

    public Student(){
        super();
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Constructor<Student> constructor;

        try {
            constructor = Student.class.getConstructor();
            Student student  = constructor.newInstance();
            System.out.println(student);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
