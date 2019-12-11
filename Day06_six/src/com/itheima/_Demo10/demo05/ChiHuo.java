package com.itheima._Demo10.demo05;

public class ChiHuo extends Thread {

    private BaoZi zi;

    public ChiHuo(BaoZi zi) {
        this.zi = zi;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (zi) {
                if (zi.flag == true) { //此时是有包子状态，包子铺进入等待状态
                    try {
                        zi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //跳过上判断，则是没有包子状态
                    System.out.println("包子铺开始做包子");
                    if (count % 2 == 0) {
                        zi.pier = "饼皮";
                        zi.xianer = "五仁";
                    } else {
                        zi.pier = "薄皮";
                        zi.xianer = "猪肉";
                    }
                    count++;
                    //包子做好，有包子状态
                    zi.flag = true;
                    System.out.println("包子做好了：" + zi.pier + zi.xianer);
                    System.out.println("吃货来吃包子");
                    //唤醒吃货线程
                    zi.notify();


                }
            }
        }
    }
}
