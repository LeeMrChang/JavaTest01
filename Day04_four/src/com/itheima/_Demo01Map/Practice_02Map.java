package com.itheima._Demo01Map;

import java.util.HashMap;
import java.util.Set;

public class Practice_02Map {
    public static void main(String[] args) {

        //创建Hash Map集合
        HashMap<String,String> map = new HashMap<>();
        //添加映射关系得键值元素
        String put1 = map.put("至尊宝", "紫霞仙子");
        System.out.println("此时Map集合里得键值元素："+map);
        Set<String> key = map.keySet();
        for (String s : key) {
            System.out.println(s);
        }
        System.out.println(put1);

        String  v = map.put("项羽", "虞姬");
        //此时的键，在Map中并没有存在
        System.out.println(map);
        System.out.println(v);//null
        //
        String put = map.put("至尊宝", "白骨精");//此时白骨精替代了紫霞仙子
        System.out.println("此时键已在Map集合中存在，返回的值是："+put);//因为键已存在，返回的就是紫霞仙子
        System.out.println(map);
    }
}
