package com.springlearning.SingleTon;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
//        Singleton singleton1 = Singleton.getInstance();
//        System.out.println(singleton1);


        var map = new HashMap<String, Integer>();
        map.put("manoj", 1);
        map.put("kunar", 2);
        map.put("ravi", 4);
        map.put("kaka", 3);
        map.put("james", 5);
        System.out.println(map);
        LinkedHashMap<String, Integer> stringIntegerLinkedHashMap = map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        LinkedHashMap<String, Integer> integerLinkedHashMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(integerLinkedHashMap);
        System.out.println(stringIntegerLinkedHashMap);

        Employee employee = new Employee(1, "manoj", "mec", 10000);
        Employee employee1 = new Employee(2, "kumar", "mec", 70000);
        Employee employee2 = new Employee(3, "rav", "mec", 30000);
        Employee employee3 = new Employee(4, "df", "bc", 20000);
        Employee employee4 = new Employee(5, "jhd", "bc", 40000);
        Employee employee5 = new Employee(6, "dkbcks", "bc", 50000);
        List<Employee> employeeList = List.of(employee, employee1, employee2, employee3, employee4, employee5);

        Map<Double, Employee> stringOptionalMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getDpt)),
                        Optional::get)));
        System.out.println(stringOptionalMap);

        Map<String, Employee> stringOptionalMap1 = employeeList.stream().collect(Collectors.toMap(Employee::getDpt,
                Function.identity(), BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary).reversed())));
        System.out.println(stringOptionalMap1);

        Map<String, Optional<Employee>> stringOptionalMap2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDpt,
                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)))));
        System.out.println(stringOptionalMap2);


    }
}

class Employee {
    private int id;
    private String name;
    private String dpt;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dpt='" + dpt + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, String dpt, double salary) {
        this.id = id;
        this.name = name;
        this.dpt = dpt;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
