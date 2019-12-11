package com.itheima._Demo01;


//编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素


public class ZuoYe_10 {

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5, 6};

        method(arr);


    }

    public static <E> void method(E[] aee) {
            //元素反转的条件
        for (int min = 0, max = aee.length - 1; min < max; min++, max--) {

            E temp = aee[min];
            aee[min] = aee[max];
            aee[max] = temp;

        }
        for (int i = 0; i < aee.length; i++) {
            System.out.print(aee[i] + " ");
        }

    }

}
