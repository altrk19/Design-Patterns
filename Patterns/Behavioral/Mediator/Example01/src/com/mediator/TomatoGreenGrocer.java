package com.mediator;

import java.math.BigDecimal;

public class TomatoGreenGrocer extends GreenGrocer {
    public TomatoGreenGrocer(String name, BigDecimal price, IMediator mediator) {
        super(name, ProductType.TOMATO, price, mediator);
    }
}
