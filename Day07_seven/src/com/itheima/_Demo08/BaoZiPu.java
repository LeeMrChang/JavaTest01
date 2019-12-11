package com.itheima._Demo08;

public class BaoZiPu extends Thread {
    //把 有没有包子的结果传过来，没包子
    private BaoZi zi;

    public BaoZiPu(BaoZi zi) {
        this.zi = zi;
    }

    @Override
    public void run() {
        //需要无限吃包子
        while (true){
            //创建同步锁，使多线程都在同步锁内，线程方可一步一步执行,此时同步锁对象统一使用包子对象
            synchronized (zi){
                //判断，此时是否有包子，没有，则吃货线程进入等待，
                if(zi.result){//初始为没有包子，此时吃货线程进入等待
                    try {
                        System.out.println("包子没有做好，吃货请稍等！");
                        zi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //如跳过判断，就是有包子的话，吃一个包子需要2秒
                try {
                    System.out.println("包子铺做好包子了，吃货快来吃包子！");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("吃货吃完包子了，包子铺快做包子");
                //包子被吃完了。修改包子状态，唤醒吃货线程
                zi.result=false;
                zi.notify();

            }

        }
    }
}
