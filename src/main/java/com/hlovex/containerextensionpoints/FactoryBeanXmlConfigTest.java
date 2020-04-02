package com.hlovex.containerextensionpoints;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:containerextensionpoints.xml" })
public class FactoryBeanXmlConfigTest {

    @Autowired
    private Tool tool;

    @Resource(name = "&tool")
    private ToolFactory toolFactory;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testConstructWorkerByXml() {
        System.out.println("toolId:" + tool.getId());
        System.out.println("tool:" + tool);
        System.out.println("factoryId:" + toolFactory.getFactoryId());
        System.out.println("tool:" + applicationContext.getBean("tool"));
    }
}
