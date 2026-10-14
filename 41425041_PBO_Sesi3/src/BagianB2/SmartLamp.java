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

// Class SmartLamp yang dapat dinyalakan dan terhubung ke WiFi
class SmartLamp implements Switchable, Connectable {
    // Menyimpan tingkat kecerahan dan status lampu
    private int brightness;
    private boolean isOn;

    // Membuat lampu dengan tingkat kecerahan awal
    public SmartLamp(int brightness) {
        this.brightness = brightness;
        this.isOn = false;
    }

    @Override // Menyalakan lampu
    public void turnOn() {
        isOn = true;
        System.out.println("Smart Lamp menyala.");
    }

    @Override // Mematikan lampu
    public void turnOff() {
        isOn = false;
        System.out.println("Smart Lamp mati.");
    }

    // Menghubungkan lampu ke WiFi jika lampu menyala
    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (isOn) {
            System.out.println("Smart Lamp terhubung ke WiFi " + ssid
                    + " dengan IP " + ipAddress);
        } else {
            System.out.println("Error: Smart Lamp harus menyala terlebih dahulu!");
        }
    }
}
