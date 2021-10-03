package com.decorator;

public class SamsungS20Pro extends PhoneDecorator {

    public SamsungS20Pro(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice() + 100;
    }

    @Override
    public String getName() {
        return basicPhone.getName() + "S20 Pro";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount() + 1 ;
    }
}