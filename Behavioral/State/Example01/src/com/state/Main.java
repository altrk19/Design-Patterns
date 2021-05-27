package com.state;

public class Main {

    public static void main(String[] args) {
        DeliveryContext deliveryContext = new DeliveryContext(null, "cargo1");
        deliveryContext.update();
        deliveryContext.update();
        deliveryContext.update();
        deliveryContext.update();
        deliveryContext.update();
    }
}
