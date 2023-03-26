package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee_MainClass {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("John", 30, "Developer", "New York"));
        employees.add(new Employee("Rock", 25, "Designer", "San Francisco"));
        employees.add(new Employee("Arnold", 35, "Manager", "Chicago"));

       List<Employee> emp= employees.stream().sorted().collect(Collectors.toList());
        emp.stream().forEach(emp1 -> System.out.println(emp1));

        System.out.println(emp);
        System.out.println("---------------------------------");
        List<Employee> emp12= employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(emp12);
        System.out.println("---------------------------------");
        List<Employee> emp22=employees.stream().filter(i -> i.getAge()>=30).collect(Collectors.toList());
        System.out.println(emp22);


    }
}

//To print the actual Comparable_Comparator.Employee objects instead of their reference, you can override the toString method
// in the Comparable_Comparator.Employee class to return a string representation of the object that includes the values of its fields
