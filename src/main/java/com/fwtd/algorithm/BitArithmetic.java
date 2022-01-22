package com.fwtd.algorithm;

/**
 * @classname: BitArithmetic
 * @description: 打印32bit整数的二进制
 * @date: 2021/12/13/4:09 下午
 * @author: wangtingdong
 * @email: it_wangtingdong@163.com
 */
public class BitArithmetic {

    public static void printBitValue(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printBitValue(5);
    }
}
