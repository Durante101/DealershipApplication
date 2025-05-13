package com.pluralsight;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    public Dealership(String address, String phone, String name) {
        this.address = address;
        this.phone = phone;
        this.name = name;
        this.vehicles = new ArrayList<>();
    }
}
