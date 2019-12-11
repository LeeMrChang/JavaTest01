package com.itheima._Demo01;

import java.io.FileNotFoundException;

/**
 *声明异常的格式:  其中一种格式
 * 修饰符 返回值类型 方法名（参数）throws 异常类名1...异常类名2...
 */
public class Practice_03 {

    public static void main(String[] args) throws FileNotFoundException {
        findAFile("v.txt");
    }

    public static void findAFile(String path) throws FileNotFoundException{

        if(!path.equals("a.txt")){//如果不是a.txt文件
            //就认为这是一个寻找错误，也就是异常
            //
            throw new FileNotFoundException("文件不存在！");
        }
    }
}
