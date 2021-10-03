package com.state;

public class DeliveryContext {
    private CargoState currentState;
    private String cargoId;

    public DeliveryContext(CargoState currentState, String cargoId) {
        this.currentState = currentState;
        this.cargoId = cargoId;

        if(currentState == null){
            this.currentState = new Acknowledged();
        }
    }

    public CargoState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(CargoState currentState) {
        this.currentState = currentState;
    }

    public void update(){
        currentState.updateState(this);
    }
}
