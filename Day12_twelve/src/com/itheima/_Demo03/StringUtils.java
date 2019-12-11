package com.itheima._Demo03;

/**
 * 假设有一个 StringUtils 字符串工具类，其中含有静态方法 isBlank
 */
public class StringUtils {

    public static boolean isBlank(String str){

        return str == null || " ".equals(str.trim());
    }
}
