package com.itheima._Demo04;

/**
 * Lambda表达式： () -> this.buyHouse()
 * 方法引用： this::buyHouse
 */
public class Husband {

    private void marry(Ricchable lambda){
        lambda.buy();
    }
    public void beHappy(){
            //this的是当前类中的另外buyHouse的方法
       // marry(()->this.buyHouse());
        marry(this::buyHouse);
    }

    public void buyHouse(){
        System.out.println("买套房子！");
    }

}
