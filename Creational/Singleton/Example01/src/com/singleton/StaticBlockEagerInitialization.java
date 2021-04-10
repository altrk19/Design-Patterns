package com.singleton;

public class StaticBlockEagerInitialization {

    private static StaticBlockEagerInitialization staticBlockSingleton;

    static {
        try {
            staticBlockSingleton = new StaticBlockEagerInitialization();
        }catch (Exception e){
        }
    }

    private StaticBlockEagerInitialization(){

    }

    public static StaticBlockEagerInitialization getInstance() {
        return staticBlockSingleton;
    }

    public void singletonMethod(){
        System.out.println("Static Block Singleton method called");
    }
}