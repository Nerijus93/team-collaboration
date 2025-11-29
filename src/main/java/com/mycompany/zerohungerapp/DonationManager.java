/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

import java.util.ArrayList;

public class DonationManager {

    private static ArrayList<Donation> donations = new ArrayList<>();

    public static void addDonation(Donation d) {
        donations.add(d);
    }

    public static ArrayList<Donation> getDonations() {
        return donations;
    }

    // Search donations by donor Name
    public static ArrayList<Donation> searchDonationsByDonorName(String name) {
        ArrayList<Donation> results = new ArrayList<>();
        for (Donation d : donations) {
            if (d.getDonor().getName().equalsIgnoreCase(name)) {
                results.add(d);
            }
        }
        return results;
    }
    
    // Delete donation by Donor ID
    public static boolean deleteDonation(int donationId) {
        for (Donation d : donations) {
            if (d.getDonationId() == donationId) {
                donations.remove(d);
                return true; // deleted successfully
            }
        }
        return false; // not found
    }
}
