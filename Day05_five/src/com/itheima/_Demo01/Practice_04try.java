package com.itheima._Demo01;

import java.io.FileNotFoundException;

/**
 * 捕获异常方式2：try ... catch语句块
 *  try{
 *      可能出现异常的代码；
 *  }catch(异常类名 e){  //e 代表 throws出来的异常对象
 *      会默认给出处理方案（可主动对默认处理放啊进行修改）
 *  }
 */
public class Practice_04try {

    public static void main(String[] args) {
        System.out.println("开庭：审理条件");
        System.out.println("拿出证据");

        try{
            findEvidence("监控录像录到了！！！");//监测到异常
        } catch (FileNotFoundException e) {
            System.out.println("枪毙！！");//处理方案
        }
        System.out.println("审理结束！！");
    }

    public static void findEvidence(String evidence) throws  FileNotFoundException {

        if(evidence.equals("监控录像录到了！！！")){
            //这句话证明有异常
            throw new FileNotFoundException("证据确凿！！！");
        }else{
            System.out.println("找不到证据！！！");
        }

    }
}
