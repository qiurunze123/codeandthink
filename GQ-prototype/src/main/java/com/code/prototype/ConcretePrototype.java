package com.code.prototype;

import java.util.ArrayList;

public class ConcretePrototype extends Prototype {

    private int age;
    private String name ;

    public ArrayList<String> list = new ArrayList<>();
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
