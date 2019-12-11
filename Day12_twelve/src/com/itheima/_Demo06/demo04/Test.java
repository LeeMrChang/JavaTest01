package com.itheima._Demo06.demo04;

/**
 * 2.	定义一个函数式接口NumberSupplier,其中抽象方法int getNum(int...nums)，
 *  * 使用注解@FunctionalInterface
 *  * 3.	在测试类中定义static void getRandomNumFromOneToNum(int num , NumberSupplier ns),
 *  * 该方法的预期行为是使用ns得到一个从1到num(包含1和num)之间的随机数并打印
 *  * 4.	在测试类中定义static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns),
 *  * 该方法的预期行为是使用ns得到一个从a到b(包含a和b)之间的随机数并打印
 *  * 5.	在测试类中定义static void getRandomNumFromArray(int[] nums, NumberSupplier ns),
 *  * 该方法的预期行为是使用ns从数组nums中获取一个随机元素并打印
 *  * 6.	主方法中测试调用以上三个方法，使用方法引用完成需求
 */
public class Test {
    public static void main(String[] args) {
        //工具类对象
        RandomUtil ro = new RandomUtil();
        //
       getRandomNumFromOneToNum(new NumberSupplier() {
           @Override
           public int getNum(int... nums) {
               return ro.nextInt(nums);
           }
       }, 100);
       //使用lambda表达式
        getRandomNumFromOneToNum((num)->ro.nextInt(num),108);
        //方法引用方式
       getRandomNumFromOneToNum(ro::nextInt,67);
        //
        getRandomNumFromAToB(10, 20, new NumberSupplier() {
            @Override
            public int getNum(int... nums) {
                return ro.nextInt(nums);
            }
        });
        //lambda 表达式
        getRandomNumFromAToB(1,10,(num)->ro.nextInt(num));
        //引用方法
        getRandomNumFromAToB(30,40,ro::nextInt);
        //
        getRandomNumFromArray(new int[]{1, 2, 3, 5, 4, 7}, new NumberSupplier() {
            @Override
            public int getNum(int... nums) {
                return ro.nextInt(nums);
            }
        });
        //lambda表达式
        getRandomNumFromArray(new int[]{6,7,2,5,8,83,4,},(num)->ro.nextInt(num));
        //方法引用用
        getRandomNumFromArray(new int[]{6,7,2,5,8,83,4,},ro::nextInt);


    }
    public static void getRandomNumFromArray(int[] nums, NumberSupplier ns){
        //该方法的预期行为是使用ns从数组nums中获取一个随机元素并打印
        int num = ns.getNum(nums);
        System.out.println("从nums数字中的随机元素："+num);

    }

     public static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns){
        //在测试类中定义static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns),
         //该方法的预期行为是使用ns得到一个从a到b(包含a和b)之间的随机数并打印
         int num = ns.getNum(a, b);
         System.out.println("a到b之间的随机数："+num);
     }
    public static void getRandomNumFromOneToNum(NumberSupplier ns,int num){
        //使ns得到一个从1到num（包含1和num）之间的随机数并打印
            int sum = ns.getNum(num);
        System.out.println("1到num之间的随机数："+sum);
    }
}
