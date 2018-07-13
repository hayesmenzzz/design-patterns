package com.seamount.designpatterns.builder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        Student a = new Builder().setAge(13).setName("张三").build();
        System.out.println(a.toString());
    }




    private final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

    public void startProcess(){


    }
}



