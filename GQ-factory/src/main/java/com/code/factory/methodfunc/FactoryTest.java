package com.code.factory.methodfunc;


public class FactoryTest {
    public static void main(String[] args) {
        /**
         * 工厂模式 每个汽车都有自己的工厂 这样可以分割开来
         * 但是这个模式需要用户关心生产商
         * 增加代码的使用复杂度
         */
        Factory factory = new AudiFactory();
        System.out.println(factory.getCar());
        factory = new BenzFactory();
        System.out.println(factory.getCar());

        //抽象工厂出现
    }
}
