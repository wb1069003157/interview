package com.jrookie.service.invoke;

import com.google.gson.Gson;
import com.jrookie.service.multi_thread.MultiThreadDemo01;
import com.jrookie.service.multi_thread.MultiThreadDemo02;
import com.jrookie.service.multi_thread.MultiThreadDemo04;
import org.springframework.scheduling.annotation.Async;

import java.lang.reflect.Field;
import java.util.concurrent.*;

/**
 * @Author: JRookie
 * @Description:
 * @Date: Create in 下午4:58 19-4-10
 */
public class Main {



    public static void main(String[] args) throws Exception {

        // 1. 直接通过类名.class,获取类对象
        Class<Demo> demoClass1 = Demo.class;

        // 2. 通过forName 来获取
        try {
            Class<?> demoClass2 = Class.forName("Demo");
        } catch (ClassNotFoundException e) {
        }

        // 3. 通过对象来获取
        Demo demo = new Demo();
        Class<? extends Demo> demoClass3 = demo.getClass();

        // 常用操作
        // 创建实例
        Demo demo1 = demoClass1.newInstance();
        // 获取类成员变量
        Field flag = demoClass1.getField("flag");
        // ......



        // json 的序列化和反序列化
        String json = "ddd";
        Gson gson = new Gson();
        Demo fromJson = gson.fromJson(json, Demo.class);
        String toJson = gson.toJson(Demo.class);


    }
}
