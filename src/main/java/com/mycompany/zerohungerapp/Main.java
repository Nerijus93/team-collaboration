/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

/**
 *
 * @author Nerijus Kmitas
 */
public class Main {

    public static void main(String[] args) {
        // Test data
        MemberManager memberManager = new MemberManager();
        Role volunteer = new Role(1, "Volunteer", "Helps distribute food.");
        Role donorRole = new Role(2, "Donor", "Donates food or money.");
        Member member1 = new Member(1, "Jane Doe", "jane@example.com", "1234567890", "2025-10-14", volunteer);
        memberManager.addMember(member1);
        memberManager.listMembers();

        Donor donor = new Donor(1, "John Smith", "john@example.com", "9876543210");
        Donation donation = new Donation(donor, "2025-10-14", "Canned Goods", "image.jpg");
        DonationManager donationManager = new DonationManager();
        donation.confirmDonation();
        donationManager.listDonations();

        // Launch GUI
        new HomeScreen();
    }
}
