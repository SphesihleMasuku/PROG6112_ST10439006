
package com.mycompany.tvseries;

import java.util.Scanner;

//CODE ATTRIDUTION 
//Title: Switch statements 
// Author : W3schools 
// Date : 20/08/2025
// Version : 
//Availability : https://www.w3schools.com/java/java_switch.asp




public class TvSeries {

    public static void main(String[] args) {
        Series seriesManager = new Series(); // Series object
        Scanner scanner = new Scanner(System.in);

        System.out.println("LATEST SERIES - 2025");
        System.out.println("******************************");
        System.out.println("Enter (1) to launch menu or any other key to exit ");

        String firstChoice = scanner.nextLine();

        // First switch: Launch menu or exit
        switch (firstChoice) {
            case "1":
                boolean operation = true;

                // Menu loop for the menu items 
                while (operation) {
                    System.out.println("\nPlease select one of the following menu items");
                    System.out.println("(1) Capture a new series");
                    System.out.println("(2) Search for a series");
                    System.out.println("(3) Update series age restriction");
                    System.out.println("(4) Delete a series");
                    System.out.println("(5) Print series report - 2025");
                    System.out.println("(6) Exit Application");

                    String secondChoice = scanner.nextLine();

                  
                    switch (secondChoice) {
                        case "1":
                            seriesManager.CaptureSeries();
                            break;

                        case "2":
                            seriesManager.SearchSeries();
                            break;

                        case "3":
                            seriesManager.UpdateSeries();
                            break;

                        case "4":
                            seriesManager.DeleteSeries();
                            break;

                        case "5":
                            seriesManager.SeriesReport();
                            break;

                        case "6":
                            seriesManager.ExitSeriesApplication();
                            operation = false; // exit loop
                            break;

                        default:
                            System.out.println("Invalid choice. Please choose from 1 to 6");
                            break;
                    }
                }
                break; 

            default:
                System.out.println("Thank you for using our Application.");
                break;
        }
    }
}
