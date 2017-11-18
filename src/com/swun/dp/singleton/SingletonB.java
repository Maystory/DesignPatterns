package com.swun.dp.singleton;
//延迟实例化

public class SingletonB {
    public volatile static SingletonB instance;

    private SingletonB() {
    }

    public SingletonB getInstance() {
        if (instance == null) {
            synchronized (this) {
                if (instance == null) {
                    instance = new SingletonB();
                }
            }
        }

        return instance;
    }
}
