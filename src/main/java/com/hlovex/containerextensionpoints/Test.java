package com.hlovex.containerextensionpoints;

import com.hlovex.beandefinitioninheritance.DerivedTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("containerextensionpoints.xml");
        Messenger messenger = context.getBean(Messenger.class);
        System.out.println(messenger);
    }

}
