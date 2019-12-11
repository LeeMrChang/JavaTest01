package com.itheima.Demo05;

import java.lang.ref.PhantomReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * @ClassName:Newthread
 * @Author：Mr.lee
 * @DATE：2019/08/02
 * @TIME： 14:14
 * @Description: TODO
 */
public class NewThread extends Thread {


    public static void main(String[] args) {

        for (int i = 1; i <= 5000000 ; i++) {
           new Demo();
        }

        Map<String ,Object> map = new HashMap<>();



    }
}

