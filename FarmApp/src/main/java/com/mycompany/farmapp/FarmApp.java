/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.farmapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Siphesihle Masuku
 */

//CODE ATTRIDUTION 
//Title: Switch statements 
// Author : W3schools 
// Date : 20/08/2025
// Version : 
//Availability : https://www.w3schools.com/java/java_switch.asp


//CODE ATTRIDUTION 
//Title:ArrayList 
// Author : w3schools
// Date : 20/08/20205
// Version : 
//Availability : https://www.w3schools.com/java/java_arraylist.asp

public class FarmApp {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Multidimensional array that will be used for the animal and vegetable
        
        double[][] monthlySales = new double[12][2];

        // Lists are going to be used to store the products 
        ArrayList<Vegetable> vegetables = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n--- FARM MANAGEMENT MENU ---");
            System.out.println("1. Add new vegetable");
            System.out.println("2. Add new animal");
            System.out.println("3. Check vegetable readiness");
            System.out.println("4. Check animal growth");
            System.out.println("5. Record monthly sales");
            System.out.println("6. Show monthly sales report");
            System.out.println("7. Exit");
            System.out.println("8. Show inventory list"); // NEW OPTION
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter vegetable name: ");
                    String vName = sc.nextLine();
                    System.out.print("Enter price: ");
                    double vPrice = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int vQty = sc.nextInt();
                    System.out.print("Enter harvest days: ");
                    int vDays = sc.nextInt();
                    vegetables.add(new Vegetable(vName, vPrice, vQty, vDays));
                    System.out.println(vName + " added successfully!");
                    break;

                case 2:
                    System.out.print("Enter animal name: ");
                    String aName = sc.nextLine();
                    System.out.print("Enter price: ");
                    double aPrice = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int aQty = sc.nextInt();
                    System.out.print("Enter growth days: ");
                    int aDays = sc.nextInt();
                    animals.add(new Animal(aName, aPrice, aQty, aDays));
                    System.out.println(aName + " added successfully!");
                    break;

              case 3:
    if (vegetables.isEmpty()) {
        System.out.println("No vegetables recorded yet.");
        break;
    }
    System.out.print("Enter days passed: ");
    int vegDays = sc.nextInt();
    for (int i = 0; i < vegetables.size(); i++) {
        Vegetable veg = vegetables.get(i);
        if (veg.isReadyToHarvest(vegDays)) {
            System.out.println(veg.name + " is ready to harvest.");
        } else {
            System.out.println(veg.name + " is not ready yet.");
        }
    }
    break;

case 4:
    if (animals.isEmpty()) {
        System.out.println("No animals recorded yet.");
        break;
    }
    System.out.print("Enter days passed: ");
    int aniDays = sc.nextInt();
    for (int i = 0; i < animals.size(); i++) {
        Animal ani = animals.get(i);
        if (ani.isFullyGrown(aniDays)) {
            System.out.println(ani.name + " is fully grown.");
        } else {
            System.out.println(ani.name + " is not grown yet.");
        }
    }
    break;

case 5:
    System.out.print("Enter month (1-12): ");
    int month = sc.nextInt() - 1;

    double vegTotal = 0, aniTotal = 0;
    for (int i = 0; i < vegetables.size(); i++) vegTotal += vegetables.get(i).calculateTotal();
    for (int i = 0; i < animals.size(); i++) aniTotal += animals.get(i).calculateTotal();

    monthlySales[month][0] += vegTotal;
    monthlySales[month][1] += aniTotal;

    System.out.println("Sales recorded for month " + (month+1));
    break;

case 6:
    System.out.println("\n--- MONTHLY SALES REPORT ---");
    for (int m = 0; m < 12; m++) {
        double total = monthlySales[m][0] + monthlySales[m][1];
        if (total > 0) {
            System.out.println("Month " + (m+1) + ": Vegetables = R" + monthlySales[m][0] +
                    ", Animals = R" + monthlySales[m][1] + ", TOTAL = R" + total);
        }
    }
    break;

case 8: // INVENTORY LIST
    System.out.println("\n--- INVENTORY LIST ---");

    if (vegetables.isEmpty() && animals.isEmpty()) {
        System.out.println("Inventory is empty.");
    } else {
        if (!vegetables.isEmpty()) {
            System.out.println("Vegetables:");
            for (int i = 0; i < vegetables.size(); i++) {
                Vegetable veg = vegetables.get(i);
                System.out.println("- " + veg.name + " | Qty: " + veg.quantity + " | Price: R" + veg.price);
            }
        }
        if (!animals.isEmpty()) {
            System.out.println("Animals:");
            for (int i = 0; i < animals.size(); i++) {
                Animal ani = animals.get(i);
                System.out.println("- " + ani.name + " | Qty: " + ani.quantity + " | Price: R" + ani.price);
            }
        }
    }
    break;


                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 7);

        sc.close();
    }
    }

 
