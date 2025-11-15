/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
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
        JButton section3Button = new JButton("Section 3 (Coming Soon)");

        donationButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Opening Donations Management..."));
        memberButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Opening Member Registration..."));
        section3Button.addActionListener(e -> JOptionPane.showMessageDialog(null, "Section 3 is under development."));

        panel.add(donationButton);
        panel.add(memberButton);
        panel.add(section3Button);

        add(panel);
        setVisible(true);
    }
}
