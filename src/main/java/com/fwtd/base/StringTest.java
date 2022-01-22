package com.fwtd.base;

/**
 * @classname: StringTest
 * @date: 2021/12/14/8:31 下午
 * @author: wangtingdong
 * @email: it_wangtingdong@163.com
 */
public class StringTest {

    static String s = "abc";

    static {
        System.out.println(s);
    }

    public StringTest() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = "edf";
//        String s3 = new String("aaa") + "bbb";
//        System.out.println(s1 + s2);
//        System.out.println(s3);
        //System.out.println(new StringTest());

        String str = "sd,,,,,eee";
        System.out.println(str.split(",").length);

    }
}
