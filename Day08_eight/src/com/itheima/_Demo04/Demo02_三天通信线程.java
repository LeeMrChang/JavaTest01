package com.itheima._Demo04;

public class Demo02_三天通信线程 {
    //创建静态共享变量
    static int i = 1;//标记变量，用来分别三种情况

    public static void main(String[] args) {

        String s = "锁对象";
       //创建第一线程任务对象
       new Thread(()->{

           while(true){
               //设置同步锁
               synchronized (s){
                   while(i!=1){//不是1 的情况，此线程休眠
                       try {
                           s.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                   //如果以上判断没有运行，就是1的情况
                   String name = Thread.currentThread().getName();
                   System.out.println(name+"此线程运行");
                    //此时修改标记变量
                   i=2;
                   //唤醒其他线程
                   s.notifyAll();
               }
           }
       }).start();
        //创建第二线程任务对象
        new Thread(()->{
            while(true){
                //设置同步锁
                synchronized (s){
                    while (i!=2){//不是2 的情况，此线程休眠
                        try {
                            s.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //如果以上判断没有运行，就是2的情况
                    String name = Thread.currentThread().getName();
                    System.out.println(name+"此线程运行");
                    //此时修改标记变量
                    i=3;
                    //唤醒其他线程
                    s.notifyAll();
                }
            }
        }).start();
        //创建第三线程任务对象
        new Thread(()->{

            while(true){
                //设置同步锁
                synchronized (s){
                    while (i!=3){//不是3 的情况，此线程休眠
                        try {
                            s.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //如果以上判断没有运行，就是3的情况
                    String name = Thread.currentThread().getName();
                    System.out.println(name+"此线程运行");
                    //此时修改标记变量
                    i=1;
                    //唤醒其他线程
                    s.notifyAll();
                }
            }
        }).start();


    }
}
