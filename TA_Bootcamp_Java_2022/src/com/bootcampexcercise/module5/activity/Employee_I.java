package com.bootcampexcercise.module5.activity;

public class Employee_I extends Person_I {

    //Attributes
    private double salary;
    private String title;

    //Behavior
    public Employee_I() {
        System.out.println("I'm an Employee_I Constructor");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
