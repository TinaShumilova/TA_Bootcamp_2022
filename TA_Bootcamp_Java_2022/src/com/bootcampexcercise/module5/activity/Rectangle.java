package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape{
    // TODO: Implement calculateArea and calculatePerimeter in this class

    private double length = 0.0;
    private double breadth = 0.0;

    public Rectangle(){
        this.length = 0.0;
        this.breadth = 0.0;
        System.out.println("This is rectangle");
    }

    /*public double getLength() {
        return length;
    }
*/
    public void setLength(double length){
        this.length = length;
    }
/*
    public double getBreadth(){
        return breadth;
    }
*/
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double calculateArea(){
        double result = length * breadth;
        return result;
    }

    public double calculatePerimeter() {
        double result = (length + breadth) * 2;
        return result;
    }


}
