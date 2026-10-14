/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian1;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

import java.util.*;

// Class induk Penyihir
class Penyihir {
    // Method untuk menampilkan cara penyihir mengucapkan mantra
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

// Class HarryPotter mewarisi method dari class Penyihir
class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

// Class Hermonie mewarisi method dari class Penyihir
class Hermonie extends Penyihir {
    // Mengubah isi method agar sesuai dengan karakter Hermione
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

// Tambahan class RonWeasly
// Class RonWeasley mewarisi method dari class Penyihir
class RonWeasley extends Penyihir {
    // Mengubah isi method agar Ron memiliki perilaku yang berbeda
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra dengan penuh semangat.");
    }
}

// Class utama yang digunakan untuk menjalankan program
public class DemoPenyihir {
    public static void main(String[] args) {
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermonie();
        Penyihir penyihir3 = new RonWeasley();

        // Memanggil method sesuai dengan jenis objek yang dibuat
        penyihir1.ucapkanMantra();
        penyihir2.ucapkanMantra();
        penyihir3.ucapkanMantra();
    }
}

/*
PERTANYAAN PRAKTIKUM
1. Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode masih
berjalan?
Jawaban:
Program tetap berjalan jika method yang dibuat sudah benar. 
@Override hanya membantu memeriksa apakah method benar-benar menimpa method dari class induk.

2. Apa keuntungan polymorphism dalam contoh ini?
Jawaban:
Setiap penyihir bisa menggunakan method yang sama, tetapi menghasilkan perilaku yang berbeda.
*/

