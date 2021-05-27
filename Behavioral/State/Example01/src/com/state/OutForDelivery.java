package com.state;

public class OutForDelivery implements CargoState {

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package is out of delivery !!");
        deliveryContext.setCurrentState(new Delivered());
    }
}
