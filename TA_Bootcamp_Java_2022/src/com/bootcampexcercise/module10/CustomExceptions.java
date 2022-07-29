package com.bootcampexcercise.module10;

public class CustomExceptions extends Exception{

    public String getMessage() {
        return "The result of multiplying by zero is always zero";
    }
}
