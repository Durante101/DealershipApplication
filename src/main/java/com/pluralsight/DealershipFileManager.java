package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DealershipFileManager {
    private static final String FILE_NAME = "inventory.csv";

    public Dealership getDealership() {
        Dealership dealership = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] dealershipInfo = line.split("\\|");

                String name = dealershipInfo[0];
                String address = dealershipInfo[1];
                String phone = dealershipInfo[2];

                dealership = new Dealership(address, phone, name);
            }


        } catch (Exception e) {
            System.err.println("Error reading inventory file: Dealership Class" + e.getMessage());
        }
        return dealership;
    }


//    public Dealership saveDealership(Dealership dealership) {
//
//    }
}
