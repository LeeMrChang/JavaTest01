package com.itheima._Demo06.demo10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/**
 * 2.	分别使用lambda表达式完成以下需求
 * a)	打印谷天洛的分数
 * b)	打印最高分
 * c)	分别以60分和70分为及格线，打印及格的人的名字(组合型消费)
 */
public class Test02 {

    public static <T> void doJob(T t, Consumer<T> consumer) {
        consumer.accept(t);
    }
    public static <T> void doJob(T t, Consumer<T> consumer1, Consumer<T> consumer2) {
        consumer1.andThen(consumer2).accept(t);
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //key:姓名 value:成绩
        map.put("岑小村",59);
        map.put("谷天洛",82);
        map.put("渣渣辉",98);
        map.put("蓝小月",65);
        map.put("皮几万",70);
        //打印谷天洛的分数
      doJob(map,(p)->
          System.out.println("谷天洛的分数："+p.get("谷天洛"))
      );
      //打印最高分
        doJob(map,(m)->{
            Collection<Integer> values = m.values();
            int max = 0;
            for (Integer value : values) {
                if(value>max){
                    max=value;
                }
            }
            System.out.println("最高分是："+max);
        });
        //分别以60分和70分为及格线，打印及格的人的名字(组合型消费)
        doJob(map,(m)->{
            System.out.println("60分及格的人：");
            for (Map.Entry<String, Integer> entry : m.entrySet()) {
                if(entry.getValue()>=60){
                    System.out.print(entry.getKey()+" ");
                }
            }
            System.out.println();

        },(m)->{
            System.out.println("70分以上的人：");
            for (Map.Entry<String, Integer> entry : m.entrySet()) {
                if(entry.getValue()>=70){
                    System.out.print(entry.getKey()+" ");
                }
            }

        });

    }

}
