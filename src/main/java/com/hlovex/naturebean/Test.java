package com.hlovex.naturebean;

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
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("naturebean.xml");
        TestPostConstruct testPostConstruct = context.getBean(TestPostConstruct.class);
        System.out.println("------------");
        context.start();
        System.out.println("------------");
        context.refresh();
        System.out.println("------------");
        context.close();
        System.out.println("------------");
    }

}
