package com.hlovex.naturebean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.SmartLifecycle;

import javax.annotation.PostConstruct;

public class TestPostConstruct implements SmartLifecycle, BeanNameAware {

    public TestPostConstruct(){
        System.out.println("TestPostConstruct con");
    }
    @PostConstruct
    public void p() {
        System.out.println("PostConstruct");
    }

    public void start() {
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public boolean isRunning() {
        System.out.println("isRunning");
        return false;
    }

    public boolean isAutoStartup() {
        System.out.println("isAutoStartup");
        return true;
    }

    public void stop(Runnable callback) {
        System.out.println("stop callback");

    }

    public int getPhase() {
        System.out.println("getPhase");
        return 0;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("beanName:" + name);
    }
}
