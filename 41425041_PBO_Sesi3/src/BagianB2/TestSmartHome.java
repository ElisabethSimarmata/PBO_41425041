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

public class TestSmartHome {
    public static void main(String[] args) {
        // Membuat objek lampu dan AC
        SmartLamp lamp = new SmartLamp(80);
        SmartAC ac = new SmartAC(24);

        lamp.connectToWifi("WiFi-Del", "192.168.1.10");

        lamp.turnOn();
        lamp.connectToWifi("WiFi-Del", "192.168.1.10");
        lamp.turnOff();

        ac.connectToWifi("WiFi-Del", "192.168.1.11");   // Mencoba menghubungkan AC saat mati

        ac.turnOn();
        ac.connectToWifi("WiFi-Del", "192.168.1.11");
        ac.turnOff();  // Mematikan AC
    }
}
