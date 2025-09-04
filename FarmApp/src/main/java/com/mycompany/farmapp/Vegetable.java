/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmapp;

/**
 *
 * @author Siphesihle Masuku
 */
// this the child class of the Product class 
class Vegetable extends Product {
    int harvestDays; 
    
    // Is the constructer and pulls from the super class/parant class
    public Vegetable(String name, double price, int quantity, int harvestDays) {
        super(name, price, quantity);
        this.harvestDays = harvestDays;
    }
    
    //Checks the readiness of the vegetables
    public boolean isReadyToHarvest(int daysPassed) {
        return daysPassed >= harvestDays;
    }
}