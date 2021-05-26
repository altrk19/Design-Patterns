package com.chain;

public enum City {
    ISTANBUL("İstanbul"),
    ANKARA("Ankara"),
    CANKIRI("Cankiri"),
    ANTALYA("Antalya"),
    KARS("Kars");

    private String nameOfCity;

    City(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    @Override
    public String toString() {
        return nameOfCity;
    }
}
