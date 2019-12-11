package com.itheima._Demo03;

import java.io.File;
import java.io.IOException;

/**
 * 描述:
 * 将D盘下a.txt文件删除
 * 将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。
 */
public class ZuoYe_05 {

    public static void main(String[] args) throws IOException {
        //创建File文件对象
        File file = new File("D:\\a.txt");
        /*if(!file.exists()){
            file.createNewFile();
        }*/
        file.delete();


    }
}
