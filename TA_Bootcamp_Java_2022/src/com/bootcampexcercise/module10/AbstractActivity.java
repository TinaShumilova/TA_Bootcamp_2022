package com.bootcampexcercise.module10;

public class AbstractActivity {
    public static void main(String[] args) {

        Employee newEmployee = new Employee();
        Students newStudent = new Students();

        newEmployee.setName("Tina Shumilova");
        newEmployee.setAge(34);
        newEmployee.setCompany("Accenture");
        newEmployee.setJobTitle("manager");
        newEmployee.setSalary(2000.00);

        newStudent.setSchoolName("Geekbrains");


        System.out.println("***** Introduce from employee *****");
        newEmployee.introducePerson();
        System.out.println("***** Introduce from student *****");
        newStudent.introducePerson();


    }
}
