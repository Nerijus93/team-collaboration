/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.zerohungerapp;

/**
 *
 * @author Nerijus Kmitas
 * Student ID x24170232
 */
public class Main {

    public static void main(String[] args) {
        //Load saved data for DonationManager.donations
        //this reads donations.txt (if there is anythink already saved)
        DonationManager.loadFromFile();

        // Launch HomeScreen when the app starts
        HomeScreen homeScreen = new HomeScreen();
        homeScreen.setVisible(true);
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
