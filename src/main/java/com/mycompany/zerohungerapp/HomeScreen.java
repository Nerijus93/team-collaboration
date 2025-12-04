/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 *
 * @author Nerijus Kmitas
 * Student ID x24170232
 */

//HomeScreen UI louncher that opens all existing sections of this project
public class HomeScreen extends JFrame {

    public HomeScreen() {
        setTitle("Zero Hunger App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel pageTitleLabel = new JLabel("Welcome to The Zero Hunger App", SwingConstants.CENTER);
        pageTitleLabel.setFont(pageTitleLabel.getFont().deriveFont(30f));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        JButton donationButton = new JButton("Donations Management");
        JButton memberButton = new JButton("Become a Member");
        JButton restaurantButton = new JButton("Restaurant Manager");

        // OPEN DonationScreen and show it
        donationButton.addActionListener(e -> {
            DonationScreen ds = new DonationScreen(this);
            ds.setVisible(true);
            this.setVisible(false);
        });

        //OPEN RestaurantScreen and show it
        restaurantButton.addActionListener(e -> {
            RestaurantScreen rs = new RestaurantScreen();
            rs.setVisible(true);
            this.setVisible(false);
        });

        //OPEN BecomeMemberSection and show it
        memberButton.addActionListener(e -> {
            BecomeMemberSection bms = new BecomeMemberSection();
            bms.setVisible(true);
            this.setVisible(false);
        });

        add(pageTitleLabel, "North");

        panel.add(donationButton);

        panel.add(memberButton);

        panel.add(restaurantButton);

        add(panel);

        setVisible(true);
    }
}
