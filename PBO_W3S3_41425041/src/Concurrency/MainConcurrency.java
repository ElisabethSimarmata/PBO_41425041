/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concurrency;

/**
 *
 * @author ASUS
 */

/*
NIM: 41425041
Nama: Elisabeth Nunut Pinta Marito Simaramata
*/

public class MainConcurrency {
    public static void main(String[] args) {

        AntreanShared antrean = new AntreanShared();

        // Thread Produsen
        Thread produsen = new Thread(() -> {
            String[] listPesan = {"Halo", "Belajar Java", "Selesai"};

            for (String p : listPesan) {
                antrean.kirimPesan(p);
            }
        });

        // Thread Konsumen
        Thread konsumen = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                antrean.ambilPesan();
            }
        });

        // Menjalankan thread produsen
        produsen.start();

        // Menjalankan thread konsumen
        konsumen.start();
    }
}