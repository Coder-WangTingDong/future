package com.fwtd.algorithm;

/**
 * @classname: NFactorial
 * @description: N的阶乘求和：1!+2!+...+N!
 * @date: 2021/12/13/8:29 下午
 * @author: wangtingdong
 * @email: it_wangtingdong@163.com
 */
public class NFactorial {

    public static int method1(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static int method2(int n) {
        if (n == 1) {
            return 1;
        }
        int factorial = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial;
        }
        return sum;

    }

    public static void main(String[] args) {
        // method1
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += method1(i);
        }
        System.out.println(sum);
        // method2
        System.out.println(method2(5));
    }
}
