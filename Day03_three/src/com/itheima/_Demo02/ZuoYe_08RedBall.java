package com.itheima._Demo02;

import java.util.HashSet;
import java.util.Random;

/*
双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
        红色球号码从1—33中选择；蓝色球号码从1—16中选择；
        请随机生成一注双色球号码。（要求同色号码不重复）
        */
public class ZuoYe_08RedBall {
    /**
     * 创建随机生成对象
     */


    public static void main(String[] args) {

        RedBall();
        BlueBall();
    }

    public static void RedBall(){

        HashSet<Integer> ha = new HashSet<>();
        Random r = new Random();
        System.out.println("随机生成的6个红色球：");
        while(ha.size()<6){//
            int redBall = r.nextInt(33)+1;
            //使用HashSet集合添加的元素在集合中自然不会重复
            ha.add(redBall);
        }

        System.out.println(ha);
    }
    public static void BlueBall(){
        HashSet<Integer> hb = new HashSet<>();
        Random r = new Random();
        System.out.println("随机生成的蓝色球：");
        int blueBall = r.nextInt(16)+1;
        //使用HashSet集合添加的元素在集合中自然不会重复
        hb.add(blueBall);
        System.out.println(hb);

    }
}
