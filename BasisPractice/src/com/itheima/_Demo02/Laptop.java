package com.itheima._Demo02;

public class Laptop {

    public void run() {
        System.out.println("笔记本运行");

    }
    public void shutDown(){
        System.out.println("笔记本关闭了！");
    }

    //判断笔记本是否有USB
    public void useUSB(USB usb) {
        if (usb != null) {
            usb.open();
        }
        //类型转换，调用特有的方法
        if(usb instanceof Mouse){//判断调用鼠标
            Mouse m = (Mouse)usb;
            m.click();  //调用了鼠标的特有功能
        }else if(usb instanceof KeyBoard){//判断调用键盘
            KeyBoard k = (KeyBoard) usb;///-->自动转换
            k.type();  //调用了键盘的特有功能
        }
        usb.close();
    }
}
