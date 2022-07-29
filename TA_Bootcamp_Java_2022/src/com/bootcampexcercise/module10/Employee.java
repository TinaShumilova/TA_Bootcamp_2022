package com.bootcampexcercise.module10;

public class Employee extends Person{

    private String jobTitle;
    private String company;
    private double salary;

    public Employee(String jobTitle, String company, double salary){
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public Employee(String jobTitle, String company){

        this(jobTitle, company, 0);
    }

    public Employee(String jobTitle){

        this(jobTitle, "none", 0);
    }

    public Employee(){

        this("none", "none", 0);
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void introducePerson() {
        System.out.println("My name is " + getName() + " and i am " + getAge() + " years old");
        System.out.println("I work as " + this.jobTitle +" in " + this.company + " and my salary is " + this.salary);

    }
}
