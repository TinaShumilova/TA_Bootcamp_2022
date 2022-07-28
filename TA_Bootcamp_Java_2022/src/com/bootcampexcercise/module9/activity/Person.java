package com.bootcampexcercise.module9.activity;

public class Person {
    private int weight;
    private float height;

    //TODO: Create getters and setters for weight and height


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


    public String humanBodyMassIndex(int weight, float height){
        float bmi = 0.0f;

        if (weight>0&&height>0.0f&&weight<=635&&height<=251){
            bmi = weight/(height*height);
            return String.valueOf(bmi);
        }else if (weight>632 &&height>251){
            return "It is impossible";

        }else {
            return "Please get me information";
        }
    }
    
}
