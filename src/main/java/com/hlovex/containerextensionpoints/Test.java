package com.hlovex.containerextensionpoints;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("containerextensionpoints.xml");
//        HikariDataSource dataSource = context.getBean(HikariDataSource.class);
//        System.out.println(dataSource.getJdbcUrl());;
    }

}
