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

public class StringManipulationModif {
    public static void main(String[] args) {

        // Menyimpan kalimat ke dalam variabel text
        String text = "Hello World! Welcome to Java Programming";
        
        // Menampilkan judul operasi dasar String
        System.out.println("=== BASIC STRING OPERATIONS ===");
        // Menampilkan teks asli
        System.out.println("Original: '" + text + "'");
        // length() menghitung jumlah karakter
        System.out.println("Length: " + text.length());
        // trim() menghapus spasi di awal dan akhir teks
        System.out.println("Trimmed: '" + text.trim() + "'");
        // toUpperCase() mengubah semua huruf menjadi kapital
        System.out.println("Uppercase: '" + text.toUpperCase() + "'");
        // toLowerCase() mengubah semua huruf menjadi kecil
        System.out.println("Lowercase: '" + text.toLowerCase() + "'");
        
        // Menampilkan bagian substring dan indexing
        System.out.println("\n=== SUBSTRING & INDEXING ===");
        // charAt(5) mengambil karakter pada indeks ke-5
        System.out.println("Character at index 5: '" + text.charAt(5) + "'");
        // substring(7,12) mengambil karakter indeks 7 sampai sebelum 12
        System.out.println("Substring (7-12): '" + text.substring(7, 12) + "'");
        // indexOf() mencari posisi pertama kata World
        System.out.println("Index of World: " + text.indexOf("World"));
        // lastIndexOf() mencari posisi terakhir huruf a
        System.out.println("Last index of a: " + text.lastIndexOf("a"));
        
        // Menampilkan bagian penggantian dan perbandingan teks
        System.out.println("\n=== REPLACEMENT & COMPARISON ===");
        // replace() mengganti kata Java menjadi Python
        System.out.println("Replace: " + text.replace("Java", "Python"));
        // contains() memeriksa apakah teks mengandung Programming
        System.out.println("Contains Programming: " + text.contains("Programming"));
        // trim() menghapus spasi, lalu startsWith() memeriksa awal teks
        System.out.println("Starts with Hello: " + text.trim().startsWith("Hello"));
        // trim() menghapus spasi, lalu endsWith() memeriksa akhir teks
        System.out.println("Ends with Programming: " + text.trim().endsWith("Programming"));
        
        // SPLIT & JOIN
        System.out.println("\n=== SPLIT & JOIN ===");
        // trim() menghapus spasi awal dan akhir
        // split("\\s+") memisahkan kalimat berdasarkan satu atau lebih spasi
        String[] words = text.trim().split("\\s+");
        // Menghitung jumlah kata dalam array words
        System.out.println("Number of words: " + words.length);
        // Menampilkan setiap kata yang sudah dipisahkan
        System.out.print("Words: ");

        // Perulangan mengambil kata satu per satu dari array words
        for (String word : words) {

            // Menampilkan setiap kata dengan tanda kurung siku
            System.out.print("[" + word + "] ");
        }
        // String.join() menggabungkan kembali kata dengan pemisah spasi
        String joined = String.join(" ", words);
        // Menampilkan hasil gabungan kata
        System.out.println("\nJoined: " + joined);
        
        // MODIFIKASI 1: Menampilkan kata yang panjangnya lebih dari 4 karakter
        System.out.println("\n=== WORDS MORE THAN 4 CHARACTERS ===");

        // Mengambil kata satu per satu dari array words
        for (String word : words) {

            // length() menghitung panjang kata
            // if memeriksa apakah panjang kata lebih dari 4 karakter
            if (word.length() > 4) {

                // Menampilkan kata yang memenuhi kondisi
                System.out.println(word);
            }
        }

        // MODIFIKASI 2: Menghitung jumlah huruf vokal
        System.out.println("\n=== VOWEL COUNT ===");
        // Memanggil method hitungVokal() dengan mengirim variabel text
        // Hasil perhitungan ditampilkan ke layar
        System.out.println("Jumlah huruf vokal: " + hitungVokal(text));

        // STRING BUILDER
        System.out.println("\n=== STRING BUILDER ===");
        // Membuat objek StringBuilder untuk mengolah teks
        StringBuilder sb = new StringBuilder();
        // append() menambahkan kata Java
        sb.append("Java");
        // append() menambahkan kata Programming
        sb.append(" Programming");
        // insert() menyisipkan kata Learn pada indeks ke-0
        sb.insert(0, "Learn ");
        // reverse() membalik urutan seluruh karakter
        sb.reverse();
        // Menampilkan hasil teks yang sudah dibalik
        System.out.println("Reversed: " + sb);
    }

    // Method untuk menghitung jumlah huruf vokal
    // Method ini dipanggil dari main() melalui hitungVokal(text)
    public static int hitungVokal(String text) {

        // Variabel jumlah digunakan untuk menyimpan banyak huruf vokal
        int jumlah = 0;

        // Perulangan memeriksa setiap karakter dalam teks
        for (int i = 0; i < text.length(); i++) {

            // charAt() mengambil karakter dan toLowerCase() mengubahnya menjadi kecil
            char huruf = Character.toLowerCase(text.charAt(i));

            // Memeriksa apakah karakter termasuk huruf vokal
            if (huruf == 'a' || huruf == 'i' || huruf == 'u'
                    // Menyimpan nilai atau hasil proses ke dalam variabel
                    || huruf == 'e' || huruf == 'o') {

                // Menambah jumlah jika karakter merupakan huruf vokal
                jumlah++;
            }
        }

        // Mengembalikan hasil perhitungan ke pemanggil method
        return jumlah;
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