package com.hlovex.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AutowiredTest {

    private Bar bar;

    private Baz baz;

    @Autowired(required = false)
    public AutowiredTest(Bar bar){
        this.bar = bar;
    }
    @Autowired(required = false)
    public AutowiredTest(Baz baz){
        this.baz = baz;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation.xml");
        AutowiredTest autowiredTest = ctx.getBean(AutowiredTest.class);
        System.out.println(autowiredTest);
    }
}
