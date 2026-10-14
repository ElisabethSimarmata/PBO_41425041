/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian1_1;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

class MesinTarif {

    // Menyimpan kota asal
    private String kotaAsal;

    // Constructor
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // Hitung ongkir biasa berdasarkan berat
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    // Hitung ongkir + asuransi
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        // Biaya asuransi 1% dari nilai barang
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }

    // Hitung ongkir express
    public double hitungOngkir(double beratKg, boolean isExpress) {
        // Ongkir awal
        double total = beratKg * 10000;
        // Tambah biaya kalau express
        if (isExpress) {
            total += 20000;
        }

        return total;
    }
}

public class SimulasiOverloading {
    public static void main(String[] args) {
        MesinTarif tarif = new MesinTarif("Medan"); // Membuat objek MesinTarif
        
        System.out.println("=== INI METHOD OVERLOADING ==="); 
        System.out.println("Ongkir Biasa (2.0 Kg)       : Rp " + tarif.hitungOngkir(2.0)); // Ongkir biasa
        System.out.println("Ongkir + Asuransi (Barang 5Jt): Rp " + tarif.hitungOngkir(2.0, 5000000)); // Ongkir dengan asuransi
        System.out.println("Ongkir Express (2.0 Kg)     : Rp " + tarif.hitungOngkir(2.0, true)); // Ongkir express
    }
}