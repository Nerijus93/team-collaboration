/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*A class dedicated to storing the information from the BecomeMemberPage form and saving the info to a txt file so the info is saved when the app is closed*/

/*
Aidas Kibas 
November 1st - December 1st 2025
*/

package com.mycompany.zerohungerapp;

//Import ArrayList utility and io for saving to a file

import java.io.*;
import java.util.*;


public class MemberDatabase {

    //Declaring an array list for users that have filled out the form and storing them here in the array list
    
    private static final ArrayList<Member> currentMembers = new ArrayList<>();
    
    //Declaring the txt file where all the information will be saved to 
    
    private static final String ZeroHungerMembers = "currentMembers.txt";
    
    //declaring the loadFromFile method to be called later
    
    static{
        loadFromFile();
    }

    //adds a member to the members array list
    
    public static void addMember(Member member) {
        currentMembers.add(member);
        saveToFile(member);
    }

    //This returns the full array list of members when it is called in the viewCurrentMembersPage
    
    public static ArrayList<Member> getMembers() {
        return currentMembers;
    }
    
    //Declaring the deleteMember method that will return a boolean (true or false depending on email existance)
    
    public static boolean deleteMember (String emailToDelete){
            Iterator<Member> iterator = currentMembers.iterator(); //an iterator is created for safe deletion of a member
            
            while(iterator.hasNext()){ //looping for more members
                Member m = iterator.next(); //retrieve the next member
                if(m.getEmail().equalsIgnoreCase(emailToDelete)){ //if the email matches that of the users input then remove that member 
                    iterator.remove();
                    saveAllMembersToFile(); // once deletion is complete, save the members txt file again so it will be correct even when the app is restarted
                    return true; //return the true message if the deletion was a success
                }
                
            }
            
            return false; //otherwise return false boolean
        }
    
    //Running the saveAllMembersToFile method
    
    private static void saveAllMembersToFile(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ZeroHungerMembers))){ //Writes to a txt file called ZeroHungerMembers
            for (Member m : currentMembers){ //loops through current members and writes all their details as seen below
                writer.write(
                m.getFullName() + "|" +
                m.getEmail() + "|" +
                m.getContactNumber() + "|" +
                m.getImagePath() + "|" +
                m.getRole() 
                );
                writer.newLine(); //moves to a new line so its concise
            }
        } catch (IOException e){ //catches any error and prints them if there are any
            e.printStackTrace();
        }
        
    }
    
    //Calling the saveTofile method from member class
    
    private static void saveToFile(Member m){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(ZeroHungerMembers, true))){ //writing the information into a txt file (zeroHungerMembers)
            writer.write(m.getFullName() + "|" + m.getEmail() + "|" + m.getContactNumber() + "|" + m.getImagePath() + "|" + m.getRole());
            writer.newLine(); //write on a new line 
        } catch (IOException e){ //catch any errors and show them if there are any
            e.printStackTrace();
        }
    }
    
    //running the loadFromFile method
    
    private static void loadFromFile(){
        File file = new File(ZeroHungerMembers); //create a new file calling ZeroHungerMembers
        if(!file.exists()){ //checking if the file actually exists. if not - return nothing
            return;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(ZeroHungerMembers))){ //The reader reads the file line by line 
            
            String line;
            while ((line = reader.readLine()) !=null){ //reads the file until the end
                String[] parts = line.split("\\|");//splits the information with a |
                
                if (parts.length == 5){ //checking if the line has exactly 5 fields for error prevention
                    String fullName = parts[0];
                    String email = parts[1];
                    String contactNumber = parts[2];
                    String imagePath = parts[3];
                    String role = parts[4];
                    
                    currentMembers.add(new Member(fullName, email, null, contactNumber, imagePath, role));//adds the info to the currentMembers list
                }
            }
        } catch (IOException e){ //any errors will be printed
            e.printStackTrace();
        }
        
        
        
        
    }
}
