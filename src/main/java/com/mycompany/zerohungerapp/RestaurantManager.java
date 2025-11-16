/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

/**
 *
 * @author Tiyko - Ionut Ciobanu
 */
import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    private List<Restaurant> restaurantList = new ArrayList<>();

    public void addRestaurant(Restaurant r) {
        restaurantList.add(r);
    }

    public void removeRestaurant(int restaurantID) {
        restaurantList.removeIf(r -> r.getRestaurantID() == restaurantID);
    }

    public List<Restaurant> listRestaurants() {
        return restaurantList;
    }
}

