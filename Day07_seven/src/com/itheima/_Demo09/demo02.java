package com.itheima._Demo09;

import java.util.Arrays;
import java.util.Collections;

public class demo02 {
    public static void main(String[] args) {

        Person[] arr = {new Person("小于",13),
                new Person("小昭",18),
                new Person("小及",15)};

        Arrays.sort(arr,(a,b)->{
            return b.getAge()-a.getAge();
        });

        for (Person person : arr) {
            System.out.println(person);
        }

    }
}
