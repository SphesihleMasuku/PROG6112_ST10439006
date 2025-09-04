/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmapp;

/**
 *
 * @author Siphesihle Masuku
 */
public class Product {
     
    // declares the variables 
     String name;
    double price;
    int quantity;
    
    // The constructer for the product details
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    // will calculate the overal total
    public double calculateTotal() {
        return price * quantity;
    }
    
}
