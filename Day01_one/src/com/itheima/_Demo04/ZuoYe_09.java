package com.itheima._Demo04;
/*
(1)打印由7，8，9三个数组成的三位数，要求该三位数中任意两位数字不能相同；
  (2)打印格式最后的三位数字以空格分隔，如789 798 879 897 978 987。
  */

public class ZuoYe_09 {

    public static void main(String[] args) {

       String stu = "789";
       //创建一个字符串缓冲区，相当于一个字符串容器
       StringBuilder sb = new StringBuilder();
        //遍历3次
        for (int i = 0; i < 3; i++) {
            //先添加最原始字符串
            sb.append(stu);//789
            //判断为最后的索引时加空格
            if(i!=stu.length()){
                sb.append(" ");
            }
            //拼接第二个字符串
            stu = stu.substring(1).concat(stu.substring(0,1));//897
        }
        //System.out.println(sb.toString);
        //字符串反转打印输出
        stu = sb.toString()+" "+sb.reverse().toString();

        System.out.println(stu);


    }
}
