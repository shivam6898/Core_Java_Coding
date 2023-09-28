package javaeight;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee{
    String address ;
    int empal;
    String name ;
    Employee(String address){
        this.address= address;
    }
    Employee(int empSal){
        this.empal=empSal;
    }

    Employee(String name ,int empal){
        this.name=name;
        this.empal=empal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empal=" + empal +
                '}';
    }

    public String getAddress(){
        return  address;
    }

    public int getEmpal(){
        return empal;
    }

    public String getName(){
        return name;
    }
}

public class FindDuplicateEmployee {
    public static void main(String[] args) {
        List<Employee> employees= List.of(new Employee("Jaipur"),
                new Employee("Jaipur"), new Employee("Agra"));

        List<Employee> employeeSal= List.of(new Employee(10000),
                new Employee(20000), new Employee(15000));

        List<Employee> employeeNameSalList= List.of(new Employee("john",10000),
                new Employee("alex",20000), new Employee("john",15000));

        System.out.println(employeeSal.stream().sorted(Comparator.comparing(Employee::getEmpal).reversed()).collect(Collectors.toList()));
        System.out.println(employees.stream().map(Employee::getAddress).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

        System.out.println(
                employeeNameSalList.stream().map(emp -> emp.getName())
        );
    }
}
