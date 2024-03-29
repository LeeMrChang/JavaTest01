package com.itheima._Demo06.demo06;

public class Book {

    //书名
    private String name;
    //出版社
    private String publishingCompany;

    public Book(String name, String publishingCompany) {
        this.name = name;
        this.publishingCompany = publishingCompany;
    }

    //bookMsg()拼接带书名号的书名
    private String bookMsg(String bookname) {
        return "《" + bookname + "》";
    }

    //publishingMsg()拼接出版信息
    private String publishingMsg(String msg) {
        return "【专柜正品<" + msg + ">原装绝版】";
    }

    //packSaleMsg()使用StringWrapper为上架销售信息包装
    public String packSaleMsg(String msg, StringWrapper wrapper) {
        return wrapper.wrap(msg);
    }

    //sale()上架销售
    public void sale() {
        //开始包装上架销售信息
        String saleMsg = packSaleMsg(bookMsg(name),(String)->this.bookMsg(name)) +
                packSaleMsg(publishingMsg(publishingCompany),(Stirng)->
                        this.publishingMsg(publishingCompany));
        System.out.println(saleMsg);
        //开始售卖
        System.out.println("2元一本，欲练此功，必先购买！");
    }
}


