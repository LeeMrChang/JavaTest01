package com.itheima._Demo01Map;

import java.util.*;

/**
 *
 */
public class Practice_06Linked {
    public static void main(String[] args) {

        LinkedHashMap<String,String> map = new LinkedHashMap<>();

        map.put("黄晓明","杨颖");
        map.put("文章","马伊利");
        map.put("王世聪","杨幂");

        /*Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+"的媳妇是"+map.get(key));
        }*/
        Set<Map.Entry<String, String>> vtr = map.entrySet();
        for (Map.Entry<String, String> entry : vtr) {
            System.out.println(entry.getKey()+"的离婚对象是"+entry.getValue());
        }
        //使用迭代器遍历
        Iterator<Map.Entry<String, String>> iter = vtr.iterator();
        
        while(iter.hasNext()){
            Map.Entry<String, String> next = iter.next();
            String key = next.getKey();//键
            String value = next.getValue();//值
            System.out.println(key+"="+value);

        }
        
    }
}
