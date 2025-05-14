package com.pluralsight;

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

            
}
