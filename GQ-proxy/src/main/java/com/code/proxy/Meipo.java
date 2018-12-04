package com.code.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Meipo implements InvocationHandler {


    private Person targer;

    //获取被代理人的个人资料
    public Object getInstance(Person targer)  throws Exception{
        this.targer = targer;

        Class clazz = targer.getClass();
        System.out.println("被代理的class是："+clazz);
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("我是媒婆，你的性别是");
        System.out.println("开始运行过滤.......");
        this.targer.findLove();
        method.invoke(this.targer,objects);
        System.out.println("如果合适，准备结婚！！！！！！！！");

        return null;
    }


}
