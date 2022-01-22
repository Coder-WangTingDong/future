package com.fwtd.designpattern;

/**
 * @classname: TemplateMethod
 * @description: 模板方法(钩子函数)
 * @date: 2021/12/06/11:01 下午
 * @author: wangtingdong
 * @email: it_wangtingdong@163.com
 */
public class TemplateMethod {
    public static void main(String[] args) {
        F f = new C1();
        f.f();
    }
}

/**
 * @description: 定义抽象类
 */
abstract class F {
    protected abstract void op1();
    protected abstract void op2();
    /**
     * @description:  模板功能，不同的子类实现自己独特的功能，但是执行流程已定
     */
    void f() {
        op1();
        op2();
    }
}

class C1 extends F{

    @Override
    protected void op1() {
        System.out.println("op1");
    }

    @Override
    protected void op2() {
        System.out.println("op2");
    }
}