package com.bootcampexcercise.module2.activity;

public class PrintNumWithWhile {
    public static void main(String[] args) {
        int x = 0;
        while (x < 100){
            if (x%2 != 0){
                System.out.println("The value of x is " + x);
            }
            x++;

        }
    }
}
