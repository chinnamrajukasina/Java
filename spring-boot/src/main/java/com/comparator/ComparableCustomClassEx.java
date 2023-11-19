package com.comparator;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ComparableCustomClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set< Employee> set = new TreeSet<>(Collections.reverseOrder());
		
		Employee e1 = new Employee("adani", 10000);
		Employee e2 = new Employee("mukesh", 7500);
		Employee e3 = new Employee("sukesh", 7500);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		//To print the set
		//set.stream().forEach(System.out::println);
		
	}
	
	
}

class Employee implements Comparable<Employee> {
    String name;
    Integer sal;

    public Employee(String name, Integer sal) {
        super();
        this.name = name;
        this.sal = sal;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        // Compare employees based on their salary
        return this.sal.compareTo(otherEmployee.sal);
    }

    @Override
    public String toString() {
        return name + "::" + sal;
    }
}

	
	
	
