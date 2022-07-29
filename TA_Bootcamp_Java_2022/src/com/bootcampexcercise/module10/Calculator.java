package com.bootcampexcercise.module10;

import com.bootcampexcercise.module7.sample.CustomException;

public class Calculator {


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
        if (a == 0 || b == 0) {
            try {
                return String.valueOf(a / b);
            } catch (ArithmeticException e) {
                return "Division by zero is not allowed";
            }
        } else {
            double c = Double.valueOf(a);
            double d = Double.valueOf(b);
            result = (c / d);
            return String.valueOf(result);
        }

    }

}
