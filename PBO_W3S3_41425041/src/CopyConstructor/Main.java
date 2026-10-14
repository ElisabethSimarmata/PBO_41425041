/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CopyConstructor;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425041
Nama: Elisabeth Nunut Pinta Marito Simaramata
*/

public class Main {

    public static void main(String[] args) {

        System.out.println("First Object");

        // Membuat objek pertama
        Geeks geek1 = new Geeks("Sweta", 68);

        System.out.println(
            "GeekName: " + geek1.name +
            " and GeekId: " + geek1.id
        );

        System.out.println();

        // Membuat objek kedua dengan copy constructor
        Geeks geek2 = new Geeks(geek1);

        System.out.println("Copy Constructor used Second Object");

        System.out.println(
            "GeekName: " + geek2.name +
            " and GeekId: " + geek2.id
        );
    }
}
