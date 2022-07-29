package com.bootcampexcercise.module10;

public class Students extends Person{

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    @Override
    public void introducePerson() {
        System.out.println("I study in university " + this.schoolName);
    }
}
