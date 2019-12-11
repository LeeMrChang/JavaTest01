package com.itheima._Demo06.demo07;

public class Test {
    public static void main(String[] args) {

        Car Q7 = getCar(Car::new);

        Q7.setBrand("奥迪");
    }

    public static Car getCar(BeanFactory<Car> factory) {
        return factory.getBean();
    }
     //4补全测试类中横线处的代码，完成原代码的需求
}
