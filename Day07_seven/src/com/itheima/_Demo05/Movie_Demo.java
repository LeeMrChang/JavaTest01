package com.itheima._Demo05;

/**
 *在下面的代码中，请使用Lambda的省略格式调用 invokeDirect 方法，
 * 打印输出“导演拍电影啦！”字样：
 */
public class Movie_Demo {

    public static void main(String[] args) {

      /*  new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("导演拍电影啦！");
            }
        }).start();*/
        new Thread(()->{
            System.out.println("导演来拍电影了");
        }).start();


    }

    public static void invockDirect(Director tor){

    }
}
