package corejava.OOPS.objects.newkeyword;

public class Student {

    private int id;
    private String name;
    private String college;

    public Student(int id, String name, String college) {
        this.id = id;
        this.name = name;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student(1,"ramesh", "college_name");
        System.out.println(student);
    }
}
