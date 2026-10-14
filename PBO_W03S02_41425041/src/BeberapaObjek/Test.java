/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeberapaObjek;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425041
Nama: Elisabeth Nunut Pinta Marito Simaramata
*/

class Animal {
    void suara() { System.out.println("Hewan bersuara"); }
}
class Dog extends Animal {
    @Override void suara() { System.out.println("Guk guk"); }
}
class Cat extends Animal {
    @Override void suara() { System.out.println("Meong"); }
}

public class Test {
    public static void main(String[] args) {
        Animal obj = new Dog();   // menggunakan Dog object
        obj.suara();
        obj = new Cat();          // menggunakan Cat object
        obj.suara();
    }
}