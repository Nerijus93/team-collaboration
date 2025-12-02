/*An instantiable class for the exploreRoles page*/

/*
Aidas Kibas 
November 1st - December 1st 2025
*/

package com.mycompany.zerohungerapp;

public class Role {
    
    //Declaring name and description as Strings
    
    private String name;
    private String description;

    //Takes the strings of name and description and assigns them to name and description
    
    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //getName is a getter used to return the name from the instantiable class
    
    public String getName() {
        return name;
    }

    //getDescription is a getter used to return the description from the instantiable class
    
    public String getDescription() {
        return description;
    }
    
    //This is what allows the user to see the displayed name in the drop down menu (JCombo Box)
    
    @Override
    public String toString() {
        return name;
    }
}
