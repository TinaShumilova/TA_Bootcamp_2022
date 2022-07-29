package com.bootcampexcercise.module10;

import java.util.List;
import java.util.ArrayList;

public class EmployeeList {
    public static void main(String[] args) {
        Employee e1 = new Employee("manager", "PrivatBank", 1500.00);
        Employee e2 = new Employee("head manager", "Maxima", 2000.00);
        Employee e3 = new Employee("seller", "Elkor", 3000.00);
        Employee e4 = new Employee("teacher", "Geekbrains", 1340.00);
        Employee e5 = new Employee("manager", "Sony", 5000.00);

        e1.setName("Tina");
        e2.setName("Viktor");
        e3.setName("Sarah");
        e4.setName("Steve");
        e5.setName("Maria");

        List<Employee> empList = new ArrayList<Employee>();

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        Employee obj = new Employee();
        System.out.println("The Employee whose salary is the highest is : " + obj.getHighestPaidEmp(empList));

    }

}
