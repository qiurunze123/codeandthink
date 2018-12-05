package com.code.singleton;

/**
 * 懒汉式 2 加上同步
 */
public class Singleton2 {

    private Singleton2(){}

    private static Singleton2 INSTANCE = null;

    /**
     * 加锁 防止并发产生多个实例
     * 这种解决办法的确可以防止错误的出现，但是它却很影响性能：
     * 每次调用getInstance方法的时候都必须获得Singleton的锁，而实际上，当单例实例被创建以后，其后的请求没有必要再使用互斥机制了
     * @return
     */
    public static synchronized Singleton2 getInstance(){
        if(INSTANCE ==null){
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }

}
