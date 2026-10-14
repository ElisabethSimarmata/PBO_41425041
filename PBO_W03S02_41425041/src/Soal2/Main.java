/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425041
Nama: Elisabeth Nunut Pinta Marito Simaramata
*/

class Mahasiswa {
    String nama;
    String nim;
}

class MahasiswaAktif extends Mahasiswa {
    int semester;

    void belajar() {
        System.out.println(nama + " sedang belajar di semester " + semester);
    }
}

public class Main {
    public static void main(String[] args) {
        MahasiswaAktif m = new MahasiswaAktif();
        m.nama = "Dina";
        m.nim = "123456";
        m.semester = 5;

        System.out.println("Nama: " + m.nama);
        System.out.println("NIM: " + m.nim);
        m.belajar();
    }
}