package com.itheima._Demo01;

import java.io.IOException;

/**
 * 捕获异常 try...catch
 */
public class Practice_05catch {

    public static void main(String[] args) {

    }

    //最大异常
    public static void method() throws IOException {
    } //

    public static void function() throws FileNotFoundExecption {
    }


    private static class FileNotFoundExecption extends Exception {
    }
}
