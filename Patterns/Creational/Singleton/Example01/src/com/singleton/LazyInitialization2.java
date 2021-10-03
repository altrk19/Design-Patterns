package com.singleton;

public class LazyInitialization2 {

    private LazyInitialization2(){
    }

    public void singletonTest(){
        System.out.println("Lazy Singleton2 method called");
    }

    public LazyInitialization2 getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final LazyInitialization2 INSTANCE = new LazyInitialization2();
    }
}

//Not: Inner static class'lar call edilmedikleri sürece bellege yüklenmezler