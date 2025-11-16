/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

import java.awt.GridLayout;
import javax.swing.*;

/**
 * @author Tiyko - Ionut Ciobanu
 * @author ITwork
 */
public class HomeScreen extends JFrame {

    public HomeScreen() {
        setTitle("Zero Hunger App = Home");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));

        JButton donationButton = new JButton("Donations Management");
        JButton memberButton = new JButton("Become a Member");
        JButton restaurantButton = new JButton("Restaurant Manager");

        // OPEN DonationScreen and SHOW it
        donationButton.addActionListener(e -> {
            DonationScreen ds = new DonationScreen(); // create the window
            ds.setVisible(true);                      // ensure it's shown
            dispose();                                // optional: close home screen
        });
        
        restaurantButton.addActionListener(e -> {
            RestaurantScreen rs = new RestaurantScreen();   // create the window
            rs.setVisible(true);                            // ensure it's shown
            dispose();                                      // optional: close home screen
        });
        

        memberButton.addActionListener(e -> 
            JOptionPane.showMessageDialog(null, "Opening Member Registration..."));

//        restaurantButton.addActionListener(e -> 
//            JOptionPane.showMessageDialog(null, "Opening Restaurant Manager..."));

        panel.add(donationButton);
        panel.add(memberButton);
        panel.add(restaurantButton);

        add(panel);
        setVisible(true);
    }
}