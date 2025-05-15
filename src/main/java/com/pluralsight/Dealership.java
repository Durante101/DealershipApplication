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

    public ArrayList<Vehicle> findVehiclesByPriceRange(double minPrice, double maxPrice) {
        ArrayList<Vehicle> prices = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice) {
                prices.add(vehicle);
            }
        }
        return prices;
    }
    public ArrayList<Vehicle> findVehiclesByMakeModel(String make, String model) {
        ArrayList<Vehicle> matches = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                matches.add(vehicle);
            }
        }

        return matches;
    }
    public ArrayList<Vehicle> findVehiclesByYearRange(int minYear, int maxYear) {
        ArrayList<Vehicle> matches = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= minYear && vehicle.getYear() <= maxYear) {
                matches.add(vehicle);
            }
        }

        return matches;
    }
    public ArrayList<Vehicle> findVehiclesByColor(String color) {
        ArrayList<Vehicle> matches = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                matches.add(vehicle);
            }
        }

        return matches;
    }
    public ArrayList<Vehicle> findVehiclesByMileageRange(int minMileage, int maxMileage) {
        ArrayList<Vehicle> matches = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= minMileage && vehicle.getOdometer() <= maxMileage) {
                matches.add(vehicle);
            }
        }

        return matches;
        return inventory;
    }
    public ArrayList<Vehicle>  findVehiclesByType(String type) {
        ArrayList<Vehicle> matches = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getType().equalsIgnoreCase(type)) {
                matches.add(vehicle);
            }
        }

        return matches;
    }
    public boolean removeVehicle(int vin) {
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVin() == vin) {
                inventory.remove(vehicle);
                return true;
            }
        }
        return false;;
    }

}
