package com.bootcampexcercise.module10;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("The bike rides when you pedal");
    }

    @Override
    public void stop() {
        System.out.println("The bike stops when you push steering lever");

    }
}
