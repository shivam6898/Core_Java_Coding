package corejava.core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Person {
   public int age ;
   public String name;
   Person(int age, String name){
       this.age=age;
       this.name=name;
   }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class PersonSort implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        //compare by age
        int agecomparator  = Integer.compare(person1.age,person2.age);

        // If ages are the same, compare by name
        if (agecomparator==0){
           return person1.name.compareTo(person2.name);
        }
        return agecomparator;
    }
}

public class PersonSortExample {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(21,"john"));
        personList.add(new Person(20,"smith"));
        personList.add(new Person(20,"alice"));
        Collections.sort(personList,new PersonSort());
        System.out.println(personList);
    }
}
