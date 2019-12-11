package com.itheima._Demo04;

import java.util.ArrayList;
import java.util.Random;

//
public class Menber extends User {
    //成员类
    public Menber() {
    }

    public Menber(String username, double leftMoney) {
        super(username, leftMoney);
    }
    /**
     * 此方法就是成员拿红包
     */
    public void openRedBag(ArrayList<Double> list){
            //创建Random类，随机从集合中抽取一份红包
        Random r = new Random();
        //在红包集合范围内创建一个索引
        int index = r.nextInt(list.size());
        //拿了一份红包，即把红包从集合中移除
        double moeny = list.remove(index);

        System.out.println(list);
        //修改成员金额
        setLeftMoney(moeny);

    }
}

