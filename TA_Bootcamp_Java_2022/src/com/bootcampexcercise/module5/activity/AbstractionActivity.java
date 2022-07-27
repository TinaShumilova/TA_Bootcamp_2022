package com.bootcampexcercise.module5.activity;

public class AbstractionActivity {
    public static void main(String args[]) {

        Rectangle rect = new Rectangle();
        Circle circle = new Circle();
        // set and Print color of rectangle
        rect.setColor("red");
        System.out.println("-------------Color--------------");
        System.out.println("Color of rectangle is " + rect.getColor());


        // Give area of rectangle
        rect.setLength(5.3);
        rect.setBreadth(6.3);
        System.out.println("------------Rectangle's Area---------------");
        System.out.println("Area of rectangle is " + rect.calculateArea());

        // Print perimeter of rectangle
        System.out.println("------------Rectangle's perimeter---------------");
        System.out.println("Area of rectangle is " + rect.calculatePerimeter());

        // set and Print color of circle
        circle.setColor("black");
        System.out.println("-------------Color--------------");
        System.out.println("Color of rectangle is " + circle.getColor());
        // Give area of circle
        circle.setRadius(5.2);
        System.out.println("------------Circle's Area---------------");
        System.out.println("Area of rectangle is " + circle.calculateArea());

        // Print perimeter of circle
        System.out.println("------------Circle's perimeter---------------");
        System.out.println("Area of rectangle is " + circle.calculatePerimeter());

    }
}
