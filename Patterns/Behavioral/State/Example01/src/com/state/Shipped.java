package com.state;

public class Shipped implements CargoState {

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package is shipped !!");
        deliveryContext.setCurrentState(new InTransition());
    }
}
