package com.bootcampexcercise.module5.activity;

public class Person_I {
    //Attributes
    private String name;
    private int age;

    //Behavior
    public Person_I() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("I'm Person_I constructor");

    }

    public Person_I(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
