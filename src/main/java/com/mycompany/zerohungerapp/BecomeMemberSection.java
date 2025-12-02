/* This is the membership section created by Aidas Kibas. It contains 3 distinct sections for users who wish to become members of Zero Hunger */

/*
Aidas Kibas 
November 1st - December 1st 2025
*/

package com.mycompany.zerohungerapp;

//import allows me to use more functions from java, Netbeans automatically added the second import when i added my files from my personal netbeans section

import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

//extends JFrame allows me to create a GUI window which I can alter to my preference

public class BecomeMemberSection extends JFrame{
    
    public static void main(String []args){
        
    }
    
    //creating the function goBackToHome for the x button so it doesnt close the whole application and instead goes back one page
    
    private void goBackToHome() {
            new HomeScreen().setVisible(true);
            dispose();
        }
    
    public BecomeMemberSection() {
         
        setTitle("Become A Member Section"); //This sets the title of the window to Zero Hunger App
        setSize(800, 500); //This determines the dimensions of the window x axis, y axis
        setLocationRelativeTo(null); //This centers the window relative to the users device screen
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Good practice so that the window closes completely and no background programs are running

        JLabel pageTitleLabel = new JLabel("This is the Become a Member Section", SwingConstants.CENTER); //A JLabel creates a label that acts as a Heading and is centered
        
        pageTitleLabel.setFont(pageTitleLabel.getFont().deriveFont(40f)); //This code increases the font size 

        //This section below creates buttons related to the content within my membership section
        
        JButton becomeMemberPageButton = new JButton("Become A Member"); 
        
        JButton viewMembersButton = new JButton("View current Members");
        
        JButton whatIsMyRoleButton = new JButton("Explore Roles");

        //When the becomeMemberPageButton is clicked, close (dispose) the BecomeMemberSection and open the BecomeMemberPage
        
        becomeMemberPageButton.addActionListener(e -> {
            dispose();
            new BecomeMemberPage().setVisible(true);
        });
        
        //When the viewMembersButton is clicked, close (dispose) the BecomeMemberSection and open the viewCurrentMembersPage
        
        viewMembersButton.addActionListener(e -> {
            dispose();
            new ViewCurrentMembersPage().setVisible(true);
        });
        
        //When the whatIsMyRoleButton is clicked, close (dispose) the BecomeMemberSection and open the exploreRolesPage

        whatIsMyRoleButton.addActionListener(e -> {
            dispose();
            new ExploreRolesPage().setVisible(true);
        });

        //JPanel allows me to enclose my buttons in a container(panel) structure that looks orderly
        
        JPanel buttonPanel = new JPanel();
        
        buttonPanel.add(becomeMemberPageButton);
        buttonPanel.add(viewMembersButton);
        buttonPanel.add(whatIsMyRoleButton);
        
        //This button is created to send the user back to the homepage. 
        
        JButton backBtn = new JButton("Back to Home");
        
        backBtn.addActionListener(e -> {
        dispose();
        new HomeScreen().setVisible(true);
        });
        
        //This is the code to allow the x button to close the page but not the app so it returns to the previous page
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void
                    windowClosing(java.awt.event.WindowEvent e) {
                        goBackToHome();
                    }
        });

        //the add function literally adds these objects to my JFrame window! North puts the pageTitleLabel at the very top of the page and CENTER puts the buttonPanel in the center of the page
        //South puts the back button on the bottom of the page
        
        add(pageTitleLabel, "North");
        
        add(buttonPanel, "Center");
        
        add(backBtn, "South");
    }
    
}