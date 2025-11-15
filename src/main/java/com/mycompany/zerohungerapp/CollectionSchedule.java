/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

/**
 *
 * @author Tiyko
 */
import java.time.LocalDate;

public class CollectionSchedule {
    private int scheduleID;
    private Restaurant restaurant; // FK reference
    private LocalDate collectionDate;
    private String timeSlot;
    private String foodType;
    private String dateNewTimeSlot; // Optional metadata

    public CollectionSchedule(int scheduleID, Restaurant restaurant, LocalDate collectionDate,
                              String timeSlot, String foodType, String dateNewTimeSlot) {
        this.scheduleID = scheduleID;
        this.restaurant = restaurant;
        this.collectionDate = collectionDate;
        this.timeSlot = timeSlot;
        this.foodType = foodType;
        this.dateNewTimeSlot = dateNewTimeSlot;
    }

    // Getters and Setters
    public int getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(int scheduleID) {
        this.scheduleID = scheduleID;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public LocalDate getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(LocalDate collectionDate) {
        this.collectionDate = collectionDate;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getDateNewTimeSlot() {
        return dateNewTimeSlot;
    }

    public void setDateNewTimeSlot(String dateNewTimeSlot) {
        this.dateNewTimeSlot = dateNewTimeSlot;
    }

    @Override
    public String toString() {
        return "CollectionSchedule{" +
                "scheduleID=" + scheduleID +
                ", restaurantID=" + restaurant.getRestaurantID() +
                ", collectionDate=" + collectionDate +
                ", timeSlot='" + timeSlot + '\'' +
                ", foodType='" + foodType + '\'' +
                '}';
    }
}

