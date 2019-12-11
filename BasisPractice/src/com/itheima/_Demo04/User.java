package com.itheima._Demo04;

public class User {

    //用户
    private String username;
    //余额
    private double leftMoney;

    public User() {
    }

    public User(String username, double leftMoney) {
        this.username = username;
        this.leftMoney = leftMoney;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }
    //展示信息的一个成员方法
    public void show(){
        System.out.println("用户名："+getUsername()+",余额："+getLeftMoney());
    }
}
