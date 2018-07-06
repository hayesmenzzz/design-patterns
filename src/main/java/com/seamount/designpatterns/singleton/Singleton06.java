package com.seamount.designpatterns.singleton;

/**
 * 使用枚举的单例模式
 */
public class Singleton06 {

    private Singleton06(){

    }

    private static enum EnumSingleton{
        INSTANCE;

        private Singleton06 singleton;

        //JVM会保证此方法绝对只调用一次
        private EnumSingleton(){
            singleton = new Singleton06();
        }

        public  Singleton06 getInstance(){
            return singleton;
        }
    }

    public static Singleton06 getInstance(){
        return EnumSingleton.INSTANCE.getInstance();
    }
}
