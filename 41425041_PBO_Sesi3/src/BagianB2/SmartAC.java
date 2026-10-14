/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB2;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

// Class SmartAC yang dapat dinyalakan dan terhubung ke WiFi
class SmartAC implements Switchable, Connectable {
    
    // Menyimpan suhu dan status AC
    private double temperature;
    private boolean isOn;

    // Membuat AC dengan suhu awal dan kondisi mati
    public SmartAC(double temperature) {
        this.temperature = temperature;
        this.isOn = false;
    }

    // Menyalakan AC
    @Override 
    public void turnOn() {
        isOn = true;
        System.out.println("Smart AC menyala.");
    }

     // Mematikan AC
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart AC mati.");
    }

    // Menghubungkan AC ke WiFi jika AC menyala
    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (isOn) {
            System.out.println("Smart AC terhubung ke WiFi " + ssid
                    + " dengan IP " + ipAddress);
        } else {
            System.out.println("Error: Smart AC harus menyala terlebih dahulu!");
        }
    }
}