package com.strategy;

public class Sms implements Communicate {
    @Override
    public void send() {
        System.out.println("Sms is send");
    }
}
