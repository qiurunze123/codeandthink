package com.code.proxy;

//张三 单身
public class Zhangsan implements Person {


    private String sex ="女";

    private String name ="张三";

    @Override
    public void findLove() {
        System.out.println("我叫"+this.name+"性别"+this.sex+"对象要求");
        System.out.println("高富帅！");
        System.out.println("有房有车");
        System.out.println("身高180cm");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
