/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zero.hunger.zerohungerapp;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Donation extends JFrame{
    
     private Donor donor;
    private String date;
    private String typeOfFood;

    public Donation(Donor donor, String date, String typeOfFood) {
        this.donor = donor;
        this.date = date;
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public String viewDonation() {
        return "Donor: " + donor.getName() + "\nFood: " + typeOfFood + "\nDate: " + date;
    }
    
}
