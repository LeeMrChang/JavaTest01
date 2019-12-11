package com.itheima._Demo01Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * 关于Map集合的遍历，因为是键值的映射关系，不能直接遍历
 * 必须把键值添加到Set集合中，Set集合可以遍历
 *
 */
public class Practice_03MapBinali {

    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<String,String> map = new HashMap<>();
        //添加具有映射关系的键值元素
        map.put("吕布","貂蝉");
        map.put("刘备","孙尚香");
        map.put("后裔","嫦娥");

        /*//遍历 用 map.keySet() 获取遍历Map集合的键
        Set<String> key = map.keySet();
        //
        for (String s : key) {
            System.out.println(s);
        }
        //遍历 用map.get() 获取遍历Map集合中的键对应的值 map.values();
        Collection<String> values = map.values();
        //
        for (String value : values) {
            System.out.println(value);
        }*/
        //遍历Map集合中具有映射关系的键值元素
        //获取键集，将键添加到Set集合中方可遍历  map.keySet()
        Set<String> keys = map.keySet();
        //获取值集，将值添加到Collection集合中遍历  map.values
        //Collection<String> values = map.values();
        //map集合的键值对
        for (String key : keys) {
            //根据键对应的每个值
            String value = map.get(key);
            System.out.println(key+"的媳妇是"+value);
        }

    }
}
