package com.jrookie.service.invoke;

import javax.naming.Name;

/**
 * @Author: JRookie
 * @Description:
 * @Date: Create in 下午3:14 19-4-15
 */
public class User implements UserImpl{
    private String name;

    @Override
    public void printName(String name){
        System.out.println("name:"+name);
    }
}
