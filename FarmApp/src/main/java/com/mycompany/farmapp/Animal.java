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
class Animal extends Product {
    int growthDays; 
    
    
    //The constructor
    public Animal(String name, double price, int quantity, int growthDays) {
        super(name, price, quantity);
        this.growthDays = growthDays;
    }
    
    //Checks is the animal is not fully grown 
    public boolean isFullyGrown(int daysPassed) {
        return daysPassed >= growthDays;
    }
}
