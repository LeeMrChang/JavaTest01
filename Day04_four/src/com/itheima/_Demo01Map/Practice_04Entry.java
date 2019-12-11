package com.itheima._Demo01Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Entry仅仅是Map里面内部接口，专门用来遍历Map集合里面具有映射关系的键值元素
 * 一对映射关系的键值元素组成一个项（Entry）
 * entry.getKey()就是对应键
 * entry.getvalue() 就是对应值
 *
 */

public class Practice_04Entry {

    public static void main(String[] args) {
        //
        //创建HashMap集合
        HashMap<String,String> map = new HashMap<>();
        //添加具有映射关系的键值元素
        map.put("吕布","貂蝉");
        map.put("刘备","孙尚香");
        map.put("后裔","嫦娥");

        //使用Entry方法遍历Map  entrySet(); 同样都是把键值存放在Set集合里面

        Set<Map.Entry<String, String>> entry = map.entrySet();

        for (Map.Entry<String, String> str : entry) {
            System.out.println(str.getKey()+"的媳妇是"+str.getValue());
        }


    }
}
