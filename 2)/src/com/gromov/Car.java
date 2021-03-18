package com.gromov;

import otherPackage.Hummer;

public class Car {
    public String publicColor;
    String defType;
    protected int protSpeed;
    private int privNumber;
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.publicColor);
        System.out.println(car.defType);
        System.out.println(car.protSpeed);
        System.out.println(car.privNumber);
        Bmw bmw = new Bmw();
        System.out.println(bmw.publicColor);
        System.out.println(bmw.defType);
        System.out.println(bmw.protSpeed);
        //System.out.println(bmw.privNumber);
        Hummer hummer = new Hummer();
        System.out.println(hummer.publicColor);
        //System.out.println(hummer.defType);
        System.out.println(hummer.protSpeed);
        //System.out.println(hummer.privNumber);
    }
}
