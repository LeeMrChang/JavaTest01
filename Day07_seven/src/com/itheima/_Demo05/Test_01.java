package com.itheima._Demo05;

/**
 * 请在指定位置插入代码实现打印输出1-99。
 */
public class Test_01 {

    private int start = 1;

    private int end = 99;

    public static void main(String[] args) {

        new Test_01().method();

    }

    public void method(){
        //请在此位置插入代码
       /* Runnable tun = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    System.out.println(i);
                }
            }
        };*/


        //使用Lambda写
        Runnable a = ()->{
            for (int i = 1; i < 100; i++) {
                System.out.println(i);
            }
        };

        Thread t = new Thread(a);
        t.start();
    }
}
