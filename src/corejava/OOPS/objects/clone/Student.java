package corejava.OOPS.objects.clone;


//implementing cloneable interface
public class Student implements  Cloneable{

    private int id;
    private String name;

    public Student() {
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
        Student student1 = new Student(1,"Ram");
        try {
            Student student2 = (Student) student1.clone();
            System.out.println(student2.id);
            System.out.println(student2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
