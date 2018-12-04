package com.code.factory.simple;

import com.code.factory.Audi;
import com.code.factory.Benz;
import com.code.factory.Bmw;
import com.code.factory.Car;

//对于这个工厂来说(太强大了)
//为什么？
//这个工厂啥都能干(不符合现实)
//编码也是一种艺术(融汇贯通),艺术来源于生活，回归到生活的
/**
 *  简单工厂
 */
public class SimpleFactory {

    //实现统一管理、专业化管理
    //如果没有工厂模式，小作坊，没有执行标准的
    //如果买到三无产品（没有标准）
    //卫生监督局工作难度会大大减轻

    //中国制造(按人家的标准执行)
    //中国制造向中国创造改变(技术不是问题了，问题是什么？思维能力)
    //码农就是执行标准的人
    //系统架构师，就是制定标准的人
    public Car getCar(String name) {
        if ("BMW".equalsIgnoreCase(name)) {
            //Spring中的工厂模式
            //Bean
            //BeanFactory（生成Bean）
            //单例的Bean
            //被代理过的Bean
            //最原始的Bean（原型）
            //List类型的Bean
            //作用域不同的Bean
            //getBean
            //非常的紊乱，维护困难
            //解耦（松耦合开发）
            return new Bmw();
        } else if ("Benz".equalsIgnoreCase(name)) {
            return new Benz();
        } else if ("Audi".equalsIgnoreCase(name)) {
            return new Audi();
        } else {
            System.out.println("这个产品产不出来");
            return null;
        }
    }
    }