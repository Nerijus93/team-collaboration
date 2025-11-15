/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Nerijus Kmitas
 */
public class Donor {

    private int donorId;
    private String name;
    private String email;
    private String phone;

    public Donor(int donorId, String name, String email, String phone) {
        this.donorId = donorId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getDonorId() {
        return donorId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String viewDonorInfo() {
        return "DonorID: " + donorId + "\nName: " + name + "\nEmail: " + email + "\nPhone: " + phone;
    }
}

