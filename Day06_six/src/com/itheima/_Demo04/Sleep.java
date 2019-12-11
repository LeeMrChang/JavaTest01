package com.itheima._Demo04;

public class Sleep extends Thread{

    public static void main(String[] args) {
            new Sleep().start();
    }
    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {
            //让线程输出10的数字的时候就打印一次输出总结
            if(i%10==1){
                System.out.println("----------火箭总冠军------------"+i);
            }

            try {//这里是要让程序计一个数的时候停顿一秒
                Thread.sleep(1000);
                //输出一句话，声明停顿时间
                System.out.println(i+"     此时停顿一秒！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
