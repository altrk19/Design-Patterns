package com.chain;

public abstract class ShippingCompany {
    private City city;
    private ShippingCompany nextShippingCompany;

    public ShippingCompany(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public ShippingCompany getNextShippingCompany() {
        return nextShippingCompany;
    }

    public ShippingCompany setNextShippingCompany(ShippingCompany nextShippingCompany) {
        this.nextShippingCompany = nextShippingCompany;
        return this;
    }

    public void ship(City city){
        printIncomingShippingInfo(city);
        if (getCity().equals(city)) {
            printShippingDeliverInfo(city);
        } else if (getNextShippingCompany() != null) {
            getNextShippingCompany().ship(city);
        } else {
            printOutOfServiceArea(city);
        }
    }

    private void printOutOfServiceArea(City city) {
        System.out.println(city.getNameOfCity() + " department is out of service area.");
    }

    private void printShippingDeliverInfo(City city) {
        System.out.println(city.getNameOfCity() + " department took delivery.");
    }

    private void printIncomingShippingInfo(City city) {
        System.out.println("Shipping to be sent to city : " + city.getNameOfCity() + " arrived at department : " +
                getCity().getNameOfCity());
    }
}
