package com.hlovex.compound;

import com.hlovex.model.ExampleBean;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ThingOne thingOne = context.getBean(ThingOne.class);
        System.out.println(thingOne.getFred().getBob().getSammy());
    }

}
