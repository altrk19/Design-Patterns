package com.observer;

import com.observer.model.Message;

public class MessageSubscriberThree implements Observer
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
    }
}