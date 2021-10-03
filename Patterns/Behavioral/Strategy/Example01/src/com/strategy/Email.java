package com.strategy;

public class Email implements Communicate {
    @Override
    public void send() {
        System.out.println("Email is send");
    }
}
