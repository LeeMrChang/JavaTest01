package com.itheima._Demo05;

import java.util.Arrays;

public class LotteryTest {

    public static void main(String[] args) {
        // 创建彩票功能类的对象
        Lottery lot = new Lottery();
        // 随机生成6个随机数  ->  中奖的红球
        int[] luckyRedBall = lot.getLuckyRedBall();
        // 打印数组
        System.out.println("随机生成的红色球："+Arrays.toString(luckyRedBall));
        // 随机生成1个随机数  ->  中奖的蓝球
        int luckyBlueBall = lot.getLuckyBlueBall();
        System.out.println("随机生成的篮球："+luckyBlueBall);
        // 键盘录入6个数字  ->  我的红球
        int[] myRedBall = lot.getMyRedBall();
        System.out.println("您输入的红色球："+Arrays.toString(myRedBall));
        // 键盘录入1个数字  ->  我的蓝球
        int myBlueBall = lot.getMyBlueBall();
        System.out.println("您输入的蓝色球："+myBlueBall);
        // 计算相同红球个数
        int sameRedCount = lot.getSameRedCount(luckyRedBall,myRedBall);
        System.out.println("红色球相同的个数："+sameRedCount);
        // 判断蓝球是否相同
        boolean isBlueSame = lot.getIsBlueSane(luckyBlueBall,myBlueBall);
        System.out.println("蓝色球相同的个数："+isBlueSame);
        // 开奖, 计算奖金
        lot.openLottery(sameRedCount,isBlueSame);

    }
}
