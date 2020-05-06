package com.singleton;

public class ThreadSafeInitialization {

    private static ThreadSafeInitialization threadSafeSingleton;

    private ThreadSafeInitialization(){

    }

    public static synchronized ThreadSafeInitialization getInstance() {
        if (threadSafeSingleton == null)
            threadSafeSingleton = new ThreadSafeInitialization();
        return threadSafeSingleton;
    }

    public void singletonMethod(){
        System.out.println("ThreadSafe Singleton method called");
    }
}