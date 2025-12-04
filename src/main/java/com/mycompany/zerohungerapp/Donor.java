/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

/**
 *
 * @author Nerijus Kmitas Student ID x24170232
 */
//Donor extends Person and adds a (donorId) and (imagePath) for profile picture
public class Donor extends Person {

    //Path to the donor profile picture (that might be empty or null)
    private String imagePath;

    //nextId is used to auto generate unique donor IDs
    private static int nextId = 1; //auto increment counter by 1 for donorId

    //Each donor will get an integer id (this will net be final so we can restore set by constructor
    private int donorId;

    //Constructor used when creating a new donor
    public Donor(String name, String lastName, String email, String phone) {
        super(name, lastName, email, phone);
        this.donorId = nextId++;
    }

    //That is overloaded constructor used when restoring donors from the file with knows donorId
    //if restored donorId is equal or greater than the current nextId it will update nextId
    //so that later generated IDs will not be the same or conflict with each other
    public Donor(String name, String lastName, String email, String phone, int donorId) {
        super(name, lastName, email, phone);
        this.donorId = donorId;
        if (donorId >= nextId) {
            nextId = donorId + 1;     // It will make sure that the next ID will be unique
        }
    }

    //This setter is optional to set nextId (will not be required if using overloaded constructor)
    public static void setNextId(int id) {
        nextId = id;
    }

    //imagePath
    //setters and getters
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public int getDonorId() {
        return donorId;
    }

    @Override
    public String getRoleInfo() {
        return "Donor ID: " + donorId + " Name: " + name;
    }

    @Override
    public String toString() {
        return "Donor ID: " + donorId
                + "\nName: " + name
                + "\nLastName: " + lastName
                + "\nEmail: " + email
                + "\nPhone: " + phone;
    }
}
