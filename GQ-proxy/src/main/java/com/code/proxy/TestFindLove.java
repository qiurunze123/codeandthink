package com.code.proxy;


import com.code.proxy.custom.GQMeipo;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class TestFindLove {
    public static void main(String[] args) {
////        new Zhangsan().findLove();
//        try {
//            Person obj = (Person) new Meipo().getInstance(new Zhangsan());
//            System.out.println(obj.getClass());
//            obj.findLove();
//            //获取字节码内容
//            byte[] data = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//            FileOutputStream os = new FileOutputStream("$Proxy0.class");
//            os.write(data);
//            os.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
         //JDK动态代理原理
        //原理：
        //1.拿到被代理对象的引用，然后获取它的接口
        //2.JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
        //3.把被代理对象的引用也拿到了
        //4.重新动态生成一个class字节码
        //5.然后编译
        Person obj = null;
        try {
            obj = (Person)new GQMeipo().getInstance(new Zhangsan());
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(obj.getClass());
        obj.findLove();
    }

}
