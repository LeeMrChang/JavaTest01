package com.itheima._Demo08.demo08;

public class Test {
    public static void main(String[] args) {

        method(10,(s)->new int[s]);

         method(10, int[]::new);
    }
    public static int[] method(int length,Shuzu zu){

      return zu.Arraybbb(length);

    }
}
