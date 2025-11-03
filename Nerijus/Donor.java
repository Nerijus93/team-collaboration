/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nerijus;

/**
 *
 * @author ITwork
 */
public class Donor extends Person {

    private int donorId;

    public Donor(int donorId, String name, String email, String phone) {
        super(name, email, phone);
        this.donorId = donorId;
    }

    public int getDonorId() {
        return donorId;
    }

    @Override
    public String getRoleInfo() {
        return "Donor ID: " + donorId + " Name: " + name;
    }
}
