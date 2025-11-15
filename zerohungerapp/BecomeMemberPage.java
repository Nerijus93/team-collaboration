/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zero.hunger.zerohungerapp;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class BecomeMemberPage extends JFrame{
    
    private JLabel imageLabel;
    private String imagePath;

    public BecomeMemberPage() {
        setTitle("Become a Member");
        setSize(500, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("Join the Zero Hunger Movement", SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(20f));

        JTextField nameField = new JTextField(20);
        JTextField emailField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);
        JTextField contactField = new JTextField(15);

        JButton uploadBtn = new JButton("Upload Profile Image");
        imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(120, 120));
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        uploadBtn.addActionListener(e -> chooseImage());

        JButton submitBtn = new JButton("Submit");
        JButton backBtn = new JButton("Go Back");

        submitBtn.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Thank you for joining Zero Hunger!\n(This is a UI demo only.)"));

        backBtn.addActionListener(e -> {
            dispose();
            new BecomeMemberSection().setVisible(true);
        });

        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.add(new JLabel("Full Name:"));
        formPanel.add(nameField);
        formPanel.add(new JLabel("Email:"));
        formPanel.add(emailField);
        formPanel.add(new JLabel("Password:"));
        formPanel.add(passwordField);
        formPanel.add(new JLabel("Contact Number:"));
        formPanel.add(contactField);
        formPanel.add(uploadBtn);
        formPanel.add(imageLabel);
        formPanel.add(submitBtn);
        formPanel.add(backBtn);

        add(title, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
    }

    private void chooseImage() {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selected = chooser.getSelectedFile();
            imagePath = selected.getAbsolutePath();
            ImageIcon icon = new ImageIcon(new ImageIcon(imagePath)
                    .getImage()
                    .getScaledInstance(120, 120, Image.SCALE_SMOOTH));
            imageLabel.setIcon(icon);
        }
    }
    
}
