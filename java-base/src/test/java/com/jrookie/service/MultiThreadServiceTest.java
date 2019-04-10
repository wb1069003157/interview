package com.jrookie.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author: JRookie
 * @Description:
 * @Date: Create in 下午4:20 19-4-10
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MultiThreadServiceTest {

    @Test
    public void test(){

        Thread thread = new Thread();
        thread.setDaemon(true);
        // 如果要将一个线程变为守护线程,一定要在它执行之前
        thread.start();


    }

}