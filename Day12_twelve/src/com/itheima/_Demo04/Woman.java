package com.itheima._Demo04;

public class Woman extends Human {
        //Lambda表达式： () -> super.sayHello()
    // 方法引用： super::sayHello


    @Override
    public void sayHello() {
        //super.sayHello();
        method(()->super.sayHello());
    }

    public void method(Greetable lambda){
        //接口对象调用
        lambda.greet();
        System.out.println("I'm a Woman!");
    }
}
