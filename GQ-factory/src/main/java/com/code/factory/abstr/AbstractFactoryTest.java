package com.code.factory.abstr;

public class AbstractFactoryTest {
    /**
     * 设计模式的经典之处，就在于，解决了编写代码的人和调用代码的人双方的痛处
     * 	解放我们的双手
     * @param args
     */
    public static void main(String[] args) {
        DefaultFactory defaultFactory = new DefaultFactory();
        System.out.println(defaultFactory.getCar("Benz"));
    }
}
