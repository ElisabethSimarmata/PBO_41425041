
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

// String Manipulation adalah proses mengolah teks dalam Java.

import java.util.*; // Mengimpor library Java untuk menggunakan fungsi tambahan

// membuat public class dengan nama StringManipulation sebagai tempat untuk menuliskan kode program
public class StringManipulation { 

    // membuat method main sebagai tempat menjalankan semua kode program saat di-Run.
    public static void main(String[] args) {

        // Membuat variabel text untuk menyimpan kalimat
        String text = "Hello World! Welcome to Java Programming";

        // Menampilkan judul operasi dasar String
        System.out.println("=== BASIC STRING OPERATIONS ===");
        // Menampilkan teks asli
        System.out.println("Original: '" + text + "'");
        
    // Pada bagian ini menggunakan beberapa method untuk mengolah teks
        // length() digunakan untuk menghitung jumlah karakter
        System.out.println("Length: " + text.length());
        // trim() digunakan untuk menghapus spasi di awal dan akhir
        System.out.println("Trimmed: '" + text.trim() + "'");
        // toUpperCase() mengubah semua huruf menjadi kapital
        System.out.println("Uppercase: '" + text.toUpperCase() + "'");
        // toLowerCase() mengubah semua huruf menjadi huruf kecil
        System.out.println("Lowercase: '" + text.toLowerCase() + "'");
        
        // Menampilkan bagian substring dan indexing
        System.out.println("\n=== SUBSTRING & INDEXING ===");
        // Pada bagian ini menggunakan indexing untuk mengambil karakter atau bagian tertentu dari sebuah teks dan harus di ingat indeks dalam Java dimulai dari angka 0.
        // charAt(5) mengambil karakter pada indeks ke-5
        System.out.println("Character at index 5: '" + text.charAt(5) + "'");
        // substring(7,12) mengambil karakter dari indeks 7 sampai sebelum 12
        System.out.println("Substring (7-12): '" + text.substring(7, 12) + "'");
        // indexOf() mencari posisi pertama kata World
        System.out.println("Index of 'World': " + text.indexOf("World"));
        // lastIndexOf() mencari posisi terakhir huruf a
        System.out.println("Last index of 'a': " + text.lastIndexOf("a"));
        
        // Menampilkan bagian replacement dan comparison
        System.out.println("\n=== REPLACEMENT & COMPARISON ===");
        // replace() digunakan untuk mengganti kata Java menjadi Python
        System.out.println("Replace 'Java' with 'Python': '" + text.replace("Java", "Python") + "'");
        // contains() digunakan untuk memeriksa apakah teks mengandung kata Programming
        System.out.println("Contains 'Programming': " + text.contains("Programming"));

        // startsWith() memeriksa apakah teks diawali kata tertentu,
        // Pada kode memeriksa apakah teks diawali kata Hello
        System.out.println("Starts with 'Hello': " + text.startsWith("Hello")); // Hasil false karena terdapat spasi di awal teks
        // endsWith() memeriksa apakah teks diakhiri kata Programming
        // Hasil false karena terdapat spasi di akhir teks
        System.out.println("Ends with 'Programming': " + text.endsWith("Programming"));
        // Menampilkan bagian split dan join
        
        // Pada bagian ini menggunakan split untuk memisahkan kalimat menjadi beberapa kata berdasarkan spasi
        System.out.println("\n=== SPLIT & JOIN ===");
        // trim() menghapus spasi di awal dan akhir
        // split(" ") memisahkan kalimat menjadi beberapa kata berdasarkan spasi
        String[] words = text.trim().split(" ");
        // length digunakan untuk menghitung jumlah kata dalam array
        System.out.println("Number of words: " + words.length);
        // Menampilkan setiap kata yang sudah dipisahkan
        System.out.print("Words: ");
        // Perulangan mengambil setiap kata dari array words
        
        // Menjalankan proses sesuai kondisi atau perulangan
        for (String word : words) {
            // Menampilkan setiap kata dengan tanda kurung siku
            System.out.print("[" + word + "] ");
        }
        // Pindah ke baris berikutnya
        System.out.println();
        
        // Menampilkan bagian StringBuilder
        System.out.println("\n=== STRING BUILDER ===");
        // Membuat objek StringBuilder untuk mengolah teks
        StringBuilder sb = new StringBuilder();

        // append() menambahkan kata Java ke StringBuilder
        sb.append("Java");
        // append() menambahkan kata Programming setelah Java
        sb.append(" Programming");
        // insert() menyisipkan kata Learn di indeks ke-0
        sb.insert(0, "Learn ");
        // reverse() membalik urutan seluruh karakter
        sb.reverse();

        // toString() mengubah objek StringBuilder menjadi String
        // Hasilnya ditampilkan ke layar
        System.out.println("Reversed: " + sb.toString());
    }
}

/*
JAWABAN PERTANYAAN MODUL:

1. Mengapa startsWith("Hello") mengembalikan false?
Pada teks di kode ini, hasilnya sebenarnya TRUE karena teks langsung dimulai dengan "Hello".
Hasil akan FALSE jika ada spasi atau karakter lain sebelum kata "Hello".

2. Apa perbedaan String dan StringBuilder?
String tidak dapat diubah setelah dibuat (immutable), sedangkan StringBuilder dapat diubah,
ditambah, atau dibalik tanpa membuat objek String baru.

3. Bagaimana cara mengambil hanya kata "Java" dari string tersebut?
Gunakan indexOf() untuk mencari posisi kata Java, lalu substring() untuk mengambilnya.
Contoh:
// Menyimpan nilai atau hasil proses ke dalam variabel
int awal = text.indexOf("Java");
// Menyimpan nilai atau hasil proses ke dalam variabel
String hasil = text.substring(awal, awal + 4);
// Menampilkan informasi atau hasil ke layar
System.out.println(hasil);
*/
