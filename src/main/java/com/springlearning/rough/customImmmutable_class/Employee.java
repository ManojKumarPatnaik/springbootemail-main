package com.springlearning.rough.customImmmutable_class;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public final class Employee {
    private final String name;
    private final Date data;
    private final List<String> stringList;
    private final Address address;
    private final double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", data=" + data +
                ", stringList=" + stringList +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public Date getData() {
        return (Date) data.clone();
    }

    public List<String> getStringList() {
        return new ArrayList<>(stringList);//clone
    }

    public Address getAddress() {
        return new Address(address.getZipCode(),address.getCity());//use copy of it
    }

    public Employee(String name, Date data, List<String> stringList, Address address, double salary) {
        this.name = name;
        this.data = data;
        this.stringList = stringList;
        this.address = address;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Address address1=new Address(53444,"blr");
        Employee employee=new Employee("Manoj", new Date(), Arrays.stream(new String[]{"Manoj","kumar"}).collect(Collectors.toList()),
              address1, 1030030);
        var list=new ArrayList<Employee>();
        list.stream().collect(Collectors.groupingBy(Employee::getData,
                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));

        Map<Date, Employee> dateEmployeeMap = list.stream().collect(Collectors.groupingBy(Employee::getData,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                        Optional::get)));


        employee.getAddress().setCity("viz");
        System.out.println(employee);
    }
}
