package javaeight;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employe {

    private Integer id;
    private String name;
    private Integer age;
    private List<Project> project;


    public Employe(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public Employe(Integer id, String name, Integer age, List<Project> project) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.project = project;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return name.equals(employe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", project=" + project +
                '}';
    }
}

class MainEmploye {
    public static void main(String[] args) {
        System.out.println(Arrays.stream("aabbccdefaa".split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));;
        List<Employe> employes = Arrays.asList(new Employe(1, "ram", 20)
                , new Employe(2, "shyam", 21)
                , new Employe(3, "ram", 20)
                , new Employe(4, "sita", 22)
                , new Employe(5, "raj", 19)
                , new Employe(6, "sita", 21)
                , new Employe(7, "lakhan", 22)
               // ,new Employe(8, null, 22)
        );

        Map<Integer, Employe> employeeMap = employes.stream()
                .collect(Collectors.toMap(
                        Employe::getId, // Key is the employee ID
                        employe -> employe // Value is the Employee object itself
                ));
        employeeMap.forEach((id,employe) -> System.out.println("EmpId: " + id+ " Employee"+employe));

        // <age,List<employee>>
        Map<Integer, List<Employe>> ageMap = employes.stream().collect(Collectors.groupingBy(employe -> employe.getAge()));
        System.out.println("Map of Employee as Age is Key "+ageMap);

        //<age,set<employee>> employee is unique
        Map<Integer, Set<Employe>> integerListMap = employes.stream().collect(Collectors.groupingBy(e -> e.getAge(), Collectors.toSet()));
        System.out.println("Map of Employee as Age is Key without duplicate employee "+integerListMap);

        //sorted
        Map<Integer, Set<Employe>> setMap = employes.stream().collect(Collectors.groupingBy(e -> e.getAge(), TreeMap::new, Collectors.toSet()));
        System.out.println("sort the employee with age "+setMap);

        List<Integer> ageList = employes.stream().map(e -> e.getAge()).sorted().collect(Collectors.toList());
        System.out.println("Age of employee in sorted order: " + ageList);

        IntSummaryStatistics intSummaryStatistics = ageList.stream().mapToInt(it -> it).summaryStatistics();
        System.out.println("Max age: " + intSummaryStatistics.getMax());
        System.out.println("Min age: " + intSummaryStatistics.getMin());
        System.out.println("Average age: " + intSummaryStatistics.getAverage());

        //find 2,and third youngest employee
        employes.stream().map(employe -> employe.getAge()).sorted().skip(1).limit(2).collect(Collectors.toSet());

       Set<Integer> ages = employes.stream().collect(Collectors.groupingBy(employe -> employe.getAge()))
               .keySet().stream().sorted().skip(1).limit(2).collect(Collectors.toSet());
        System.out.println("second and third youngest age "+ages);

        //upper case , and join with comma list of string
        String s = employes.stream().filter(e-> Objects.nonNull(e.getName())).map(e -> e.getName().toUpperCase()).sorted().distinct().collect(Collectors.joining(","));
        System.out.println(s);

        //find duplicate names
        List<String> nameList = employes.stream().map(emp -> emp.getName()).collect(Collectors.toList());
        Map<String, Long> mapName = nameList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<String> duplicateName = mapName.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toSet());
        System.out.println("Duplicate Names " + duplicateName);

        //another approach for duplicate name
        Set<String> names = nameList.stream().filter(name -> Collections.frequency(nameList, name) > 1).collect(Collectors.toSet());
        System.out.println(names);

        //Optional is used to handle null pointer exception
        String name = Optional.ofNullable("Ram").orElse("DEFAULT");
        System.out.println(name);


        //diff b/w orElse and orElseGet

        //if value present then also getname method is called
        String orElse = Optional.ofNullable("RAM").orElse(getName());

        //it will not call getName method if value present
        String orElseGet = Optional.ofNullable("RAM").orElseGet(() -> getName());

        //orElseThrow
        //Optional.ofNullable(null).orElseThrow(()-> new IllegalArgumentException("Please pass name"));

        //Intermediate-Terminal Operation
        List<Employe> limitEmp = employes.stream().limit(2).collect(Collectors.toList());
        System.out.println(limitEmp);

        //Intermediate short-circuit operation

        //findFirst returns wrapped Optional
        Employe firstEmp = employes.stream().filter(e -> e.getName().contains("ra")).findFirst().get();

        //it is sequential it will give first element only
        Employe firstAny = employes.stream().filter(e -> e.getName().contains("ra")).findAny().get();

        //now it doesn't know which it will return
        Employe firstAnyWithParallel = employes.parallelStream().filter(e -> e.getName().contains("ra")).findAny().get();


        Boolean anyMatchEmp = employes.stream().anyMatch(e -> e.getName().contains("ra"));

        //it will use && condition will match all employes containing ra in name
        Boolean isAllMatch = employes.stream().allMatch(e-> e.getName().contains("ra"));


        //noneMatch -> no one should match the condition
        Boolean noneMatch = employes.stream().noneMatch(e-> e.getName().contains("sa"));

        // Sort employees by name and then age using Java streams
        employes.sort(
                Comparator.comparing(Employe::getName)
                        .thenComparing(Employe::getAge)
        );
        employes.forEach(System.out::println);

        //count the number of employees age >  30
        Long countOfEmploye  =employes.stream().filter(e-> e.getAge()> 21).count();

       Optional<String> optionalName=employes.stream().filter(e-> e.getName().equals("test")).map(employe -> employe.getName()).findFirst();
       if (optionalName.isPresent()){
           System.out.println(optionalName.get());
       }else {
           System.out.println("name is not present");
       }

        List<Employe> employees = new ArrayList<>();
        Project projectA = new Project(101, "java", "Description A");
        Project projectB = new Project(102, "javascript", "Description B");
        Project projectC = new Project(103, "python", "Description C");
        Project projectD = new Project(104, "react", "Description D");
        Project projectE = new Project(105, "springboot", "Description E");

        List<Project> projectList1= new ArrayList<>();
        projectList1.add(projectA);
        projectList1.add(projectB);
        projectList1.add(projectC);


        List<Project> projectList2= new ArrayList<>();
        projectList2.add(projectA);
        projectList2.add(projectD);
        projectList2.add(projectE);

        employees.add(new Employe(1, "John", 30, projectList1));
        employees.add(new Employe(2, "Alice", 25, projectList2));
        employees.add(new Employe(3, "Bob", 35, projectList1));
        employees.add(new Employe(4, "Eve", 28, projectList2));
        employees.add(new Employe(5, "Charlie", 32, projectList1));

        Set<Project> allProjects= employees.stream().flatMap(employe -> employe.getProject().stream()).collect(Collectors.toSet());
        System.out.println("all projects of employee" + allProjects);

        Map<String, List<String>> employeeProjectsMap = employees.stream()
                .collect(Collectors.toMap(
                        Employe::getName,
                        employee -> employee.getProject().stream()
                                .map(Project::getProjectname)
                                .collect(Collectors.toList())
                ));
        System.out.println(employeeProjectsMap);







    }

    private static String getName() {
        System.out.println("get name called....");
        return "Annonymus";
    }

}
