package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class DealershipFileManager {
    private static final String FILE_NAME = "inventory.csv";

    public Dealership getDealership() {
        Dealership dealership = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            try  {

                String line;
                // Reads the first line of the inventory splits it into sections called dealership information
                if ((line = reader.readLine()) != null) {
                    String[] dealershipInfo = line.split("\\|");

                    String name = dealershipInfo[0];
                    String address = dealershipInfo[1];
                    String phone = dealershipInfo[2];

                    dealership = new Dealership(name, address, phone);

                }


            } catch (Exception e) {
                System.err.println("Error reading inventory file: Dealership Information " + e.getMessage());
            }

            try  {

                String line;
                // Reads the first line of the inventory splits it into sections of dealership information
                while ((line = reader.readLine()) != null) {
                    String[] vehicleInfo = line.split("\\|");

                    int vin = Integer.parseInt(vehicleInfo[0]);
                    int year = Integer.parseInt(vehicleInfo[1]);
                    String make = vehicleInfo[2];
                    String model = vehicleInfo[3];
                    String type = vehicleInfo[4];
                    String color = vehicleInfo[5];
                    int odometer = Integer.parseInt(vehicleInfo[6]);
                    double price = Double.parseDouble(vehicleInfo[7]);

                    Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);
                    dealership.addVehicle(vehicle);
                }


            } catch (Exception e) {
                System.err.println("Error reading inventory file: Vehicle information " + e.getMessage());
            }
        } catch (Exception e) {
            System.err.println("Error opening file: " + e.getMessage());
        }



        return dealership;
    }


    public Dealership saveDealership(Dealership dealership) {

        return dealership;
    }
}
