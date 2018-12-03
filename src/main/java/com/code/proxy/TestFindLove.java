package com.code.proxy;


import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class TestFindLove {
    public static void main(String[] args) {
//        new Zhangsan().findLove();
        try {
            Person obj = (Person) new Meipo().getInstance(new Zhangsan());
            System.out.println(obj.getClass());
            obj.findLove();
            //获取字节码内容
            byte[] data = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("$Proxy0.class");
            os.write(data);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
