package com.bootcampexcercise.module5.activity;

public class Circle extends Shape{
    // TODO: Implement calculateArea and calculatePerimeter in this class
    private double radius = 0.0;

    private double pi = 3.14;

    public Circle(){
        System.out.println("This is circle");
    }
    /*public double getRadius() {
        return radius;
    }
*/
    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double calculatePerimeter() {
        double result = pi * radius;
        return result;
    }

    public double calculateArea() {
        double result = pi * (radius * radius);
        return result;
    }
}
