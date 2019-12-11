package com.itheima._Demo07;

public class Produce extends Thread {
    //传入包子类参数
    private BaoZi bz ;

    public Produce(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {

        int count = 0;//做好的包子次数
        //包子铺一直做包子
       while(true){
           //同步锁
           synchronized (bz){
               if(!bz.result){//如果有包子
                   try {
                       System.out.println("吃货来吃包子了");
                       bz.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               //跳过上面的判断证明没有包子，需要做包子
               try {
                   System.out.println(Thread.currentThread().getName()+"包子做好了");
                   Thread.sleep(2000);
                   System.out.println("吃货快来吃包子");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               count++;
              bz.result = true;
               //唤醒吃货
               bz.notify();
           }
       }
    }
}
