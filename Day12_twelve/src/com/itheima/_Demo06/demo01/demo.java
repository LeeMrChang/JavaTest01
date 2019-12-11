package com.itheima._Demo06.demo01;

/**
 * 1.	定义一个函数式接口CurrentTimePrinter,其中抽象方法void printCurrentTime()，
 * 使用注解@FunctionalInterface
 * 2.	在测试类中定义static void showLongTime(CurrentTimePrinter timePrinter)，
 * 该方法的预期行为是使用timePrinter打印系统当前毫秒值
 * 3.	测试showLongTime(),通过lambda表达式完成需求
 */
public class demo {

    private static void showLongTime(CurrentTimePrinter timePrinter){
        //打印系统当前毫秒值
        long start = System.currentTimeMillis();
        System.out.println("当前毫秒值："+start);
        timePrinter.printCurrentTime();

    }

    public static void main(String[] args) {

       /* showLongTime(new CurrentTimePrinter() {
            @Override
            public void printCurrentTime() {
                System.out.println("lambda执行了！");
            }
        });*/
        //使用lamdba表达式
        showLongTime(()-> System.out.println("lambda执行了！"));

    }
}
