package com.itheima._Demo01;
//写一个泛型方法，实现任意引用类型数组指定位置元素交换。
public class ZuoYe_09 {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,6};
        method(arr,0,2);

    }
    public static <E> void method(E[] e,int a,int b){

        E temp = e[a];

        e[a] = e[b];

        e[b] = temp;

        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i]+" ");
        }
    }

}
