package corejava.OOPS.objects.newInstance;

public class Student {

    private int id = 101;
    private String name = "Ramesh";

    public Student() {
        super();
    }

    public Student(int id, String name) {
        super();
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
        String className = "corejava.OOPS.objects.newInstance";
        try {
            Class clasz = Class.forName(className);
            Student student = (Student) clasz.newInstance();
            System.out.println(student);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
