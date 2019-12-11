package com.itheima._Demo01Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test_01 {

    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();

        //
        map.put("小林",22);
        map.put("小费",24);
        map.put("小谢",21);
        map.put("小张",25);

        Set<String> stu = map.keySet();
        Iterator<String> tor = stu.iterator();
        while(tor.hasNext()){
            String key = tor.next();
            Integer value = map.get(key);
            System.out.println(key+"+"+value);
        }


       /* Set<Map.Entry<String, Integer>> it = map.entrySet();
        Iterator<Map.Entry<String, Integer>> its = it.iterator();
        while(its.hasNext()){
            Map.Entry<String, Integer> entry = its.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }*/

    }
}
