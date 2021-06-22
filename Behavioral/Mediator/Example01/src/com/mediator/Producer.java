package com.mediator;

import java.math.BigDecimal;

public abstract class Producer {
    private String name;
    private ProductType productType;
    private BigDecimal productPrice;

    private IMediator mediator;

    public Producer(String name, ProductType productType, BigDecimal productPrice, IMediator mediator) {
        this.name = name;
        this.productType = productType;
        this.productPrice = productPrice;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void sellProduct(){
        mediator.takeFromProducer(this);
    }
}
