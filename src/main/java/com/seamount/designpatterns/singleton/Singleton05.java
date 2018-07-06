package com.seamount.designpatterns.singleton;

/**
 * 静态内部类方式
 *
 * 这种方式同样利用classloader的机制来保证初始化的时候只有一个线程
 */
public class Singleton05 {

    private Singleton05(){

    }

    private static class SingletonHolder{
        private static final  Singleton05 INSTANCE = new Singleton05();
    }

    public static final Singleton05 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
