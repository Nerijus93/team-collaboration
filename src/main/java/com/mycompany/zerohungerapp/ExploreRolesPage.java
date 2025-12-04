/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*The explore roles page is dedicated to allow the user to search for their role and find out what they can do within the organisation*/

/*
Aidas Kibas 
November 1st - December 1st 2025
*/

package com.mycompany.zerohungerapp;

//Imported utilities

import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

//JFrame GUI window

public class ExploreRolesPage extends JFrame {
    
    //goBackToHome function declared for later
    
    private void goBackToHome() {
            new BecomeMemberSection().setVisible(true);
            dispose();
        }

    
    //Declaring the dropdown menu for user and display area for outcome
    
    private JComboBox<Role> dropdownMenu;
    private JTextArea displayAreaRoles;

    //Array list for the different roles that a member can have and what each role does and how it is displayed for the user in the display area
    
    private Role[] roles = {
        
            new Role("Manager", "Responsibilities include:\n Working with all sectors of the organisation.\n Deleting members from the database.\n Allocating time slots for volunteers."),
            new Role("Admin", "Responsiblities include:\n Communication between Collector and Distributors.\n Contacting restaurants who wish to help.\n Aiding the manager in tasks."),
            new Role("Collector", "Responsiblities include:\n Communicating with the Admin.\n Collecting donations with organisation vehicle.\n Counting of goods received."),
            new Role("Distributor", "Responsiblities include:\n Receiving donations from collector.\n Recounting goods received.\n Dedicating distribution routes for drivers."),
            new Role("Driver", "Responsiblities include:\n Picking up goods from distributor.\n Driving to dedicated location in organisation vehicle.\n Receiving company signature from donated to company."),
            new Role("Packer", "Responsiblities include:\n Pack donations for distribution.\n Label dedicated drop off points (as per distributor).\n Cleaning warehouse."),
            new Role("Organiser", "Responsiblities include:\n Organise charity events.\n Work alongside Manager.\n Planning and choosing shelters and hospitals for donations.")
            
    };

    //Adjusting GUI window preferences
    
    public ExploreRolesPage() {
        setTitle("Explore Roles");
        setSize(500, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //Declaring a label for the title that is centered and with a font size of 20

        JLabel title = new JLabel("Explore Volunteer Roles", SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(20f));
        add(title, BorderLayout.NORTH);

        //Creating a new panel for the dropdown menu features
        
        JPanel topPanel = new JPanel();
        
        //Declaring dropdownMenu as a JComboBox (Dropdown menu) and setting sizes
        
        dropdownMenu = new JComboBox<>(roles);
        dropdownMenu.setPreferredSize(new Dimension(220, 30));
        
        //Declaring a JButton for exploring roles and adding a label, dropdown menu, and explore button to the very top of the window
        
        JButton exploreBtn = new JButton("Explore");
        topPanel.add(new JLabel("Select Your Role:"));
        topPanel.add(dropdownMenu);
        topPanel.add(exploreBtn);
        
        add(topPanel, BorderLayout.NORTH);
        
        //Declaring a back button
        
        JButton backBtn = new JButton("Go Back");

        //Here the display area is declared and adjusted (font size)
        
        displayAreaRoles = new JTextArea();
        displayAreaRoles.setEditable(false);
        displayAreaRoles.setFont(new Font("Monospaced", Font.PLAIN, 14));

        //Declaring and adding a scroll panel for reading text that is too long
        
        JScrollPane scrollPane = new JScrollPane(displayAreaRoles);
        add(scrollPane, BorderLayout.CENTER);

        //Placing the back button at the bottom of the window
                
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(backBtn);
        add(bottomPanel, BorderLayout.SOUTH);
        
        //Code from earlier to close current window using x rather than the whole app 
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void
                    windowClosing(java.awt.event.WindowEvent e) {
                        goBackToHome();
                    }
        });

        //When the explore button is pressed the displayRoles() function is called
        
        exploreBtn.addActionListener(e -> displayRoles());
        
        //When the back button is pressed, the window goes back to BecomeMemberSection and disposes of the ExploreRolesPage
        
        backBtn.addActionListener(e -> {
            dispose();
            new BecomeMemberSection().setVisible(true);
        });
    }   
        
    //Here is the code for the displayRoles() function that will be called when the explore role button is pressed

    private void displayRoles() {
        Role chosen = (Role) dropdownMenu.getSelectedItem();
        
            if (chosen != null) {
                displayAreaRoles.setText(
                        "Role: " + chosen.getName() +
                        "\n" + chosen.getDescription()
                );
                
                
        }       
       
    }
}
