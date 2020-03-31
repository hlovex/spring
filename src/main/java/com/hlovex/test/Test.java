package com.hlovex.test;

import com.hlovex.model.ExampleBean;
import com.hlovex.model.ThingOne;
import com.hlovex.parentattr.Child;
import com.hlovex.properties.PropertiesInjectBean;
import com.hlovex.service.ClientService;
import com.hlovex.service.PetStoreService;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        testParentAttr();
    }

    public static void testParentAttr() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Child child = context.getBean(Child.class);
        System.out.println(child.getSex() + " " + child.getName() + " " + child.getAge());
    }

    public static void testPropertiesInjectBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PropertiesInjectBean injectBean = context.getBean(PropertiesInjectBean.class);
        System.out.println(injectBean.getProperties());
    }

    public static void e() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        System.out.println("ultimateAnswer:" + exampleBean.getUltimateAnswer());
        System.out.println("years:" + exampleBean.getYears());
    }

    public static void d() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ThingOne beanOne = context.getBean("beanOne", ThingOne.class);
    }

    public static void c() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClientService service = context.getBean("clientService", ClientService.class);
        System.out.println(service.getClient("hlovex"));
    }

    public static void b() {
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("applicationContext.xml");
        context.refresh();

        PetStoreService service = context.getBean("petStore", PetStoreService.class);

        List<String> userList = service.getUsernameList();
        System.out.println(userList);
    }

    public static void a() {

        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve configured instance
        PetStoreService service = context.getBean("petStore", PetStoreService.class);

        // use configured instance
        List<String> userList = service.getUsernameList();
        System.out.println(userList);
    }
}
