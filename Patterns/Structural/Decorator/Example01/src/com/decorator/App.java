package com.decorator;

public class App {

    public static void main(String[] args) {
        Phone phone = new SamsungS20(new Samsung());
        System.out.println(" Name : " + phone.getName());
        System.out.println(" Price : " + phone.getPrice());
        System.out.println(" Camera count : " + phone.cameraCount());

        System.out.println("-----------------------------------------");

        Phone phone2 = new SamsungS20Pro(new Samsung());
        System.out.println(" Name : " + phone2.getName());
        System.out.println(" Price : " + phone2.getPrice());
        System.out.println(" Camera count : " + phone2.cameraCount());

        System.out.println("-----------------------------------------");

        Phone phone3 = new SamsungS20ProMax(new Samsung());
        System.out.println(" Name : " + phone3.getName());
        System.out.println(" Price : " + phone3.getPrice());
        System.out.println(" Camera count : " + phone3.cameraCount());

    }
}