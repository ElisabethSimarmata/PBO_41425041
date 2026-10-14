/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HybridInheritance;

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
class Car extends Vehicle {
    Car() { System.out.println("This Vehicle is Car"); }
}
class Fare extends Vehicle {
    Fare() { System.out.println("Fare of Vehicle"); }
}
class Bus extends Fare {
    Bus() { System.out.println("This Vehicle is Bus"); }
}
public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        Bus b = new Bus();
    }
}
