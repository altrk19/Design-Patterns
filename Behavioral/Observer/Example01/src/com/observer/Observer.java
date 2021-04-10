package com.observer;

import com.observer.model.Message;

public interface Observer
{
    void update(Message m);
}
