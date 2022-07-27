package com.bootcampexcercise.module5.activity;

public abstract class Shape {
    public String color;
    private double area;
    private double perimeter;

    public Shape() {
    }

    //TODO:  Add abstract method calculateArea() and calculatePerimeter() with return type as double

    public void setColor(String c) {
        color = c;
    }
    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
