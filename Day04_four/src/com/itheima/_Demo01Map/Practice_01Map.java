package com.itheima._Demo01Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合，接口，子类：HashMap类、LinkedHashMap类
 * 常用方法：
 * public V put(K key, V value) :  把指定的键与指定的值添加到Map集合中。
 * public V remove(Object key) : 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的 值。
 * public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
 * public Set<K> keySet() : 获取Map集合中所有的键，存储到Set集合中。
 * public Set<Map.Entry<K,V>> entrySet() : 获取到Map集合中所有的键值对对象的集合(Set集合)。
 */
public class Practice_01Map {

    public static void main(String[] args) {

        //创建HashMap<K,V>集合对象
        HashMap<String,String> map = new HashMap<>();


        //往Map集合里添加有映射关系的键值元素  map.put()
        map.put("叶开","丁琳铃");
        map.put("傅红雪","卓玉贞");
        map.put("李寻欢","表妹");
        map.put("李坏","月神");

        //查看Map集合里面有多少对映射关系的键值元素  map.size()
        System.out.println(map.size());

        //打印Map集合
        System.out.println(map);

        //删除键，返回被删除元素键的值   map.remove(); 如果查找得键不存在，返回得值得到null
        System.out.println(map.remove("李寻欢"));
        System.out.println(map.get("李寻欢"));

        //根据指定的键，获取对应的值，map.get()
        System.out.println(map.get("李坏"));

        //获取Map中的所有键，存储到Set集合中，Set集合中的元素无序、不能重复、 map.keySet()
        //获取键集
        Set<String> key = map.keySet();

        //遍历打印Set集合中所拥有Map的键
        for (String s : key) {
            System.out.println(s);
        }

        //获取值集 获取Map集合中键所对应的所有值得对象，Collection集合中的元素是有序，可重复的，有索引
        Collection<String> val = map.values();
        System.out.println(val);
        //遍历map集合的值集合
        for (String s : val) {
            System.out.println(s);
        }
        for (String s : key) {
            String v = map.get(s);//此时返回的是map集合里的value值
            System.out.println(s+"的对象是："+v);
        }

        //获取map集合的键值对，方可遍历
        Set<Map.Entry<String, String>> set = map.entrySet();
        //遍历map集合的键值对
        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey()+"想杀死"+entry.getValue());
        }


    }

}
