package com.itheima._Demo08.demo06;

public class Man extends Human {

    @Override
    public void sayHello() {
        //使用lambda表达式指向父类方法
        method(()-> super.sayHello());
        //方法引用
        method(super::sayHello);
    }

    //创建接口的子类对象Greetable
    public static void method(Greetable ta){
        ta.greet();
    }
}
