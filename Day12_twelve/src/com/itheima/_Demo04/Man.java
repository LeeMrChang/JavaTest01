package com.itheima._Demo04;

/**
 * 子类Man继承父类Human
 *
 * Lambda表达式： () -> super.sayHello()
 * 方法引用： super::sayHello
 */
public class Man extends Human{
        //重写父类的成员方法
    @Override
    public void sayHello() {
        //super.sayHello();
       method(()->super.sayHello());
    }

    public void method(Greetable lambda){
         //接口对象调用接口方法
        lambda.greet();
        System.out.println("I'm a man!");
    }
}
