package com.itheima.Demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//请使用Map集合存储自定义数据类型Car做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map集合
public class ZuoYe_02 {

    public static void main(String[] args) {

        HashMap<Car,Integer> map = new HashMap<>();
        //
       map.put(new Car("🐱",13),50);
       map.put(new Car("🐶",15),60);
       map.put(new Car("🐖",12),80);
       map.put(new Car("🐢",36),70);

       //使用keySet遍历
        Set<Car> cars = map.keySet();
        for (Car key : cars) {
            Integer value = map.get(key);
            System.out.println(key.getName()+"的价钱是"+value);
        }
        System.out.println("==============================");
        //entrySet方法遍历
        Set<Map.Entry<Car, Integer>> entry = map.entrySet();
        for (Map.Entry<Car, Integer> car : entry) {
            System.out.println(car.getKey().getName()+"的价钱是"+car.getValue());
        }


    }
}
