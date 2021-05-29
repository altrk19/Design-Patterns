package com.decorator;

public class SamsungS20ProMax extends SamsungS20Pro {
    public SamsungS20ProMax(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + " Max ";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100;
    }

    public String extraMethod() {
        return "Color is white";
    }
}