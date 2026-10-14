/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian2_1;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

abstract class KendaraanEkspedisi {
    protected String noPolisi;
    protected int kapasitasKg;

    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " kg");
    }

    public abstract void angkutBarang(String namaBarang);
}

class TrukBox extends KendaraanEkspedisi {

    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk " + noPolisi + " memuat " + namaBarang
                + " ke dalam kontainer tertutup pendingin.");
    }
}

class MobilVan extends KendaraanEkspedisi {

    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat " + namaBarang
                + " di bagian belakang untuk distribusi kota.");
    }
}

public class SimulasiAbstraksi {

    public static void main(String[] args) {

        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        // KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: Instansiasi dari subclass konkret
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();
        fuso.angkutBarang("20 Ton Kulkas");

        System.out.println("--------------------------------");

        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
}

// LEMBAR ANALISIS ABSTRAKSI:

// Eksperimen 1:
// Saat baris new KendaraanEkspedisi() dijalankan, muncul error karena KendaraanEkspedisi merupakan abstract class. Jadi, abstract class tidak bisa dibuat objeknya secara langsung menggunakan keyword new.

// Pesan error yang muncul:
// "KendaraanEkspedisi is abstract; cannot be instantiated"

// Eksperimen 2: TrukBox dan MobilVan bisa dibuat objeknya karena keduanya merupakan class turunan yang konkret. Kedua class tersebut menggunakan constructor dari
// KendaraanEkspedisi dengan bantuan super() dan wajib membuat method angkutBarang() karena method tersebut merupakan abstract method.

// Kesimpulan: Menurut saya, abstract class digunakan sebagai kerangka dasar untuk class turunannya. Abstract class bisa memiliki atribut, constructor, method biasa,
// dan abstract method. Tetapi abstract class tidak bisa langsung dibuat menjadi objek menggunakan keyword new.