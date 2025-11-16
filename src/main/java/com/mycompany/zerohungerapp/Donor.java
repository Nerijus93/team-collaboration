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

    private int donorId;

    public Donor(int donorId, String name, String email, String phone) {
        super(name, email, phone);
        this.donorId = donorId;
    }

    public int getDonorId() {
        return donorId;
    }

    public String getRoleInfo() {
        return "Donor ID: " + donorId + " Name: " + name;
    }
}
