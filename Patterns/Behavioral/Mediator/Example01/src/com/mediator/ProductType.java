package com.mediator;

public enum ProductType {
    TOMATO("Tomato"),
    POTATO("Potato");

    private String productName;

    ProductType(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
