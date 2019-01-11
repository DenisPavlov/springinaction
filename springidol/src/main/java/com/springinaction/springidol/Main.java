package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");

        Performer performer = (Performer) context.getBean("harry");
        performer.perform();
    }
}
