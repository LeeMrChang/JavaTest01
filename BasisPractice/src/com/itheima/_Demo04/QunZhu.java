package com.itheima._Demo04;

import java.util.ArrayList;

//群主类
public class QunZhu extends User {
    //群主类
    //写编写发红包的方法

    //添加构造方可调用User里面的
    public QunZhu() {
    }

    public QunZhu(String username, double leftMoney) {
        super(username, leftMoney);
    }

    /**
     * 此方法用来发红包
     * 群主发红包，就是把一个整数的金额，分层若干等份。
     *         
     */
    public ArrayList<Double> send(int money, int count) {//要发的金额，要发的次数
        //判断群主钱包的余额是否能够发红包
        if (money > getLeftMoney()) {
            System.out.println("余额不足以发红包！");
            return null;
        }
        //修改钱包余额
        setLeftMoney(getLeftMoney() - money);

        //为更公平地拆分红包，
        money = money * 100;
        //创建一个集合来保存等额的红包金额
        ArrayList<Double> list = new ArrayList<>();

        //拆分红包
        int red = money / count;
        //取多出来的红包数
        int left = money % count;
        //将红包等分后添加进集合里
        for (int i = 0; i < count - 1; i++) {
            list.add(red / 100.0);
        }
        //将多余的钱添加到最后一份红包并添加去集合里
        list.add((red + left) / 100.0);
        //返回集合
        return list;


    }
}
