package com.bootcampexcercise.module10;

public class AbstractActivity {
    public static void main(String[] args) {

        Employee newEmployee = new Employee();
        Students newStudent = new Students();

        newEmployee.setName("Tina");
        newEmployee.setAge(34);
        newEmployee.setCompany("Accenture");
        newEmployee.setJobTitle("Tester");
        newEmployee.setSalary(2000.00);

        newStudent.setSchoolName("GeekBrains");

        System.out.println("***** Introduce from employee *****");
        newEmployee.introducePerson();
        System.out.println("***** Introduce from student *****");
        newStudent.introducePerson();

    }
}
