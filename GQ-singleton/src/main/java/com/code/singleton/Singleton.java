package com.code.singleton;

/**
 * 单例模式第一种写法 饿汉
 * @author qiurunze
 */
public class Singleton {

    /**
     * 此处直接定义类变量实例并且实例化，在类加载的时候就完成了实例化并保存在类中
     */
    public static Singleton INSTANCE = new Singleton();

    /**
     * 无参构造器 private 防止new
     */
    private Singleton(){}

    /**
     *  定义公开方法 返回以创建的单例
     */

    public  static Singleton getInstance(){
        return INSTANCE;
    }
}
