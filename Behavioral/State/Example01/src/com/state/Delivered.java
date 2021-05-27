package com.state;

public class Delivered implements CargoState {

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package is delivered!!");
    }
}
