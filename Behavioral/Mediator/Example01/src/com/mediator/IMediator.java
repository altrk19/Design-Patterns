package com.mediator;

public interface IMediator {
    void addProducer(Producer producer);
    void addGreenGrocer(GreenGrocer greenGrocer);

    void takeFromProducer(Producer producer);
    void sellToGreenGrocer(GreenGrocer greenGrocer);
}
