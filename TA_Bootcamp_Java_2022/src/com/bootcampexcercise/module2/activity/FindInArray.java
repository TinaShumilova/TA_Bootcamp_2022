package com.bootcampexcercise.module2.activity;

/**
 * Complete the code to find the largest number in the given array
 */


public class FindInArray {
    public static void main(String[] args) {
        int[] myArray = {1, 8, 10, 20, 8};
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.println("The largest number in the given array is " + max);
    }
}
