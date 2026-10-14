/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConstructorOverloading;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425041
Nama: Elisabeth Nunut Pinta Marito Simaramata
*/ 

public class Geeks {

    // Constructor dengan satu parameter String
    Geeks(String name) {
        System.out.println(
            "Constructor with one argument - String: "
            + name
        );
    }

    // Constructor dengan dua parameter
    Geeks(String name, int age) {
        System.out.println(
            "Constructor with two arguments: "
            + "String and Integer: "
            + name + " " + age
        );
    }

    // Constructor dengan satu parameter long
    Geeks(long id) {
        System.out.println(
            "Constructor with one argument: "
            + "Long: " + id
        );
    }
}
