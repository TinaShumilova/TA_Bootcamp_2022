package com.bootcampexcercise.module10;

public class Car implements Vehicle{
    @Override
    public void stop() {
        System.out.println("The car rides when you push gas pedal");

    }

    @Override
    public void start() {
        System.out.println("The car rides when you push brake pedal");

    }
}
