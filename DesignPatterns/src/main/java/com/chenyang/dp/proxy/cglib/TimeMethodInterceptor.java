package com.chenyang.dp.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TimeMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("method start..." + System.currentTimeMillis());

        Object result = methodProxy.invokeSuper(o, objects);

        System.out.println("method end..." + System.currentTimeMillis());
        return result;
    }
}
