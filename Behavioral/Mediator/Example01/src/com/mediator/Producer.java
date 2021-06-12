package com.mediator;

import java.math.BigDecimal;

public abstract class Producer {
    private String name;
    private Product product;
    private BigDecimal productPrice;

    private Mediator mediator;

    public Producer(String name, Product product, BigDecimal productPrice, Mediator mediator) {
        this.name = name;
        this.product = product;
        this.productPrice = productPrice;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public Product getProduct() {
        return product;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }
}
