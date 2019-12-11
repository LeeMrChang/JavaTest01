package com.itheima.Test_01;

/**
 *  1：定义一个图书类Book，要求有如下属性：图书名称、价格、数量。
 *  并完成对应构造以及geter与setter功能；
 */
public class Book {
    //图书名称
    private String name;
    //价格
    private double price;
    //数量
    private int number;

    public Book() {
    }

    public Book(String name, double price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
