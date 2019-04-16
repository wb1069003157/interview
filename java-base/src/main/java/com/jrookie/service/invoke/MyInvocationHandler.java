package com.jrookie.service.invoke;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: JRookie
 * @Description:
 * @Date: Create in 下午3:15 19-4-15
 */
public class MyInvocationHandler<T> implements InvocationHandler {

    // 委托类对象
    private Object target;

    public MyInvocationHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (StringUtils.equals("printName", method.getName())) {
            method.invoke(target, args);
        }
        return null;
    }
}
