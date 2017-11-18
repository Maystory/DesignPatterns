package com.swun.dp.singleton;
//急切实例化
public class SingletonA {
    public static final SingletonA instance = new SingletonA();

    private SingletonA() {
    }

    public static SingletonA getInstance() {
        return instance;
    }
}
