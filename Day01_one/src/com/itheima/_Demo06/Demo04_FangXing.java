package com.itheima._Demo06;

public class Demo04_FangXing {
    public static void main(String[] args) {
        //创建一个类型为String的集合
        MVP<String> my = new MVP<String>();


        my.show("史蒂芬-库里");
        my.show(58);
        my.show("凯文-杜兰特");



        //调用setMVP
        my.setMvp("詹姆斯-哈登");
        //调用getMvp
        String stu = my.getMvp();
        System.out.println(stu);


        //创建一个泛型为Integer
        MVP<Integer> col = new MVP<Integer>();
        col.setMvp(10000);
        Integer mvp = col.getMvp();
        System.out.println(mvp);


    }
}
