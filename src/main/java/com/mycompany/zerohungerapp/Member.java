/*This is an Instantiable class that is made to work alongside the BecomeMemberPage and ViewCurrentMembersPage*/

/*
Aidas Kibas 
November 1st - December 1st 2025
*/

package com.mycompany.zerohungerapp;

public class Member {

    //Declaring all necessary strings for the form that will be saved to the system
    
    private String fullName;
    private String email;
    private String password;
    private String contactNumber;
    private String imagePath;
    private String role;
    
    //Member constructor takes 6 pieces of info from the form in becomeMemberPage and assigns them into their own dedicated fields for later

    public Member(String fullName, String email, String contactNumber, String password, String imagePath, String role) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.contactNumber = contactNumber;
        this.imagePath = imagePath;
        this.role = role;
    }
    
    //Getter methods let this information return to the display area of the viewcurrentmembers page when called

    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getContactNumber() { return contactNumber; }
    public String getImagePath() { return imagePath; }
    public String getRole() { return role; }

    //This code returns the information in a String type so that it can be read by the user in the viewCurrentMembers page
    
    @Override
    public String toString() {
        return "Name: " + fullName +
               "\nRole: " + role +
               "\nEmail: " + email +
               "\nPhone: " + contactNumber +
               "\nImage Path: " + (imagePath == null ? "None" : imagePath);
    }
}
