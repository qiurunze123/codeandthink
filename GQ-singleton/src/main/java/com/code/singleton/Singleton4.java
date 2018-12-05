package com.code.singleton;

/**
 * 静态内部类
 */
public class Singleton4 {
    //先声明 一个静态内部类
    private static class LazyHolder{
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4 (){}

    //同样提供静态方法获取实例

    public static  Singleton4 getInstance(){
        return LazyHolder.INSTANCE;
    }
//    JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
//    这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，
//    并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心3.2中的问题。
//    此外该方法也只会在第一次调用的时候使用互斥机制，
//    最后instance是在第一次加载SingletonContainer类时被创建的，
//    而SingletonContainer类则在调用getInstance方法的时候才会被加载，因此也实现了惰性加载

}
