/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ITwork
 */
import java.util.ArrayList;

public class DonationManager {

    private ArrayList<Donation> donationList;

    public DonationManager() {
        donationList = new ArrayList<>();
    }

    public void addDonation(Donation donation) {
        donationList.add(donation);
        System.out.println("Donation added: " + donation.getTypeOfFood());
    }

    public void listDonations() {
        for (Donation d : donationList) {
            System.out.println("-----");
            System.out.println(d.viewDonation());
        }
    }
}
