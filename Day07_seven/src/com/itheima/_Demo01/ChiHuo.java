package com.itheima._Demo01;

public class ChiHuo extends Thread{
        //给包子
    BaoZi zi;
    //再给一个带参构造，可传包子的参数
    public ChiHuo(String name,BaoZi zi){
        this.zi = zi;
    }

    @Override
    public void run() {
        //
        while(true){
            synchronized (BaoZi.class){
                //if(zi.falg = false){//没有包子了
                if(zi.falg==false){
                    try {
                        //zi.wait();//吃货在吃包子，包子铺等待状态
                        BaoZi.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                    System.out.println("吃货正在吃"+zi.pier+zi.xianer+"包子");
                    zi.falg = false;//没有包子了
                    //唤醒包子铺
                BaoZi.class.notify();
            }

        }
    }
}
