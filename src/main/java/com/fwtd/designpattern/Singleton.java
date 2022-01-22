package com.fwtd.designpattern;

/**
 * @classname: Singleton
 * @description: 单例
 * @date: 2021/12/07/7:47 下午
 * @author: wangtingdong
 * @email: it_wangtingdong@163.com
 */
public class Singleton {

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        for (int i = 0; i < 2; i++) {
//            executorService.submit(()-> System.out.println(Singleton3.getInstance()));
//        }
//        executorService.shutdown();
        ThreadTest threadTest = new ThreadTest();
        Thread t1 = new Thread(threadTest);
        t1.start();
        Thread t2 = new Thread(threadTest);
        t2.start();
    }
}

class ThreadTest implements Runnable{
    @Override
    public void run() {
        Singleton3 instance = Singleton3.getInstance();
        System.out.println(instance);
    }
}

/**
 * @description: 饿汉式
 */
class Singleton1 {
    // 私有变量
    private static final Singleton1 INSTANCE = new Singleton1();

    // 私有的构造方法
    private Singleton1() {
    }

    // 获取实例
    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}

/**
 * @description: 懒汉式
 * @question: 多线程访问会导致获取INSTANCE线程不安全
 */
class Singleton2 {
    // 私有变量
    private static Singleton2 INSTANCE;

    // 私有的构造方法
    private Singleton2() {
    }

    // 获取实例
    public static Singleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}

/**
 * @description: 懒汉式-线程安全:method使用synchronized修饰
 */
class Singleton3 {
    // 私有变量
    private static Singleton3 INSTANCE;

    // 私有的构造方法
    private Singleton3() {
    }

    // 获取实例:锁粒度比较重，并发情况下，效率不是太高，由于修饰的是static方法，该锁为类锁
    public synchronized static Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }
}

/**
 * @description: 懒汉式-双重判断锁机制
 * @question: 指令重排导致程序出现错误
 * Java中创建一个对象并非是一个原子操作，可以被分解成三行伪代码：
 * memory = allocate();// 1：分配对象的内存空间
 * ctorInstance(memory); // 2：初始化对象
 * instance = memory;// 3：设置instance指向刚分配的内存地址
 * 指令重排(JIT)后，分配了对象内存空间，即分配内存地址，但是没有初始化对象，当线程判断为空时由于对象不为空，返回
 * memory = allocate();// 1：分配对象的内存空间
 * instance = memory;// 2：设置instance指向刚分配的内存地址
 * ctorInstance(memory); // 3：初始化对象
 *
 */
class Singleton4 {
    // 私有变量
    private static Singleton4 INSTANCE;

    // 私有的构造方法
    private Singleton4() {
    }

    // 获取实例
    public static Singleton4 getInstance() {
        //if (INSTANCE == null) {
            synchronized (Singleton4.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton4();
                }
            }
        //}
        return INSTANCE;
    }
}

/**
 * @description: 懒汉式-双重判断锁机制 volatile
 */
class Singleton5 {
    // 私有变量使用volatile修饰，防止指令重排
    private static volatile Singleton5 INSTANCE;

    // 私有的构造方法
    private Singleton5() {
    }

    // 获取实例
    public static Singleton5 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton5.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton5();
                }
            }
        }
        return INSTANCE;
    }
}

/**
 * @description: 静态内部类
 */
class Singleton6 {
    // 静态内部类:JVM加载类只加载一次
    private static class StaticSingleton {
        public static final Singleton6 INSTANCE = new Singleton6();
    }

    // 获取实例
    public static Singleton6 getInstance() {
        return StaticSingleton.INSTANCE;
    }
}

/**
 * @description: 枚举单例，
 */
enum Singleton7 {
    INSTANCE;
}
