package com.mediator;

import java.math.BigDecimal;

public class TomatoProducer extends Producer {
    public TomatoProducer(String name, BigDecimal productPrice,
                          IMediator mediator) {
        super(name, ProductType.TOMATO, productPrice, mediator);
    }
}
