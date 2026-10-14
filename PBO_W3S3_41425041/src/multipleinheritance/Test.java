/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multipleinheritance;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425041
Nama: Elisabeth Nunut Pinta Marito Simaramata
*/

public class Test {

    public static void main(String[] args) {

        // Membuat objek AmphibiousVehicle
        AmphibiousVehicle obj =
            new AmphibiousVehicle();

        // Memanggil method dari WaterVehicle
        obj.waterInfo();

        // Memanggil method dari LandVehicle
        obj.landInfo();
    }
}