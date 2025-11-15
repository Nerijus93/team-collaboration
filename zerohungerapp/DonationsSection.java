
package com.zero.hunger.zerohungerapp;

import javax.swing.*;

/**
 *
 * @author User
 */

public class DonationsSection extends JFrame{
    
    public static void main(String []args){
        
    }
    
    public DonationsSection() {
         
        setTitle("Donations Section"); //This sets the title of the window to Zero Hunger App
        setSize(800, 500); //This determines the dimensions of the window x axis, y axis
        setLocationRelativeTo(null); //This centers the window relative to the users device screen
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Good practice so that the window closes completely and no background programs are running

        JLabel pageTitleLabel = new JLabel("This is the Donations Section", SwingConstants.CENTER); //A JLabel creates a label that acts as a Heading and is centered
        
        pageTitleLabel.setFont(pageTitleLabel.getFont().deriveFont(40f)); //This code increases the font size 

        /*This section below creates buttons related to the content within the App*/
        
        JButton donationScreenButton = new JButton("Donation Screen");
        JButton donationButton = new JButton("Make a Donation");
        JButton donationManagerButton = new JButton("Manage Donations");

        /*When the memberButton is clicked, close (dispose) the mainPage and open the BecomeMemberPage*/
        
        donationScreenButton.addActionListener(e -> {
            dispose();
            new DonationScreen().setVisible(true);
        }); 
        
        /*donationButton.addActionListener(e -> {
            dispose();
            new Donation().setVisible(true);
        }); */
        
        /*donationManagerButton.addActionListener(e -> {
            dispose();
            new DonationManager().setVisible(true);
        }); */

        /*The rest of the buttons will simply display these messages when clicked as they are not my work*/
        
        //donationsButton.addActionListener(e -> JOptionPane.showMessageDialog(this,
                //"This section will be developed by another team member."));
        //collectionButton.addActionListener(e -> JOptionPane.showMessageDialog(this,
               // "This section will be developed by another team member."));

        /*JPanel allows us to enclose our buttons in a container(panel) structure that looks orderly*/
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(donationScreenButton);
        buttonPanel.add(donationButton);
        buttonPanel.add(donationManagerButton);
        
        JButton backBtn = new JButton("Back to Home");
        
        backBtn.addActionListener(e -> {
        dispose();
        new MainPage().setVisible(true);
        });
        
        add(backBtn, "South");

        /*the add function literally adds these objects to out JFrame window! North puts the pageTitleLabel at the very top of the page and CENTER puts the buttonPanel in the center of the page*/
        
        add(pageTitleLabel, "North");
        add(buttonPanel, "Center");
    }
    
    
    
}
