package com.itheima._Demo03.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *1.	使用lambda表达式分别将以下功能封装到Function对象中
 * a)	求Integer类型ArrayList中所有元素的平均数
 * b)	将Map<String,Integer>中value存到ArrayList<Integer>中
 * 2.	已知学生成
 * 3.	以学生姓名为key成绩为value创建集合并存储数据，使用刚刚创建的Function对象求学生的平均成绩
 */
public class Test_02 {
    public static void main(String[] args) {


        Map<String,Integer> map = new HashMap<String, Integer>();

        map.put("岑小村", 59);
        map.put("谷天洛", 82);
        map.put("渣渣辉", 98);
        map.put("蓝小月", 65);
        map.put("皮几万", 70);

        ArrayList<Integer> list = new ArrayList<>();

        Collection<Integer> values = map.values();

        for (Integer value : values) {
            list.add(value);
        }
        method((a)->{
            int num = 0;
            for (int i = 0; i < a.size(); i++) {
                num+=a.get(i);
            }
            return num/a.size();
        },list);

        print((m)->{
            int sum = 0;
            Collection<Integer> value = m.values();
            for (Integer integer : value) {
                sum+=integer;
            }
            return sum/m.size();
        },map);





    }
    public static void method(Function<ArrayList<Integer>,Integer> fun,ArrayList<Integer> list){

           fun.apply(list);
    }

    public static void print(Function<Map<String,Integer>,Integer> fun,Map<String,Integer> map){
        Integer apply = fun.apply(map);
        System.out.println(apply);

    }


}
