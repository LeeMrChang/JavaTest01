package com.itheima._Demo03;

import java.io.File;

/**获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
 注意：不包含子文件夹下的文件

 *
 */
public class ZuoYe_08 {
    public static void main(String[] args) {
        //创建文件类对象
        File file = new File("D:\\IdeaProjects\\Code01");
        //先将文件夹转换成文件类对象File数组
        File[] files = file.listFiles();
        //遍历输出打印
        for (File dir : files) {
            System.out.println(dir);
        }
    }
}
