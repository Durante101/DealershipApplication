package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String address, String phone, String name) {
        this.address = address;
        this.phone = phone;
        this.name = name;
        this.inventory = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Vehicle addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
        return vehicle;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

    public ArrayList<Vehicle> findVehiclesByMileageRange(int minMileage, int maxMileage) {
        return inventory;
    }
    public ArrayList<Vehicle> findVehiclesByMakeModel(String make, String model) {
        return inventory;
    }
    public ArrayList<Vehicle> findVehiclesByYearRange(int minYear, int maxYear) {
        return inventory;
    }
    public ArrayList<Vehicle> findVehiclesByColor(String color) {
        return inventory;
    }
    public ArrayList<Vehicle> findVehiclesByColor(String color) {
        return inventory;
    }

}
