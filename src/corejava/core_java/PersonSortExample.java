package corejava.core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//The Comparable interface is used to define the default natural ordering of objects of a class
class Person implements Comparable<Person> {
    private int id;
    private int age;
    private String name;

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.getId(),other.getId());
    }
}

//The Comparator interface is used to define custom sorting  for objects
// that may not have a natural ordering or when you want to sort objects in multiple ways
class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        //compare by age
        int agecomparator = Integer.compare(person1.getAge(), person2.getAge());

        // If ages are the same, compare by name
        if (agecomparator == 0) {
            return person1.getName().compareTo(person2.getName());
        }
        return agecomparator;
    }
}

public class PersonSortExample {
    public static void main(String[] args) {
        List<Person> personListComparable = new ArrayList<>();
        personListComparable.add(new Person(2,21, "Ram"));
        personListComparable.add(new Person(1,20, "shyam"));
        personListComparable.add(new Person(3,20, "sita"));
        Collections.sort(personListComparable);
        System.out.println("Natural Sorting by id with comparable: " + personListComparable);
        System.out.println("-----------------------------------");
        List<Person> personListComparator = new ArrayList<>();
        personListComparator.add(new Person(2,21, "john"));
        personListComparator.add(new Person(1,20, "smith"));
        personListComparator.add(new Person(3,20, "alice"));
        Collections.sort(personListComparator, new PersonComparator());
        System.out.println("Custom Sorting by Age and Name using Comparator: " + personListComparator);

    }
}

//Natural Sorting by id with comparable: [Person{id=1, age=20, name='shyam'}, Person{id=2, age=21, name='Ram'}, Person{id=3, age=20, name='sita'}]
//-----------------------------------
//Custom Sorting by Age and Name using Comparator: [Person{id=3, age=20, name='alice'}, Person{id=1, age=20, name='smith'}, Person{id=2, age=21, name='john'}]
