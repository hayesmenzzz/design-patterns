package com.seamount.designpatterns.singleton;

/**
 * 饱汉式,线程安全简单实现
 *
 */
public class Singleton03 {

    //注意这里没有使用final关键字
    private static Singleton03 instace;

    private Singleton03(){

    }

    // 定义一个静态的方法（调用时再初始化SingletonTest，使用synchronized 避免多线程访问时，可能造成重的复初始化问题）
    public static  synchronized  Singleton03 getInstace(){
        if (instace == null){
            instace = new Singleton03();
        }
        return instace;
    }
}
