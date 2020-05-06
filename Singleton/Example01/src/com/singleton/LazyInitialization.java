package com.singleton;

public class LazyInitialization {

    private static LazyInitialization lazySingleton;

    private LazyInitialization(){
    }

    public static LazyInitialization getInstance() {
        if (lazySingleton == null)
            lazySingleton = new LazyInitialization();
        return lazySingleton;
    }

    public void singletonTest(){
        System.out.println("Lazy Singleton method called");
    }
}