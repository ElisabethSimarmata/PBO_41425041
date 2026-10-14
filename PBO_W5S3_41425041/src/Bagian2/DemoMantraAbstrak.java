/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian2;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

import java.util.*;

// Abstract class MantraAbstrak
abstract class MantraAbstrak {
    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Method abstrak
    public abstract void efek();

    // Method untuk mengucapkan mantra
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

// Class Expelliarmus
class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

// Class ExpectoPatronum
class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

// Tambahan class Lumos
// Class Lumos mewarisi MantraAbstrak
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menghasilkan cahaya.");
    }
}

// Class utama
public class DemoMantraAbstrak {
    public static void main(String[] args) {
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos();

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();

        mantra3.ucapkan();
        mantra3.efek();
    }
}

/*
PERTANYAAN 
1. Apa yang terjadi jika kita membuat objek MantraAbstrak langsung?
Jawaban:
Akan error karena abstract class tidak bisa dibuat objek langsung.

2. Mengapa kita perlu membuat abstract class? Apa keuntungannya?
Jawaban:
Abstract class menjadi dasar bagi class lain. Setiap mantra bisa memiliki efek yang berbeda.
*/

