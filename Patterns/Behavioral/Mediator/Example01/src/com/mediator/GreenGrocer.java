package com.mediator;

import java.math.BigDecimal;

public abstract class GreenGrocer {
    private String name;
    private ProductType productType;
    private BigDecimal price;
    private IMediator mediator;

    public GreenGrocer(String name, ProductType productType, BigDecimal price, IMediator mediator) {
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public IMediator getMediator() {
        return mediator;
    }

    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    public void takeProduct(){
        mediator.sellToGreenGrocer(this);
    }

}
