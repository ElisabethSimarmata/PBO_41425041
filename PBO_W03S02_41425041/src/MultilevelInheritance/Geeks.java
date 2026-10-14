/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultilevelInheritance;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425041
Nama: Elisabeth Nunut Pinta Marito Simaramata
*/

class Vehicle {
    Vehicle() { System.out.println("This is a Vehicle"); }
}
class FourWheeler extends Vehicle {
    FourWheeler() { System.out.println("4 Wheeler Vehicles"); }
}
class Car extends FourWheeler {
    Car() { System.out.println("This 4 Wheeler Vehicle is a Car"); }
}
public class Geeks {
    public static void main(String[] args) {
        Car obj = new Car();
    }
}