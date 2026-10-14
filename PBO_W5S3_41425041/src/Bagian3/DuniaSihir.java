/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian3;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

import java.util.*;

import java.util.ArrayList;
import java.util.List;

// Abstract class Mantra
abstract class Mantra {
    private String nama; // Menyimpan nama mantra

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getNama() { // Mengambil nama mantra agar bisa digunakan oleh class lain
        return nama;
    }

    // Setiap jenis mantra harus memiliki efeknya sendiri
    public abstract void efek();
}

// Class Expelliarmus
class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

// Class ExpectoPatronum
class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

// Class Lumos
class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

// Class Penyihir
class Penyihir {
    private String nama;
    private List<Mantra> mantraList;

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    // Menambahkan mantra yang dipelajari
    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    // Mengucapkan mantra tertentu
    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();
                return;
            }
        }

        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    // Mengucapkan semua mantra yang dipelajari
    public void ucapkanSemuaMantra() {
        for (Mantra mantra : mantraList) {
            System.out.println(nama + " mengucapkan: " + mantra.getNama());
            mantra.efek();
        }
    }
}

// Class utama
public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");

        // Membuat objek dari setiap jenis mantra
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();
        Mantra lumos = new Lumos();

        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos");

        // Menambahkan mantra Lumos
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");

        // Mengucapkan semua mantra yang dipelajari
        harry.ucapkanSemuaMantra();
    }
}

/*
PERTANYAAN 
1. Bagaimana polymorphism dan abstract class bekerja sama?
Jawaban:
Abstract class menjadi dasar untuk semua mantra. Polymorphism membuat setiap mantra memiliki efek berbeda.

2. Apa yang terjadi jika menambahkan mantra baru tanpa mengubah class Penyihir? Apakah mudah? Mengapa?
Jawaban:
Mudah. Kita cukup membuat class mantra baru dan menambahkannya ke penyihir tanpa mengubah class Penyihir.
*/

