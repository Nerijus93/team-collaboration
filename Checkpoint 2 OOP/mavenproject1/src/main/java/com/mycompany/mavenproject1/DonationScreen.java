/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ITwork
 */
public class DonationScreen extends JFrame {

    private DonationManager manager;
    private JTextField nameField, emailField, phoneField, foodField, dateField;
    private JTextArea outputArea;

    public DonationScreen() {
        manager = new DonationManager();

        setTitle("Donation Section");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Phone:"));
        phoneField = new JTextField();
        add(phoneField);

        add(new JLabel("Type of Food:"));
        foodField = new JTextField();
        add(foodField);

        add(new JLabel("Date:"));
        dateField = new JTextField();
        add(dateField);

        JButton addBtn = new JButton("Add Donation");
        JButton listBtn = new JButton("List Donations");
        add(addBtn);
        add(listBtn);

        outputArea = new JTextArea();
        add(new JScrollPane(outputArea));

        addBtn.addActionListener(e -> addDonation());
        listBtn.addActionListener(e -> showDonations());

        setVisible(true);
    }

    private void addDonation() {
        String name = nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String food = foodField.getText();
        String date = dateField.getText();

        Donor donor = new Donor(1, name, email, phone);
        Donation d = new Donation(donor, date, food);
        manager.addDonation(d);
        outputArea.append("Added: " + d.viewDonation() + "\n");
    }

    private void showDonations() {
        outputArea.append("\n--- All Donations ---\n");
        manager.listDonations();
    }
}
