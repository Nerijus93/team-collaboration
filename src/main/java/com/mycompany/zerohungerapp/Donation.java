/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ITwork
 */
public class Donation {

    private Donor donor; // 👈 Now uses Donor class
    private String date;
    private String typeOfFood;
    private String image;

    // Constructor
    public Donation(Donor donor, String date, String typeOfFood, String image) {
        this.donor = donor;
        this.date = date;
        this.typeOfFood = typeOfFood;
        this.image = image;
    }

    // Getters
    public Donor getDonor() {
        return donor;
    }

    public String getDate() {
        return date;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public String getImage() {
        return image;
    }

    // Methods
    public void confirmDonation() {
        System.out.println("Donation from " + donor.getName() + " confirmed.");
    }

    public String viewDonation() {
        return "Donor: " + donor.getName()
                + "\nDate: " + date
                + "\nType of Food: " + typeOfFood
                + "\nImage: " + image;
    }
}
