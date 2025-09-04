/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.farmapp;


import static org.junit.jupiter.api.Assertions.*;
   import org.junit.jupiter.api.Test;


/**
 *
 * @author Siphesihle Masuku
 */

//CODE ATTRIDUTION 
//Title: Introdution to Node.Js Test Runner
// Author : w3schools 
// Date : 01/09/2025
// Version : 
//Availability : https://www.w3schools.com/nodejs/nodejs_test_runner.asp

public class FarmAppTest {
    




    @Test // tests if the harvest is or not  ready 
    void testVegetableHarvestReady() {
        Vegetable cabbage = new Vegetable("Cabbage", 15.0, 50, 60);
        assertTrue(cabbage.isReadyToHarvest(70), "Cabbage should be ready after 70 days");
        assertFalse(cabbage.isReadyToHarvest(40), "Cabbage should NOT be ready after 40 days");
    }

    @Test // Tests if the animals are or not  fully grown
    void testAnimalFullyGrown() {
        Animal goat = new Animal("Goat", 1200.0, 5, 180);
        assertTrue(goat.isFullyGrown(200), "Goat should be grown after 200 days");
        assertFalse(goat.isFullyGrown(100), "Goat should NOT be grown after 100 days");
    }

    @Test // Tests if the total calculation is correct
    void testProductTotalCalculation() {
        Product tomato = new Product("Tomato", 10.0, 100);
        assertEquals(1000.0, tomato.calculateTotal(), "Total should be price * quantity");
    }

    @Test // Test the recorded sales 
    void testMultipleSalesRecording() {
        Vegetable spinach = new Vegetable("Spinach", 8.0, 30, 45);
        Animal chicken = new Animal("Chicken", 80.0, 20, 90);

        double vegTotal = spinach.calculateTotal();  
        double aniTotal = chicken.calculateTotal();  

        double[][] monthlySales = new double[12][2];
        monthlySales[0][0] += vegTotal;
        monthlySales[0][1] += aniTotal;

        assertEquals(240, monthlySales[0][0], "Vegetable sales for Jan should be 240");
        assertEquals(1600, monthlySales[0][1], "Animal sales for Jan should be 1600");
        assertEquals(1840, monthlySales[0][0] + monthlySales[0][1], "Total Jan sales should be 1840");
    }
}


