package com.jrookie.service.multi_thread;

import com.jrookie.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.*;

/**
 * @Author: JRookie
 * @Description:
 * @Date: Create in 下午4:58 19-4-10
 */
public class Main {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1. 用 extends Thread 实现
        Thread multiThreadDemo01 = new MultiThreadDemo01();
        multiThreadDemo01.start();

        // 2. 用 implements Runnable 实现
        Thread multiThreadDemo02 = new Thread(new MultiThreadDemo02());
        multiThreadDemo02.start();

        // 3. 用 lambda 方式来创建线程
        Thread multiThreadDemo03 = new Thread(() -> System.out.println("用 lambda 方式来创建线程"));
        multiThreadDemo03.start();

        // 4. 用 implements Callable
        Callable multiThreadDemo04 = new MultiThreadDemo04();
        FutureTask futureTask = new FutureTask(multiThreadDemo04);
        new Thread(futureTask).start();
        // 获取线程执行完毕后的返回值
        futureTask.get();


        // 5. 线程池方式来创建
        /**
         * 下面 4 种方式全部都不建议使用
         * newFixedThreadPool: 允许请求的队列长度为 Integer.maxValue,可能会堆积大量的请求,造成OOM
         * newSingleThreadExecutor:
         * newCachedThreadPool:允许创建的线程数据为 Inte.maxValue,可能会创建大量的线程,造成OOM
         * newScheduledThreadPool:
         *
         * 其实上面4种都是对 ThreadPoolExecutor 的预处理
         */
//        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
//        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
//        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
//        ExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(10);

        /**
         * corePoolSize  int  核心线程池大小
         * maximumPoolSize  int  最大线程池大小
         * keepAliveTime  long  线程最大空闲时间
         * unit  TimeUnit  时间单位
         * workQueue  BlockingQueue<Runnable>  线程等待队列
         * threadFactory  ThreadFactory  线程创建工厂
         * handler  RejectedExecutionHandler  拒绝策略
         */
        BlockingQueue blockingQueue = new ArrayBlockingQueue<>(10);
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(10, 10, 1, TimeUnit.DAYS, blockingQueue);

        while (true) {

            threadPoolExecutor.execute(() -> System.out.println("用线程池方式来创建线程"));
            // 执行有返回值的多线程任务
//            threadPoolExecutor.submit()
        }


        // 6. Spring 对多线程的支持
        // 6.1  定义线程池的配置类
        // 6.2 在要用多线程来执行的方法上加上 @Async


    }

    @Async
    public void testAsync() {
        System.out.println("该方法是用多线程来执行的!!!");
    }
}
