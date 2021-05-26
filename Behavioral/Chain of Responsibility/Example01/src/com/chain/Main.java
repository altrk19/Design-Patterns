package com.chain;

public class Main {

    public static void main(String[] args) {
        ShippingCompany aturkShipping = AturkShipping.getShippingCompany();
        aturkShipping.ship(City.KARS);

        System.out.println("\n---------------------------------\n");
        aturkShipping.ship(City.ISTANBUL);

    }
}
