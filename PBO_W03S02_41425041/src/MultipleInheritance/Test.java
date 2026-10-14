/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultipleInheritance;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425041
Nama: Elisabeth Nunut Pinta Marito Simaramata
*/

interface LandVehicle {
    default void landInfo() { System.out.println("This is a LandVehicle"); }
}
interface WaterVehicle {
    default void waterInfo() { System.out.println("This is a WaterVehicle"); }
}
class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    AmphibiousVehicle() { System.out.println("This is an AmphibiousVehicle"); }
}
public class Test {
    public static void main(String[] args) {
        AmphibiousVehicle obj = new AmphibiousVehicle();
        obj.waterInfo();
        obj.landInfo();
    }
}
