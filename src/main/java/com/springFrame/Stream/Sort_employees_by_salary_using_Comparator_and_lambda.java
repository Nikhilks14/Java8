package com.springFrame.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Sort_employees_by_salary_using_Comparator_and_lambda {
    public static void main(String[] args) {

        Map<String, Integer>  map = new HashMap<>(
        Map.of("user1",1000,
                "user2",1010,
                "user3",1020,
                "user4",1030)
        );

        // Option 1: Sort entries into a list
        List <Map.Entry<String,Integer>> sortedMap =
                map.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .toList();

        sortedMap.forEach(System.out::println);

        // Option 2: Store in a LinkedHashMap to keep sorted order

        Map<String, Integer> sortedMap1 =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1,e2) -> e1,
                                LinkedHashMap::new
                        ));
        
        System.out.println(sortedMap1);
        
        
        // Option 3: 

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("user1", 1000));
        employees.add(new Employee("user2", 1010));
        employees.add(new Employee("user3", 1020));
        employees.add(new Employee("user4", 1030));

        employees.sort(Comparator.comparing(Employee::getSalary));
        employees.forEach(System.out::println);
    }
}

class Employee {
    String user;
    int salary;
    
    Employee(String user , int salary){
        this.user = user;
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }

    public String toString(){
        return user + " : " + salary;
    }
}
