package com.itheima._IeveI2;

/**
 * 在一款角色扮演游戏中,每一个人都会有名字和生命值;角色的生命值不能为负数
 * 要求:当一个人物的生命值为负数的时候需要抛出自定的异常
 *
 * 3. 定义Person类
 * a)	属性:名称(name)和生命值(lifeValue)
 * a)	提供空参构造
 * b)	提供有参构造;
 * i.	使用setXxx方法给name和lifeValue赋值
 * c)	提供setter和getter方法
 * i.	在setLifeValue(int lifeValue)方法中
 * 1.	首先判断,如果 lifeValue为负数,就抛出NoLifeValueException,异常信息为:生命值不能为负数:xxx.
 * 2.	然后在给成员lifeValue赋值.
 */
public class Person {

    private String name ;

    private int lifeValue ;

    public Person() {
    }

    public Person(String name, int lifeValue) {
        this.name = name;
        this.lifeValue = lifeValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {

        if(lifeValue<0){
            throw new NoLifeValueExption("生命值不能为:"+lifeValue);
        }
        this.lifeValue = lifeValue;
    }
}
