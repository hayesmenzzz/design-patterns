package com.seamount.designpatterns.asynchronous;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousCall {

    public static void main(String[] args) {
        ThirdApi api = new ThirdApi();
        for (int i = 0; i < 2; i ++){
            System.out.println("同步方法："+i);
            ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);
            final CountDownLatch count = new CountDownLatch(5);
            for (int j = 0; j < 5; j++) {
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        api.method();
                        count.countDown();
                    }
                });

            }
        }
    }

}
