package com.hlovex.beandefinitioninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beandefinitioninheritance.xml");
        DerivedTestBean derivedTestBean = context.getBean(DerivedTestBean.class);
        System.out.println(derivedTestBean);

    }

}
