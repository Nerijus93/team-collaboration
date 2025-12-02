/*A class dedicated to storing the information from the BecomeMemberPage form*/

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
    
    //
    
    private static final String ZeroHungerMembers = "currentMembers.txt";
    
    //
    
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
    
    //
    
    public static boolean deleteMember (String emailToDelete){
            Iterator<Member> iterator = currentMembers.iterator();
            
            while(iterator.hasNext()){
                Member m = iterator.next();
                if(m.getEmail().equalsIgnoreCase(emailToDelete)){
                    iterator.remove();
                    saveAllMembersToFile();
                    return true;
                }
                
            }
            
            return false;
        }
    
    private static void saveAllMembersToFile(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ZeroHungerMembers))){
            for (Member m : currentMembers){
                writer.write(
                m.getFullName() + "|" +
                m.getEmail() + "|" +
                m.getContactNumber() + "|" +
                m.getImagePath() + "|" +
                m.getRole() 
                );
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
    private static void saveToFile(Member m){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(ZeroHungerMembers, true))){
            writer.write(m.getFullName() + "|" + m.getEmail() + "|" + m.getContactNumber() + "|" + m.getImagePath() + "|" + m.getRole());
            writer.newLine();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    private static void loadFromFile(){
        File file = new File(ZeroHungerMembers);
        if(!file.exists()){
            return;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(ZeroHungerMembers))){
            
            String line;
            while ((line = reader.readLine()) !=null){
                String[] parts = line.split("\\|");
                
                if (parts.length == 5){
                    String fullName = parts[0];
                    String email = parts[1];
                    String contactNumber = parts[2];
                    String imagePath = parts[3];
                    String role = parts[4];
                    
                    currentMembers.add(new Member(fullName, email, contactNumber, null, imagePath, role));
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        
        
        
        
    }
}
