/*This is the main page for the Zero Hunger App. The group members responsible for this project are: Nerijus Kmitas, Ionut Ciobanu, and Aidas Kibas*/

/*This is follows a file structure in a maven folder to make things more organised*/

package com.zero.hunger.zerohungerapp;

/*Import allows us to use different functionalities within the code. javax.swing allows us to use a GUI*/

import javax.swing.*;

/*Declares my class MainPage as a Window(JFrame) that has functionalities such as setSize and content*/

public class MainPage extends JFrame {
    
    /*This is the main method of the code, it also ensures the main page loads and the UI is created*/
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainPage().setVisible(true));
    }
    
    /*This is the Constructor for MainPage where I can alter the dimensions, content, and functions within my home page window*/
    
     public MainPage() {
         
        setTitle("Zero Hunger App"); //This sets the title of the window to Zero Hunger App
        setSize(800, 500); //This determines the dimensions of the window x axis, y axis
        setLocationRelativeTo(null); //This centers the window relative to the users device screen
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Good practice so that the window closes completely and no background programs are running

        JLabel pageTitleLabel = new JLabel("Welcome to The Zero Hunger App", SwingConstants.CENTER); //A JLabel creates a label that acts as a Heading and is centered
        
        pageTitleLabel.setFont(pageTitleLabel.getFont().deriveFont(40f)); //This code increases the font size 

        /*This section below creates buttons related to the content within the App*/
        
        JButton memberButton = new JButton("Membership Section");
        JButton donationsButton = new JButton("Donations Section");
        JButton collectionButton = new JButton("Food Collection Section");

        /*When the memberButton is clicked, close (dispose) the mainPage and open the BecomeMemberPage*/
        
        memberButton.addActionListener(e -> {
            dispose();
            new BecomeMemberSection().setVisible(true);
        });
        
        donationsButton.addActionListener(e -> {
            dispose();
            new DonationsSection().setVisible(true);
        });
        
        collectionButton.addActionListener(e -> {
            dispose();
            new FoodCollectionSection().setVisible(true);
        });
        
        /*JPanel allows us to enclose our buttons in a container(panel) structure that looks orderly*/
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(memberButton);
        buttonPanel.add(donationsButton);
        buttonPanel.add(collectionButton);

        /*the add function literally adds these objects to out JFrame window! North puts the pageTitleLabel at the very top of the page and CENTER puts the buttonPanel in the center of the page*/
        
        add(pageTitleLabel, "North");
        add(buttonPanel, "Center");
    }
    
}
