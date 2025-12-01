/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

/**
 *
 * @author ITwork
 */
public class Donor extends Person {

    private static int nextId = 1; //auto increment counter by 1 for donorId
    private final int donorId;

    public Donor(String name, String lastName, String email, String phone) {
        super(name, lastName, email, phone);
        this.donorId = nextId++;
    }

    @Override
    public String getLastName() {
        return lastName;
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
                + "\nName: " + lastName
                + "\nEmail: " + email
                + "\nPhone: " + phone;
    }
}
