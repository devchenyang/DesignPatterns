package com.chenyang.dp.proxy.springaop.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app_anno.xml");
        Tank t = (Tank) context.getBean("tank");
        t.move();
    }
}
