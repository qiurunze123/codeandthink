package com.code.factory.abstr;

import com.code.factory.Car;
import com.code.factory.methodfunc.AudiFactory;
import com.code.factory.methodfunc.BenzFactory;
import com.code.factory.methodfunc.BmwFactory;

public abstract  class AbstractFactory {

    abstract  Car getCar();

    //这段代码就是动态配置的功能
    //固定模式的委派
    //可以看做是配置
    public Car getCar(String name){
        if("BMW".equalsIgnoreCase(name)){
            return new BmwFactory().getCar();
        }else if("Benz".equalsIgnoreCase(name)){
            return new BenzFactory().getCar();
        }else if("Audi".equalsIgnoreCase(name)){
            return new AudiFactory().getCar();
        }else{
            System.out.println("这个产品产不出来");
            return null;
        }
    }}
