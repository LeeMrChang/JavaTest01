package com.itheima._Demo02;
/**
 * 模拟线程池，游泳教练
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService cue = Executors.newFixedThreadPool(2);
        //创建线程任务对象
        MyRunnable mr = new MyRunnable();
        //代表4个需要学游泳的学生
        cue.submit(mr);
        cue.submit(mr);
        cue.submit(mr);
        cue.submit(mr);


    }
}
