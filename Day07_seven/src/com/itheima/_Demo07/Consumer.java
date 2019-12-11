package com.itheima._Demo07;

public class Consumer extends Thread {
    //传入包子类参数
    private BaoZi bz;

    public Consumer(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {

        while(true){
            synchronized (bz){
                if(bz.result){//如果没有包子
                    try {
                        System.out.println("包子还没有做好，请稍等");
                        bz.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //到这里证明有包子

                try {
                    System.out.println("正在吃包子，好香!");
                    Thread.sleep(2000);
                    System.out.println("包子吃完了，赶紧做包子啊");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.result = false;
                //唤醒包子铺
                bz.notify();

            }
        }
    }
}
