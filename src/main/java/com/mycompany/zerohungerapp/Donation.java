/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

/**
 *
 * @author Nerijus Kmitas
 * Student ID x24170232
 */

//It will represent single donation records such as: (donor, date, type, quantity, and donationId)
public class Donation {
    
    //Variables
    private static int nextId = 1;   // Auto increment counter by 1
    private int donationId;          // Unique donation Id
    private Donor donor;
    private String date;
    private String typeOfFood;
    private int quantity;

    //Constructor
    public Donation(Donor donor, String date, String typeOfFood, int quantity) {
        this.donor = donor;
        this.date = date;
        this.typeOfFood = typeOfFood;
        this.quantity = quantity;
        this.donationId = nextId++;
    }
    
    //Overload constructor will be used when restoring donation from a file with explicit id
    public Donation(Donor donor, String date, String typeOfFood, int quantity, int donationId) {
        this.donor = donor;
        this.date = date;
        this.typeOfFood = typeOfFood;
        this.quantity = quantity;
        this.donationId = donationId;
        if (donationId >= nextId) {
            nextId = donationId + 1;
        }
    }
    
    //Setter
    //This will allow user to set nextId manually if needed
    public static void setNextId(int nextId) {
        Donation.nextId = nextId;
    }

    // Getters
    public Donor getDonor() {
        return donor;
    }

    public int getDonationId() {
        return donationId;
    }

    public String getDate() {
        return date;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Donation #" + donationId + "\n"
                + donor.toString() + "\n"
                + "Food: " + typeOfFood + "\n"
                + "Quantity: " + quantity + "\n"
                + "Date: " + date + "\n";
    }
    
    //It will convert donation into a single line for saving
    public String toFileString() {
        String path = donor.getImagePath();
        if (path == null) path = "";
        return donationId + "," +
                donor.getDonorId() + "," +
                donor.getName() + "," +
                donor.getLastName() + "," +
                donor.getEmail() + "," +
                donor.getPhone() + "," +
                donor.getImagePath() + "," +
                path + "," +
                date + "," +
                typeOfFood + "," +
                quantity;
    }
}