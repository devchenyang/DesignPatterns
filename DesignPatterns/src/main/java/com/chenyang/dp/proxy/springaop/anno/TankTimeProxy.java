package com.chenyang.dp.proxy.springaop.anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TankTimeProxy {

    @Before("execution(void com.chenyang.dp.proxy.springaop.anno.Tank.move())")
    public void before() {
        System.out.println("method start..." + System.currentTimeMillis());
    }

    @After("execution(void com.chenyang.dp.proxy.springaop.anno.Tank.move())")
    public void after() {
        System.out.println("method end..." + System.currentTimeMillis());
    }
}