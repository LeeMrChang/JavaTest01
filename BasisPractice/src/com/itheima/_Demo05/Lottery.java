package com.itheima._Demo05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

    /**
     * 创建随机对象
     */
    Random r = new Random();
    /**
     * 创建键盘录入
     */
    Scanner sc = new Scanner(System.in);


    /**
     * 此方法用于获取中奖的6个红球
     *
     * @return
     */

    public int[] getLuckyRedBall() {
        //创建长度为6的数组
        int[] arr = new int[6];
        //创建一个变量，用来当做赋值使用的索引
        int idnex = 0;
        //使用循环，不确定循环次数使用whlie循环
        while (true) {
            //随机生成一个1-33之间的随机数
            int i = r.nextInt(33) + 1;
            //判断，这个随机数是否在数组中已经存在
            //如果存在，结束当前循环，继续进行下一次循环
            if (isContains(i, arr) == true) {
                continue;
            }
            //如果不存在，将这个随机数添加到数组中去
            arr[idnex] = i;
            //添加了一次索引就自增一次
            idnex++;
            //判断如果最后一个索引赋值完成，就结束循环
            if (idnex == arr.length) {
                break;
            }

        }
        //排序一下
        Arrays.sort(arr);
        //返回数组
        return arr;


    }

    /**
     * 此方法用于判断一个数在数组中是否存在
     *
     * @param a   一个数
     * @param arr 一个数组
     * @return
     */

    public boolean isContains(int a, int[] arr) {
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return true;
            }
        }
        return false;
    }

    /**
     * 此方法用于获取1个中奖蓝色球
     *
     * @return
     */
    public int getLuckyBlueBall() {
        //随机生成的1-16之间的一个随机数
        return r.nextInt(16) + 1;
    }

    /**
     * 此方法用于获取6个自己录入的红色球
     *
     * @return
     */
    public int[] getMyRedBall() {

        System.out.println("请输入你要猜测的6个红色球：");
        //创建一个长度为6的数组
        int[] arr = new int[6];
        //创建一个变量，用于当做赋值使用的索引
        int index = 0;

        while (true) {
            int num = sc.nextInt();
            //判断这个数录入数不能与数组中的数重复
            //还要判断确定范围，在1-33之间
            if (isContains(num, arr) == true || 1 > num || num > 33) {
                System.out.println("您输入猜测的数字有误，请重新输入：");
                continue;//true则跳过
            }
            //如果不存在以上判断情况，则将这个数赋值到索引
            arr[index] = num;
            //索引自增
            index++;
            //当索引达到数组长度时，循环停止
            if (index == arr.length) {
                break;
            }
        }
        //数组排序
        Arrays.sort(arr);
        //返回数组
        return arr;

    }

    /**
     * 此方法用来获取中奖的蓝色球
     *
     * @return
     */
    public int getMyBlueBall() {
        //判断蓝色球的范围
        System.out.println("请输入您要猜测的蓝色球：");
        while (true) {
            int i = sc.nextInt();
            if (i > 0 && i < 17) {
                return i;
            }
            System.out.println("您输入的数字有误，请重新输入：");
        }


    }

    /**
     * 此方法用于计算录入的6个红色球与随机生成的6个红色球相同的个数
     *
     * @param luckyRedBall 随机生成的6个红色球
     * @param myRedBall    键盘录入的6个红色球
     * @return
     */
    public int getSameRedCount(int[] luckyRedBall, int[] myRedBall) {
        //定义一个数，来记录相同红色球的个数
        int count = 0;

        for (int i = 0; i < luckyRedBall.length; i++) {
            //获取当前中奖的红球
            int luck = luckyRedBall[i];

            for (int j = 0; j < myRedBall.length; j++) {
                //获取我录入的红色球
                int num = myRedBall[j];
                //两个结果相同的话，计数器自增
                if (luck == num) {
                    count++;
                }
            }
        }
        return count;


    }

    /**
     * 此方法用于计算蓝色球是否相同
     *
     * @param luckyBlueBall 随机生成的蓝色球
     * @param myBlueBall    键盘录入的蓝色球
     * @return
     */
    public boolean getIsBlueSane(int luckyBlueBall, int myBlueBall) {

        if (luckyBlueBall == myBlueBall) {
            return true;
        } else {
            return false;
        }
    }

    public void openLottery(int sameRedCount, boolean isBlueSame) {
        if (isBlueSame == true) {
            if (sameRedCount == 6) {
                System.out.println("恭喜您!~ 获取1000万奖金!~");
            } else if (sameRedCount == 5) {
                System.out.println("恭喜, 获得3000块钱!");
            } else if (sameRedCount == 4) {
                System.out.println("恭喜, 获得200块钱!");
            } else if (sameRedCount == 3) {
                System.out.println("恭喜, 获得10块钱!");
            } else if (sameRedCount == 2 || sameRedCount == 1 || sameRedCount == 0) {
                System.out.println("恭喜, 获得5块钱!");
            } else {
                System.out.println("再接再厉!");
            }


        } else {
            if (sameRedCount == 6) {
                System.out.println("恭喜您!~ 获取500万奖金!~您可以在深圳买房了, 剩下的钱, 慢慢还!~");
            } else if (sameRedCount == 5) {
                System.out.println("恭喜, 获得200块钱!");
            } else if (sameRedCount == 4) {
                System.out.println("恭喜, 获得10块钱!");
            } else {
                System.out.println("再接再厉");
            }
        }
    }
}
