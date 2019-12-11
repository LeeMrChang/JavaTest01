package com.itheima._Demo10.demo02;
/*8
 匿名内部类方式实现线程的创建
 */
public class Test {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread()+"我们今天晚上一起去跑步啊！"+i);
                }
            }
        };
        new Thread(r).start();

        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread()+"👌"+i);
        }


    }
}
