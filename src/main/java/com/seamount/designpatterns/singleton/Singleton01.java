package com.seamount.designpatterns.singleton;

/**
 * 单例模式的实现：饿汉模式(线程安全但是效率比较低)
 * 这种非 lazy loading 加载很明显
 * 这种方法基于classloader机制避免了多线程同步的问题，不过instance在类装载的时候就实例化，
 * 虽然导致类装载的原因很多在单例下一般getInstance方法 但是也不能确定有其他的静态方法导致类装载，
 * 这时候初始化Instance显然没有达到lazy loading的效果
 */
public class Singleton01 {

    //定义一个私有的构造方法
    private Singleton01(){

    }

    //将自身的实例对象设置为一个属性并加上static和final修饰
    private static final Singleton01 instance = new Singleton01();

    //静态方法返回该类的实例
    public static Singleton01 getInstance(){
        return instance;
    }
}
