package com.bootcampexcercise.module10;

import java.util.HashMap;
import java.util.Map;

public class ElectronicItemDetails {
    public static void main(String[] args) {
        Map<String, Double> itemHashMap = new HashMap<>();
        itemHashMap.put("TV", 1534.99);
        itemHashMap.put("Refrigerator", 754.49);
        itemHashMap.put("Washing Machine", 499.99);
        itemHashMap.put("Laptop", 1754.99);

        ElectronicItemDetails obj = new ElectronicItemDetails();
        System.out.println("Price of TV is " + obj.returnPriceOfItem(itemHashMap, "TV"));

    }
    public double returnPriceOfItem(Map<String, Double> map, String name){
        return map.get(name);
    }

}
