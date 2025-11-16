/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zerohungerapp;

import java.util.ArrayList;

/**
 *
 * @author ITwork
 */
public class MemberManager {

    private ArrayList<Member> memberList;

    public MemberManager() {
        memberList = new ArrayList<>();
    }

    public void addMember(Member m) {
        memberList.add(m);
        System.out.println("Member added: " + m.getName());
    }

    public void removeMember(int memberId) {
        for (int i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).getMemberId() == memberId) {
                System.out.println("Removed: " + memberList.get(i).getName());
                memberList.remove(i);
                return;
            }
        }
        System.out.println("Member ID not found.");
    }

    public Member getMemberByEmail(String email) {
        for (Member m : memberList) {
            if (m.getEmail().equalsIgnoreCase(email)) {
                return m;
            }
        }
        return null;
    }

    public void listMembers() {
        for (Member m : memberList) {
            System.out.println("------");
            System.out.println(m.viewDetails());
        }
    }
}
