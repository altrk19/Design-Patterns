package com.decorator;

public class SamsungS20 extends PhoneDecorator {

    public SamsungS20(Samsung samsung) {
        super(samsung);
    }

    @Override
    public String getName() {
        return super.getName() + " S20";
    }

}