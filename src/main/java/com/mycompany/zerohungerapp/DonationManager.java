/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Nerijus Kmitas
 * Student ID x24170232
 */

//DonationManager will keep the list of Donation objects and will handle operations
//add, search, delete, save, and load
public class DonationManager {

    //File used to persist donations that was saved
    private static final String FILE_NAME = "donations.txt";

    //List of donations in memory
    private static ArrayList<Donation> donations = new ArrayList<>();

    //Will add donation to memory but it won't be saved automatically
    public static void addDonation(Donation d) {
        donations.add(d);
    }

    //To return donations by donor name
    public static ArrayList<Donation> getDonations() {
        return donations;
    }

    // Search donations by donor name
    public static ArrayList<Donation> searchDonationsByDonorName(String name) {
        ArrayList<Donation> results = new ArrayList<>();
        for (Donation d : donations) {
            if (d.getDonor().getName().equalsIgnoreCase(name)) {
                results.add(d);
            }
        }
        return results;
    }

    // Delete donation by donorId and return true if it is removed
    public static boolean deleteDonation(int donationId) {
        for (int i = 0; i < donations.size(); i++) {
            if (donations.get(i).getDonationId() == donationId) {
                donations.remove(i);

                //It will save file after deletion
                saveToFile();
                return true; // deleted successfully
            }
        }
        return false;
    }

    //Save all donations to file
    public static void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Donation d : donations) {
                bw.write(d.toFileString());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    //Load from file method, so when the user reopens or opens first time will be able to see
    //data saved in the file
    public static void loadFromFile() {
        donations.clear();

        File file = new File(FILE_NAME);
        if (!file.exists()) //Nothing to load if file not exists
        {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;
            while ((line = br.readLine()) != null) {
                //Split the line into parts
                String[] p = line.split(",", -1);    //-1 keeps empty fields

                //It will expect 10 fields per saved line
                if (p.length < 10) {
                    //Bad line, skip that
                    continue;
                }

                //Parse the field and trim white spaces
                int donationId = Integer.parseInt(p[0].trim());
                int donorId = Integer.parseInt(p[1].trim());
                String name = p[2].trim();
                String lastName = p[3].trim();
                String email = p[4].trim();
                String phone = p[5].trim();
                String imagePath = p[6].trim();
                String date = p[7].trim();
                String typeOfFood = p[8].trim();
                int quantity = Integer.parseInt(p[9].trim());

                //To recreate donor using overload constructor with explicit donorId
                Donor donor = new Donor(name, lastName, email, phone);
                donor.setImagePath(imagePath);

                //This one for recreating donation using overload constructor with explicit
                //donationId           
                Donation donation = new Donation(donor, date, typeOfFood, quantity);

                //This will add to memory list
                donations.add(donation);
            }
        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
}
