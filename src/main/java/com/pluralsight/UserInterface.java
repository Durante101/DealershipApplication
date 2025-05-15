package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner scanner;

    public UserInterface() {
            scanner = new Scanner(System.in);
    }

    public void display() {
        init();
        boolean check = true;
        while (check) {
            System.out.println("=================================");
            System.out.println(" Welcome to My Dealership App ");
            System.out.println("=================================");
            System.out.println("1 - Find vehicles by price range");
            System.out.println("2 - Find vehicles by make / model");
            System.out.println("3 - Find vehicles by year range");
            System.out.println("4 - Find vehicles by color");
            System.out.println("5 - Find vehicles by mileage range");
            System.out.println("6 - Find vehicles by type (car, truck, SUV, van)");
            System.out.println("7 - List ALL vehicles");
            System.out.println("8 - Add a vehicle");
            System.out.println("9 - Remove a vehicle");
            System.out.println("10 - Quit\n");


            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> processGetByPriceRequest();
                case "2" -> processGetByMakeModelRequest();
                case "3" -> processGetByYearRequest();
                case "4" -> processGetByColorRequest();
                case "5" -> processGetByMileageRequest();
                case "6" -> processGetByTypeRequest();
                case "7" -> processAllVehiclesRequest();
                case "8" -> processAddVehicleRequest();
                case "9" -> processRemoveVehicleRequest();
                case "10" -> check = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
            dealership = fileManager.getDealership();
    }

    private void displayVehicles(java.util.List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(
                        "VIN: " + vehicle.getVin() +
                                " | Year: " + vehicle.getYear() +
                                " | Make: " + vehicle.getMake() +
                                " | Model: " + vehicle.getModel() +
                                " | Type: " + vehicle.getType() +
                                " | Color: " + vehicle.getColor() +
                                " | Odometer: " + vehicle.getOdometer() +
                                " | Price: $" + vehicle.getPrice()
                );
            }
        }

    }

    private void processGetByPriceRequest() {


    }

    private void processGetByMakeModelRequest() {

    }

    private void processGetByYearRequest() {

    }

    private void processGetByColorRequest() {

    }

    private void processGetByMileageRequest() {
        System.out.print("Enter minimum mileage: ");
        int minMileage = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter maximum mileage: ");
        int maxMileage = Integer.parseInt(scanner.nextLine());

        ArrayList<Vehicle> results = dealership.findVehiclesByMileageRange(minMileage, maxMileage);
        displayVehicles(results);
    }

    private void processGetByTypeRequest() {
        System.out.print("Enter vehicle type (car, truck, SUV, van): ");
        String type = scanner.nextLine();

        ArrayList<Vehicle> results = dealership.findVehiclesByType(type);
        displayVehicles(results);
    }

    private void processAddVehicleRequest() {
        System.out.print("Enter VIN: ");
        int vin = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter make: ");
        String make = scanner.nextLine();

        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        System.out.print("Enter type: ");
        String type = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter odometer reading: ");
        int odometer = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());

        Vehicle newVehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);
        dealership.addVehicle(newVehicle);

        // SAVE!
        DealershipFileManager fileManager = new DealershipFileManager();
        fileManager.saveDealership(dealership);

        System.out.println("Vehicle Added!");
    }

    private void processRemoveVehicleRequest() {
        System.out.print("Enter VIN of vehicle to remove: ");
        int vin = Integer.parseInt(scanner.nextLine());

        boolean removed = dealership.removeVehicle(vin);

        if (removed) {
            DealershipFileManager fileManager = new DealershipFileManager();
            fileManager.saveDealership(dealership);
            System.out.println("Vehicle removed successfully.");
        } else {
            System.out.println("No vehicle found with that VIN.");
        }
    }

    private void processAllVehiclesRequest() {
        displayVehicles(dealership.getAllVehicles());
    }
}
