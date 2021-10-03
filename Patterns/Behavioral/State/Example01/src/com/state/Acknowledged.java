package com.state;

public class Acknowledged implements CargoState {

    @Override
    public void updateState(DeliveryContext deliveryContext) {
        System.out.println("Package is acknowledged !!");
        deliveryContext.setCurrentState(new Shipped());  // we can use Singleton pattern for states. no need new Object creation
    }
}
