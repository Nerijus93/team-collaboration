/*This section is dedicated to allow the user to see the members of the ZERO HUNGER organisation and their details as it is stored in a txt file*/
/* It also allows the Manager to Delete a user from the system*/

/*
Aidas Kibas 
November 1st - December 1st 2025
*/

package com.mycompany.zerohungerapp;

//Imported utilities 

import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

//JFrame window for a GUI

public class ViewCurrentMembersPage extends JFrame {

    //Declaring a text area where all the members will show
    
    private JTextArea displayCurrentMembers;
    
    //Creating the goBackToHome function to be called 
    
    private void goBackToHome() {
            new BecomeMemberSection().setVisible(true);
            dispose();
        }

    //Adjusting the GUI window by size, location, and title
    
    public ViewCurrentMembersPage() {
        setTitle("Current Members");
        setSize(500, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Here the JLabel for the title is created and is centered with a font size of 20
        
        JLabel title = new JLabel("View Current Members", SwingConstants.CENTER);
        title.setFont(title.getFont().deriveFont(20f));

        // This is the code for the display area of the members that adjusts font size and makes it scrollable if theres too much text
        
        displayCurrentMembers = new JTextArea();
        
        displayCurrentMembers.setEditable(false);
        displayCurrentMembers.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(displayCurrentMembers);

        // Declaring buttons for specific tasks (delete a member and go back buttons)
        
        JButton backBtn = new JButton("Go Back");
        JButton deleteBtn = new JButton ("Delete a Member");
            
        //Same code as before to close the current window using x and not the whole app - Nerijus Kmitas
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void
                    windowClosing(java.awt.event.WindowEvent e) {
                        goBackToHome();
                    }
        });


        //Back button that allows me to go back one page when clicked
        
        backBtn.addActionListener(e -> {
            dispose();
            new BecomeMemberSection().setVisible(true);
        });
        
        //When the delete button is pressed, show the following message and allow input from the user
        
        deleteBtn.addActionListener(e -> {
           String email = JOptionPane.showInputDialog(
           this,
                   
                   "Please enter the email of a current member to DELETE:"
                   
           );
           
           //Here the if statement checks if the email entered is valid. If so, it deletes the member from the "database" and laods the updated members function
           //If its not valid then the system shows the error in the else{ section
           
           if(email != null && !email.trim().isEmpty()){
               boolean beenDeleted = MemberDatabase.deleteMember(email.trim());
               
               if(beenDeleted){
                   loadMembers();
               JOptionPane.showMessageDialog(this, "Member has been Successfully deleted.");
           } else {
               JOptionPane.showMessageDialog(this, "This member does not exist.\n Please try again...");
           }
        }
            
         
        });

        //Creating a panel where both the delete and go back button will sit
        
        JPanel buttonPanel = new JPanel(new FlowLayout());
        
        buttonPanel.add(deleteBtn);
        buttonPanel.add(backBtn);

        //Here the code lays out where which part of the GUI is - NORTH is top of screen, CENTER is center, and SOUTH is bottom
        
        add(title, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        loadMembers();//Declaring the loadMembers function to run later
    }
    
    //Here the loadMembers function begins to run
    
    private void loadMembers(){
        displayCurrentMembers.setText("");
        
        //If the member database is empty (nobody filled in the form) then the following message will show
        
    if (MemberDatabase.getMembers().isEmpty()) {
        displayCurrentMembers.setText("There are currently no active members...");
        return;
    }
    
    //But if there are members, loop the memberDatabase and find all the information of active members and display them in the display area
    
    for (Member m : MemberDatabase.getMembers()) {
        displayCurrentMembers.append(m.toString() + "\n\n--------------------\n\n");// -------- makes a nice divide between each member for clearer viewing
    }
}

    }
