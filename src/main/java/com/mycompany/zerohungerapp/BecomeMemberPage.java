/* BecomeMemberPage is my page that allows a user to "sign up" to ZEROHunger and become a member with a role within the organisation and save their info to a txt file*/

/*
Aidas Kibas 
November 1st - December 1st 2025
*/

package com.mycompany.zerohungerapp;

//Here I import utilities that allow me to use functions and other necessary structures in my page. .io links the info to the txt file so data is saved when the app is closed

import javax.swing.*;
import java.awt.*;
import java.io.File;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

//extends JFrame lets me create a GUI window that has content within it

public class BecomeMemberPage extends JFrame {
    
    //Here an array of items is made that will depict the role of the user when they submit their member form 
    
    private static final String[] ROLES = {
    "Manager", "Admin", "Collector", "Distributor", "Driver", "Packer", "Organiser"
};


    //This code allows me to close the page with the x button but not close the entire app
    
    private void goBackToHome() {
        new BecomeMemberSection().setVisible(true);
        dispose();
    }

    private JLabel imageLabel;
    private String imagePath;

    //This code creates a related title of the page and the size of the window
    
    public BecomeMemberPage() {
        
        setTitle("Become a Member");
        setSize(500, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Here i create a label that adds a label on the top middle of the window for the title and its font size
        
        JLabel title = new JLabel("Join the Zero Hunger Movement", SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(20f));

        //Here i create text fields imported with java swing that have specific character lengths e.g.(30)
        
        JTextField fullNameField = new JTextField(30);
        JTextField emailField = new JTextField(30);
        JPasswordField passwordField = new JPasswordField(20);
        JTextField contactField = new JTextField(15);

        //Here i create a button for uploading a profile picture, setting the preferred size of the photo and the border colour for where the profile will appear
        
        JButton uploadBtn = new JButton("Upload Profile (Not Required)");
        
        imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(100, 100));
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
         
        //Here an action listener waits until the button is pressed to perform the pickImage function
        
        uploadBtn.addActionListener(e -> pickImage());

        //Two buttons for submitting the form and going back a page
        
        JButton submitBtn = new JButton("Submit");
        
        JButton backBtn = new JButton("Go Back");
      
        //Here once the submit button is called it saves the users input into Strings and trims any unneccesary spaces before or after the text
        
        submitBtn.addActionListener(e -> {
            
            String name = fullNameField.getText().trim();
            String email = emailField.getText().trim();
            String password = new String(passwordField.getPassword()).trim();
            String contact = contactField.getText().trim();

            //And if any field is empty from the required fields it displays an error to the user
            
            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || contact.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all required fields...");
                return;
            }
            
            //getRandomRole() is a function that will generate a random role for the user using the array from earlier 
            
            String assignedRole = getRandomRole();


            //Here i call the member class which stores information, similar to a database and adds the users information
            
            Member newMember = new Member(name, email, password, contact, imagePath, assignedRole);
            MemberDatabase.addMember(newMember);

            //This is the message that is displayed once all fields are complete and submit button is pressed
            
            JOptionPane.showMessageDialog(this, "You are now a member of the ZERO HUNGER Organisation.\n Your role is: " + assignedRole + "\n Thank you for joining!");

            // Here all the fields are returned to empty fields for the next user after the information has been saved
            
            fullNameField.setText("");
            emailField.setText("");
            passwordField.setText("");
            contactField.setText("");
            imageLabel.setIcon(null);
            imagePath = null;
        });
        
        //Here is the code for the back button, disposing of the current page and going back to the becomeMemberSection
        
        backBtn.addActionListener(e -> {
            dispose();
            new BecomeMemberSection().setVisible(true);
        });

        //And this code is for preventing the whole app from closing using the x button
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void
                    windowClosing(java.awt.event.WindowEvent e) {
                goBackToHome();
            }
        });

        //Here a JPanel is created and a layout for the panel is also established so that it can be displayed on the window neatly
        //.add adds the button and associated text to the window
        //NORTH places the previously created title at the very top of the page
        //CENTER places the now established form in the center of the window
        
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 6, 6));
        
        formPanel.add(new JLabel("Full Name: (Required)"));
        formPanel.add(fullNameField);
        
        formPanel.add(new JLabel("Email: (Required)"));
        formPanel.add(emailField);
        
        formPanel.add(new JLabel("Password: (Required)"));
        formPanel.add(passwordField);
        
        formPanel.add(new JLabel("Contact Number: (Required)"));
        formPanel.add(contactField);
        
        formPanel.add(uploadBtn);
        formPanel.add(imageLabel);
        formPanel.add(submitBtn);
        formPanel.add(backBtn);

        add(title, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
    }

    //This is the code used to call the file explorer to choose an image for the users profile picture
    
    private void pickImage() {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selected = chooser.getSelectedFile();
            imagePath = selected.getAbsolutePath();
            ImageIcon icon = new ImageIcon(new ImageIcon(imagePath)
                    .getImage()
                    .getScaledInstance(100, 100, Image.SCALE_SMOOTH));
            imageLabel.setIcon(icon);
        }
    }
    
    //This is the code that calls the getRandomRole function and returns a random role based on the length of the array (1 of 7 roles)
    
    private String getRandomRole() {
    int number = (int) (Math.random() * ROLES.length);
    return ROLES[number];
}

}
