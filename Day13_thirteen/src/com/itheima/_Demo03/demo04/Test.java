package com.itheima._Demo03.demo04;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 统计三个字的省份的个数
 * 2、统计名字中包含方位名词的省份（东西南北）的个数
 * 3、打印名字中包含方位名词的普通省份（非自治区直辖市特别行政区）的名字
 * 4、将所有的特殊省份（自治区直辖市特别行政区）提取出来并放到新数组中
 */
public class Test {
    public static void main(String[] args) {

        String[] provinces = {"河北省", "山西省", "吉林省", "辽宁省",
                "黑龙江省", "陕西省", "甘肃省", "青海省", "山东省", "福建省", "浙江省",
                "台湾省", "河南省", "湖北省", "湖南省", "江西省", "江苏省", "安徽省",
                "广东省", "海南省", "四川省", "贵州省", "云南省", "北京市", "天津市",
                "上海市", "重庆市", "内蒙古自治区", "新疆维吾尔自治区", "宁夏回族自治区",
                "广西壮族自治区", "西藏自治区", "香港特别行政区", "澳门特别行政区"};
        //统计三个字的省份的个数
        long sanCount = Arrays.stream(provinces).filter(s -> s.length() == 3).count();
        System.out.println("三个字的省份个数：" + sanCount);
        //统计名字中包含方位名词的省份（东西南北）的个数
        long dong = Stream.of(provinces).filter(s -> s.contains("东")).count();
        long xi = Stream.of(provinces).filter(s -> s.contains("西")).count();
        long nan = Stream.of(provinces).filter(s -> s.contains("南")).count();
        long bei = Stream.of(provinces).filter(s -> s.contains("北")).count();
        System.out.println("省份里含东西南北的个数是：" + (dong + xi + nan + bei));
        //打印名字中包含方位名词的普通省份（非自治区直辖市特别行政区）的名字
        System.out.println("普通省份中包含方位名词的是：");
        Stream.of(provinces).filter(s -> s.contains("东") || s.contains("西") || s.contains("南")
                || s.contains("北")).filter(s -> s.contains("省")).forEach(System.out::println);
        //将所有的特殊省份（自治区直辖市特别行政区）提取出来并放到新数组中
        String[] one = Stream.of(provinces).filter(s -> s.contains("区") ||
                s.contains("市")).toArray(s->new String[s]);


    }
}
