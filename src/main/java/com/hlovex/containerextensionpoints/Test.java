package com.hlovex.containerextensionpoints;

import com.hlovex.beandefinitioninheritance.DerivedTestBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("containerextensionpoints.xml");
//        Messenger messenger = context.getBean(Messenger.class);
        Object factoryBean = context.getBean("&messenger");
//        System.out.println(messenger);
    }

}
