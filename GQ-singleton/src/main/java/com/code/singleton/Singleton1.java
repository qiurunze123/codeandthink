package com.code.singleton;

/**
 * 懒汉式单例
 */
public class Singleton1 {
    /**
     *1.第一步先将构造方法私有化
     */
    private Singleton1(){}

    private static Singleton1 INSTANCE = null ;

    /**
     * 通过一个静态方法来获取单例的引用
     */
    public static Singleton1 getInstance(){
        if(INSTANCE ==null){
            INSTANCE = new Singleton1();
        }
        return INSTANCE;
    }

    //private 避免了类在外部被实例化 -- 唯一实例只能通过getInstance 方法访问

//    事实上，通过Java反射机制是能够实例化构造方法为private的类的，那基本上会使所有的Java单例实现失效。
//    此问题在此处不做讨论，姑且掩耳盗铃地认为反射机制不存在。）
//    但是以上懒汉式单例的实现没有考虑线程安全问题，它是线程不安全的，并发环境下很可能出现多个Singleton1 实例，
//    要实现线程安全，有以下三种方式，都是对getInstance这个方法改造，保证了懒汉式单例的线程安全，如果你第一次接触单例模式，
//    对线程安全不是很了解，可以先跳过下面这三小条，去看饿汉式单例，等看完后面再回头考虑线程安全的问题

}
