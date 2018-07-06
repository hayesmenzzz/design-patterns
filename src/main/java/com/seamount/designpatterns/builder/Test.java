package com.seamount.designpatterns.builder;

public class Test {
    public static void main(String[] args) {
        Student a = new Builder().setAge(13).setName("张三").build();
        System.out.println(a.toString());
    }
}
