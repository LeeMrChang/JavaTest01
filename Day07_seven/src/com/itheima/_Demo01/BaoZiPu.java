package com.itheima._Demo01;

public class BaoZiPu extends Thread {
    //定义一个包子
    BaoZi zi;

    //带参构造
    public BaoZiPu(String name, BaoZi zi) {
        this.zi = zi;
    }

    @Override
    public void run() {

        //定义一个变量来模拟做包子的次数
        int count = 0;
        //做包子是一个无限做的状态
        while (true) {

            synchronized (BaoZi.class) {
                //if(zi.falg==true){//如果有做包子的资源（材料），开始做包子,但吃货得等
                if (zi.falg == true) {
                    try {
                        //zi.wait();
                        BaoZi.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                    //代码执行到这里，跳过上面有包子的判断，这里就是没包子
                System.out.println("包子铺开始做包子");
                if (count % 2 == 0) {//包子铺有两种包子，一种凉皮，一种薄皮
                    zi.pier = "凉皮";
                    zi.xianer = "🐖肉";
                } else {
                    zi.pier = "薄皮";
                    zi.xianer = "🐮肉";
                }
                //做好一个包子加一次
                count++;
                //现在包子铺的状态是有包子了
                System.out.println("包子做好" + zi.pier + zi.xianer);
                System.out.println("出货来吃包子吧");
                zi.falg = true;
                //唤醒吃货、
                BaoZi.class.notify();
            }
        }

    }
}
