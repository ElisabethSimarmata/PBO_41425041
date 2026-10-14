/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tantangan;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

import java.util.ArrayList;
import java.util.List;

// Abstract class sebagai dasar untuk semua mantra perlindungan
abstract class MantraPerlindungan {

    // Setiap mantra harus memiliki cara untuk diaktifkan
    public abstract void aktifkan();
    // Setiap mantra harus memiliki cara untuk dinonaktifkan
    public abstract void nonaktifkan();
}

// Class Protego untuk membuat perisai perlindungan
class Protego extends MantraPerlindungan {

    // Menampilkan pesan saat perisai Protego diaktifkan
    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    // Menampilkan pesan saat perisai Protego dinonaktifkan
    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego dinonaktifkan.");
    }
}

// Class Fidelius untuk melindungi rahasia suatu tempat
class Fidelius extends MantraPerlindungan {
    private String secretKeeper;

    // Menyimpan nama penyihir yang menjadi secret keeper
    public Fidelius(String secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    // Mengaktifkan Fidelius dengan bantuan secret keeper
    @Override
    public void aktifkan() {
        System.out.println("Mantra Fidelius diaktifkan oleh secret keeper: "
                + secretKeeper);
    }

    // Menampilkan pesan saat mantra Fidelius dinonaktifkan
    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Fidelius dinonaktifkan.");
    }
}

// Class untuk mencegah apparition di area tertentu
class MantraAntiApparition extends MantraPerlindungan {
    private String area;

    // Menyimpan nama area yang akan dilindungi
    public MantraAntiApparition(String area) {
        this.area = area;
    }

    // Mengaktifkan perlindungan apparition di area yang dipilih
    @Override
    public void aktifkan() {
        System.out.println("Mantra Anti-Apparition aktif di area " + area + ".");
    }

    // Menonaktifkan perlindungan apparition di area tersebut
    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Anti-Apparition dinonaktifkan di area "
                + area + ".");
    }
}

// Class untuk menyimpan dan mengatur semua mantra perlindungan
class SistemPertahanan {
    private List<MantraPerlindungan> daftarMantra;

    // Membuat daftar kosong untuk menyimpan mantra
    public SistemPertahanan() {
        daftarMantra = new ArrayList<>();
    }

    // Menambahkan mantra ke dalam daftar sistem pertahanan
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra berhasil ditambahkan.");
    }

    // Mengaktifkan semua mantra yang sudah ditambahkan
    public void aktifkanSemuaMantra() {
        System.out.println("\n=== Mengaktifkan Semua Mantra ===");

        // Mengaktifkan setiap mantra di dalam daftar
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    // Menonaktifkan semua mantra yang sudah ditambahkan
    public void nonaktifkanSemuaMantra() {
        System.out.println("\n=== Menonaktifkan Semua Mantra ===");

        // Menonaktifkan setiap mantra di dalam daftar
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}

// Class utama untuk menjalankan program
public class SistemPertahananHogwarts {
    public static void main(String[] args) {

        // Membuat objek sistem pertahanan Hogwarts
        SistemPertahanan hogwarts = new SistemPertahanan();
        // Membuat objek mantra Protego
        MantraPerlindungan protego = new Protego();
        // Membuat Fidelius dengan Albus Dumbledore sebagai secret keeper
        MantraPerlindungan fidelius = new Fidelius("Albus Dumbledore");
        // Membuat mantra Anti-Apparition untuk melindungi Aula Besar
        MantraPerlindungan antiApparition = new MantraAntiApparition("Aula Besar");

        // Menambah0kan ketiga mantra ke sistem pertahanan
        hogwarts.tambahMantra(protego);
        hogwarts.tambahMantra(fidelius);
        hogwarts.tambahMantra(antiApparition);

        hogwarts.aktifkanSemuaMantra();  // Menjalankan semua mantra perlindungan
        hogwarts.nonaktifkanSemuaMantra(); // Menonaktifkan semua mantra perlindungan
    }
}