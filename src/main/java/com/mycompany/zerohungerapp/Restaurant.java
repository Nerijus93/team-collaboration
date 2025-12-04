/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

/**
 *
 * @author Tiyko - Ionut Ciobanu
 */
public class Restaurant {
    private int restaurantID;
    private String name;
    private String address;
    private String strField; // Optional metadata or placeholder

    public Restaurant(int restaurantID, String name, String address, String strField) {
        this.restaurantID = restaurantID;
        this.name = name;
        this.address = address;
        this.strField = strField;
    }

    // Getters and Setters
    public int getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(int restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStrField() {
        return strField;
    }

    public void setStrField(String strField) {
        this.strField = strField;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantID=" + restaurantID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
