package javaeight;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employe {

    Integer id;
    String name;
    Integer age;

    public Employe(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
                '}';
    }
}

class MainEmploye {
    public static void main(String[] args) {
        List<Employe> employes = Arrays.asList(new Employe(1, "ram", 20)
                , new Employe(2, "shyam", 21)
                , new Employe(3, "ram", 20)
                , new Employe(4, "sita", 22)
                , new Employe(5, "raj", 19)
                , new Employe(4, "sita", 21)
        );

        // <age,List<employee>>
        Map<Integer, List<Employe>> ageMap = employes.stream().collect(Collectors.groupingBy(employe -> employe.age));
        System.out.println(ageMap);

        //<age,set<employee>> employee is unique
        Map<Integer, Set<Employe>> integerListMap = employes.stream().collect(Collectors.groupingBy(e -> e.getAge(), Collectors.toSet()));
        System.out.println(integerListMap);

        //sorted
        Map<Integer, Set<Employe>> setMap = employes.stream().collect(Collectors.groupingBy(e -> e.getAge(), TreeMap::new, Collectors.toSet()));
        System.out.println(setMap);

        List<Integer> ageList = employes.stream().map(e -> e.getAge()).sorted().collect(Collectors.toList());
        System.out.println("ageList: " + ageList);
        IntSummaryStatistics intSummaryStatistics = ageList.stream().mapToInt(it -> it).summaryStatistics();

        System.out.println("Max age: " + intSummaryStatistics.getMax());
        System.out.println("Min age: " + intSummaryStatistics.getMin());
        System.out.println("Average age: " + intSummaryStatistics.getAverage());

        //find 2,and third youngest employee
        ageList.stream().skip(1).limit(2).collect(Collectors.toList());

        //upper case , and join with comma list of string
        String s = employes.stream().map(e -> e.getName().toUpperCase()).sorted().distinct().collect(Collectors.joining(","));
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







    }

    private static String getName() {
        System.out.println("get name called....");
        return "Annonymus";
    }

}
