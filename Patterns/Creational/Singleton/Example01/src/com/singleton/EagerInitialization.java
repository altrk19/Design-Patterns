package com.singleton;

public class EagerInitialization {

    private static final EagerInitialization INSTANCE = new EagerInitialization();

    private EagerInitialization() {
    }

    public static EagerInitialization getInstance() {
        return INSTANCE;
    }

    public void singletonMethod() {
        System.out.println("Eager Singleton method called");

    }
}