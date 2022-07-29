package com.bootcampexcercise.module10;

import com.bootcampexcercise.module7.sample.CustomException;

public class Calculator {

public static void main(String[] args) {
      Calculator obj = new Calculator();
//        try {
//            System.out.println(obj.getProduct(5,2));
//        } catch (CustomExceptions c) {
//            System.out.println(c.getMessage());
//        }
        System.out.println(obj.getQuotient(2,20));
    System.out.println(2.0/20.0);

 }

    public int getSum(int a, int b) {
        return a + b;
    }

    public int getSum(int a) {
        return a + a;
    }

    public int getResidual(int a, int b) {
        return a - b;
    }

    public int getProduct(int a, int b) throws CustomExceptions {

        if (a == 0 || b == 0) {
            throw new CustomExceptions();
        } else {
            return a * b;
        }
    }

    public String getQuotient(int a, int b) {
        double result = 0.0;
        try {
            result = (a / b);
            return String.valueOf(result);
        } catch (ArithmeticException e) {
            return "Division by zero is not allowed";
        }

    }




}
