package com.itheima._Demo02;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*8
项目根路径下有text.txt文件，内容如下：
	我爱黑马
	123456
利用IO流的知识读取text.txt文件的内容反转后写入text1.txt文件中，内容如下：
	123456
    我爱黑马
    提示：List集合反转元素的顺序时，用到了如下API。
java.util类 Collections
static void	reverse(List<?> list)
          反转指定列表中元素的顺序。

 */
public class ZuoYe_10 {
    public static void main(String[] args) throws IOException {

        //创建List集合
        List<String> list = new ArrayList<>();

        //创建读取对象
        BufferedReader fas = new BufferedReader(new FileReader("Day10_ten\\d.txt"));

        //定义变量来接收字符个数
        String b;
        while ((b = fas.readLine()) != null) {
            list.add(b);
        }
        //使用List反转
        Collections.reverse(list);
        System.out.println(list);
        //创建输出对象
        BufferedWriter fos = new BufferedWriter(new FileWriter("Day10_ten\\d1.txt"));
        //再写入
        for (int i = 0; i < list.size(); i++) {

            fos.write(list.get(i));
            fos.newLine();
        }
        fas.close();
        fos.close();
    }
}
