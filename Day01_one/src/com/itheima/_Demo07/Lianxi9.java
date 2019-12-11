package com.itheima._Demo07;
/*8
分别使用String的 += 和StringBuilder的append方法对字符串做100000次拼接，
计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印。
 */
public class Lianxi9 {
    public static void main(String[] args) {

        //创建开始打印时间
        long statr = System.currentTimeMillis();
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            sb.append("hello!");
        }

        //创建结束打印时间
        long end = System.currentTimeMillis();

        System.out.println("拼接100000次所需的打印时间："+(end-statr));
    }
}
