package com.fwtd.thread;

/**
 * @classname: ExtendsThread
 * @description: 继承Thread
 * @date: 2021/12/06/9:50 下午
 * @author: wangtingdong
 * @email: it_wangtingdong@163.com
 */
public class ExtendsThread extends Thread{

    @Override
    public void run() {
        System.out.println("继承Thread类");;
    }

    public static void main(String[] args) {
        final ExtendsThread extendsThread = new ExtendsThread();
        extendsThread.start();
    }
}


