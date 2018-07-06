package com.seamount.designpatterns.asynchronous;

public class ThirdApi {

    public void method(){
        for (int i = 0; i < 5; i++){
            System.out.println("异步方法："+i);
        }
    }
}
