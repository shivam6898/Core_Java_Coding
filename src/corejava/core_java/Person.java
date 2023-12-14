package corejava.core_java;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    private String name;
    private int age;


    public String getName(){
        return name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters for name and age

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}


 class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);

        // Will this return true?
        boolean containsPerson2 = personSet.contains(person2);

        personSet.stream().sorted(Comparator.comparing(Person::hashCode).thenComparing(Person::getName));

        System.out.println("Contains person2: " + containsPerson2);
    }
}

