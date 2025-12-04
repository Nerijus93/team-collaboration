/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

/**
 *
 * @author Tiyko - Ionut Ciobanu
 */
import java.time.LocalDate;

public class CollectionSchedule {
    private int scheduleID;
    private Restaurant restaurant;
    private LocalDate collectionDate;
    private String time;
    private String foodType;
    private int foodQuantity;

    public CollectionSchedule(int scheduleID, Restaurant restaurant, LocalDate collectionDate,
                              String time, String foodType, int foodQuantity) {
        this.scheduleID = scheduleID;
        this.restaurant = restaurant;
        this.collectionDate = collectionDate;
        this.time = time;
        this.foodType = foodType;
        this.foodQuantity = foodQuantity;
    }

    public int getScheduleID() { return scheduleID; }
    public Restaurant getRestaurant() { return restaurant; }
    public LocalDate getCollectionDate() { return collectionDate; }
    public String getTime() { return time; }
    public String getFoodType() { return foodType; }
    public int getFoodQuantity() { return foodQuantity; }

    @Override
    public String toString() {
        return "Schedule Number : " + scheduleID + " - " +
               " Restaurant Number: " + restaurant.getRestaurantID() + " - " +
               " Restaurant Name: " + restaurant.getName() + " - " +
               " Collection Date: " + collectionDate + " - " +
               " Collection Time: " + time + " - " +
               " Food Type: " + foodType + " - " +
               " Food Quantity: " + foodQuantity;
    }
}
