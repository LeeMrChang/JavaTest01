package com.itheima._Demo01;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

/**
 * Properties类
 * 属性集，属于Map集合下的一个属性集合
 */
public class demo_10 {

    public static void main(String[] args) {
        //创建Properties属性集
        Properties pro = new Properties();
        //添加元素到集合中。
        pro.setProperty("黄月英","小诸葛");
        pro.setProperty("小乔","周瑜");
        //遍历
        Set<String> keys = pro.stringPropertyNames();
        //
        for (String key : keys) {
            String value = pro.getProperty(key);
            System.out.println(key+"的对象是"+value);
        }

    }
}
