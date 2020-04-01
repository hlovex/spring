package com.hlovex.beandefinitioninheritance;

public class DerivedTestBean {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public void initialize() {
        System.out.println("DerivedTestBean initialize");
    }

    @Override
    public String toString() {
        return "name:" + name + ";age:" + age;
    }
}
