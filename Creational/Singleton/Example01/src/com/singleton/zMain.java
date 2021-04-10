package com.singleton;

public class zMain {
    public static void main(String[] args) {
        EagerInitialization.getInstance().singletonMethod();
        StaticBlockEagerInitialization.getInstance().singletonMethod();
        LazyInitialization.getInstance().singletonTest();
        LazyInitialization2.getInstance().singletonTest();
        ThreadSafeInitialization.getInstance().singletonMethod();
    }
}
