/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

/**
 *
 * @author Nerijus Kmitas
 * Student ID x24170232
 */

public abstract class Person {
    protected String name;
    protected String email;
    protected String phone;
    protected String lastName;

    //Constructor to store personal information
    public Person(String name, String lastName, String email, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    //Subclasses to give role specific information
    public abstract String getRoleInfo();

    @Override
    public String toString() {
        return "Name: " + name + 
                "\nLast Name: " + lastName + 
                "\nEmail: " + email + 
                "\nPhone: " + phone;
    }
}
