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
 * @author ITwork
 */
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

        // OPEN DonationScreen and SHOW it
        donationButton.addActionListener(e -> {
            DonationScreen ds = new DonationScreen(this);
            ds.setVisible(true);
            this.setVisible(false);
        });

        restaurantButton.addActionListener(e -> {
            RestaurantScreen rs = new RestaurantScreen();
            rs.setVisible(true);
            rs.setVisible(false);
        });

        memberButton.addActionListener(e -> {
            MembershipSection ms = new MembershipSection();
            ms.setVisible(true);
            ms.setVisible(false);
        });

        add(pageTitleLabel, "North");

        panel.add(donationButton);

        panel.add(memberButton);

        panel.add(restaurantButton);

        add(panel);

        setVisible(true);
    }
}
