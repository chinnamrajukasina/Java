package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String job;

    // Constructor
    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    // Implementing Comparable interface using compareTo for default sorting
    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    // Custom Comparator for sorting by name
    public static Comparator<Person> nameComparator = Comparator.comparing(Person::getName);

    // Custom Comparator for sorting by job
    public static Comparator<Person> jobComparator = Comparator.comparing(Person::getJob);

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, "Government"));
        people.add(new Person("Bob", 30, "Software"));
        people.add(new Person("Charlie", 22, "zoobusiness"));

        // Sorting using Comparable (based on age)
        Collections.sort(people);
        System.out.println("Sorted by age (using Comparable): " + people);

        // Sorting using custom Comparator (based on job)
        Collections.sort(people, Person.jobComparator);
        System.out.println("Sorted by job (using Comparator): " + people);

        // Sorting using a custom Comparator (based on name)
        Collections.sort(people, Person.nameComparator);
        System.out.println("Sorted by name (using Comparator): " + people);
    }
}
