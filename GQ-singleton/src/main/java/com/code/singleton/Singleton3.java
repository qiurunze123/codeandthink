package com.code.singleton;

/**
 * 双重锁检查
 */
public class Singleton3 {

    private Singleton3(){}

    private static Singleton3 INSTANCE =null;

    public static Singleton3 getInstance(){
        if(INSTANCE== null){
            synchronized (Singleton3.class){
                if(INSTANCE==null){
                    INSTANCE =new Singleton3();
                }
            }
        }
        return INSTANCE;
    }
    //：首先当一个线程发出请求后，会先检查instance是否为null，如果不是则直接返回其内容，
    // 这样避免了进入synchronized块所需要花费的资源
    // 两个线程同时进入了第一个if判断，那么他们也必须按照顺序执行synchronized块中的代码
    // ，第一个进入代码块的线程会创建一个新的Singleton实例，而后续的线程则因为无法通过if判断，而不会创建多余的实例。

    //其实也可能发生错误 -- https://blog.csdn.net/gangjindianzi/article/details/78689713

}
