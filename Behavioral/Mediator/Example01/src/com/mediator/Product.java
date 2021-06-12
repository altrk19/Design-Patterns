package com.mediator;

public enum Product {
    TOMATO("Tomato"),
    POTATO("Potato");

    private String productName;

    Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
