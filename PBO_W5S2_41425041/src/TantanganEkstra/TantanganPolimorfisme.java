/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TantanganEkstra;

/**
 *
 * @author ASUS
 */

// Parent class
class KendaraanEkspedisi {

    // Method yang akan dioverride oleh child class
    public void angkutBarang() {
        System.out.println("Kendaraan mengangkut barang.");
    }
}

// Child class 1
class Truk extends KendaraanEkspedisi {

    @Override
    public void angkutBarang() {
        System.out.println("Truk mengangkut barang melalui jalur darat.");
    }
}

// Child class 2
class Kapal extends KendaraanEkspedisi {

    @Override
    public void angkutBarang() {
        System.out.println("Kapal mengangkut barang melalui jalur laut.");
    }
}

// Child class 3
class Pesawat extends KendaraanEkspedisi {

    @Override
    public void angkutBarang() {
        System.out.println("Pesawat mengangkut barang melalui jalur udara.");
    }
}

// Class utama
public class TantanganPolimorfisme {

    public static void main(String[] args) {

        // Membuat array dengan tipe parent class
        KendaraanEkspedisi[] armada = {
            new Truk(),
            new Kapal(),
            new Pesawat()
        };

        System.out.println("=== POLIMORFISME KENDARAAN EKSPEDISI ===");

        // Satu for-loop untuk menjalankan semua objek
        for (KendaraanEkspedisi kendaraan : armada) {
            kendaraan.angkutBarang();
        }
    }
}
