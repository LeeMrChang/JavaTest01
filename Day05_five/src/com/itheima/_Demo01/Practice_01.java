package com.itheima._Demo01;

/**
 * 抛出异常处理，关键字throw  Exception异常关键字
 * 使用格式：throw new 异常类名（参数）
 * ：
 */
public class Practice_01 {

    public static void main(String[] args) {

        //创建数组
        int[] arr = {2, 34, 56, 78};
        //根据索引找到元素
        int index = 4;
        int element = getElement(arr,index);

        System.out.println(element);
        System.out.println("over");

    }

    public static int getElement(int[] arr, int index) {
            //判断 索引是否越界
        if(index<0||index>arr.length-1){
            //如果数组越界，则抛出异常提示
            throw new ArrayIndexOutOfBoundsException("哥们，越界了！！");
        }
        int element = arr[index];
        return element;
    }
}
