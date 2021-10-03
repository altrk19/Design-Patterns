package com.state;

public class InTransition implements CargoState {

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package is in transition !!");
        deliveryContext.setCurrentState(new OutForDelivery());
    }
}
