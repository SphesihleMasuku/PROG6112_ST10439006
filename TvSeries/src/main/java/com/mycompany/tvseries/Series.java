/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tvseries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Siphesihle Masuku
 */

//CODE ATTRIDUTION 
//Title: For Loops
// Author : w3schools
// Date : 25/08/2025
// Version : 
//Availability : https://www.w3schools.com/java/java_for_loop.asp

//CODE ATTRIDUTION 
//Title: Iterator
// Author : w3shool
// Date : 25/08/2025
// Version : 
//Availability : https://www.w3schools.com/java/java_iterator.asp

//CODE ATTRIDUTION 
//Title:ArrayList 
// Author : w3schools
// Date : 20/08/20205
// Version : 
//Availability : https://www.w3schools.com/java/java_arraylist.asp


public class Series {

    private ArrayList<SeriesModel> series = new ArrayList<>();// Declares the arraylist 

    private Scanner scanner = new Scanner(System.in);
    
    
    //Capture the the series details 
    public void CaptureSeries() {
    System.out.println("Enter series Id :");
    String id = scanner.nextLine();

    System.out.println("Enter the series name : ");
    String name = scanner.nextLine();

    
    String age = "";
    boolean validAge = false;

    while (!validAge) {
        try {
            System.out.println("Enter the series age restriction (between 2 and 18): ");
            age = scanner.nextLine();

            int ageValue = Integer.parseInt(age); // will throw exception if letters are entered

            if (ageValue >= 2 && ageValue <= 18) {
                validAge = true;
            } else {
                System.out.println("Invalid input. Age must be between 2 and 18.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }
    }

    
    int episodes = 0;
    boolean validEpisodes = false;

    while (!validEpisodes) {
        try {
            System.out.println("Enter number of episodes: ");
            episodes = Integer.parseInt(scanner.nextLine());

            if (episodes > 0) {
                validEpisodes = true;
            } else {
                System.out.println("Invalid input. Enter a number greater than 0.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    
    SeriesModel serie = new SeriesModel(id, name, age, String.valueOf(episodes));
    series.add(serie);
    System.out.println("Series is saved successfully.");
}
    // Searchs for a specific series using its ID 
    public void SearchSeries() {

        System.out.println("Enter series id to search");
        String id = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < series.size(); i++) {
            SeriesModel s = series.get(i);
            if (s.getSeriesId().equalsIgnoreCase(id)) {
                System.out.println("Book found: " + s);
                found = true;
                break;
            }

        }

        if (!found) {
            System.out.println("No series with id :" + id + "found");
        }

    }
    //Updates the series details but uses the id to specify which series to update 
    public void UpdateSeries() {

        System.out.println("Enter serirs id to update");
        String id = scanner.nextLine();

        boolean update = false;

        for (int i = 0; i < series.size(); i++) {
            SeriesModel s =  series.get(i);
            if (s.getSeriesId().equalsIgnoreCase(id)) {
                
                System.out.println("Enter the new series name ");
                s.setSeriesName(scanner.nextLine());
                
                System.out.println("Enter the new series age restriction  ");
                s.setSeriesAge(scanner.nextLine());
                
                System.out.println("Enter the new number of episodes");
                s.setSeriesNumberOfEpisodes(scanner.nextLine());
                
                System.out.println("Series  update successfully ");
                update = true; 
                break;
            }

        }

    }
     // delets the a series using the id to identify the series being deleted 
    public void DeleteSeries() {
        
        System.out.println("Enter series id to delete ");
        String id = scanner.nextLine();
        
        boolean delete = false;
        
        Iterator <SeriesModel> it = series.iterator();
        
        while (it.hasNext()) {
            SeriesModel s = it.next();
            
            if (s.getSeriesId().equalsIgnoreCase(id)) {
                System.out.println("Confirm delete (yes/no)");
                String aprove = scanner.nextLine();
                if (aprove.equalsIgnoreCase("yes")){
                    it.remove();
                    System.out.println("Series deleted successfully");
                } else {
                    System.out.println("delete cancelled");
                }
                
               delete = true;
               break;
            }
            
        }
        
        if (!delete){
            System.out.println("Series not found ");
        }

    }
    // displays all the series tht have been saved 
    public void SeriesReport() {
        if (series.isEmpty()){
            System.out.println("No series saved yet ");
        } else {
            System.out.println("****** SERIES REPORT *****");
             for (int i = 0; i < series.size(); i++){
                 System.out.println(series.get(i));
             }
             
             System.out.println("***************************");
            
        }

    }
    
    
    //exits the appliation when the user is done 
    public void ExitSeriesApplication() {
        
        System.out.println("Exiting Series Management System ");
        System.exit(0);

    }
    // this is test date used in the Junit test file 
      public void addDummyData() {
        series.add(new SeriesModel("S001", "Breaking Bad", "18+", "62"));
        series.add(new SeriesModel("S002", "Stranger Things", "13+", "34"));
        series.add(new SeriesModel("S003", "Game of Thrones", "18+", "73"));
    }
      
      
      ///ChatGBT
      public ArrayList<SeriesModel> getSeriesList() {
    return series;
}

public SeriesModel findSeriesById(String id) {
    for (SeriesModel s : series) {
        if (s.getSeriesId().equalsIgnoreCase(id)) {
            return s;
        }
    }
    return null;
}

      
      

}
