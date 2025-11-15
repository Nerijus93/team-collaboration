/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zerohungerapp;

/**
 *
 * @author Tiyko
 */

import java.time.LocalDate;

public class Zerohungerapp {

    public static void main(String[] args) {
        Restaurant r1 = new Restaurant(101, "Green Bites", "123 Eco Street", null);

        CollectionSchedule cs1 = new CollectionSchedule(
                501,
                r1,
                LocalDate.of(2025, 11, 20),
                "10:00-12:00",
                "Vegetarian",
                "2025-11-20 10:00"
        );

        System.out.println(r1);
        System.out.println(cs1);
    }
}
