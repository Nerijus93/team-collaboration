/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

/**
 *
 * @author ITwork
 */
public class Member {

    private int memberId;
    private String name;
    private String email;
    private String phone;
    private String joinDate;
    private Role role;

    public Member(int memberId, String name, String email, String phone, String joinDate, Role role) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.joinDate = joinDate;
        this.role = role;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public Role getRole() {
        return role;
    }

    public void updateProfile(String newEmail, String newPhone) {
        this.email = newEmail;
        this.phone = newPhone;
    }

    public String viewDetails() {
        return "Member ID: " + memberId + "\nName: " + name + "\nEmail: " + email + "\nPhone: " + phone + "\nJoin Date: " + joinDate + "\n" + role.getRoleInfo();
    }
}
