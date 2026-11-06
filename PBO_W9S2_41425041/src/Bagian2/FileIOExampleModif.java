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

import java.util.*; // Mengimpor library Java untuk menggunakan fungsi tambahan
import java.io.*; // Mengimpor library untuk membaca dan menulis file

public class FileIOExampleModif {

    // Method utama yang pertama kali dijalankan
    public static void main(String[] args) {

        // Menyimpan nama file yang digunakan untuk membaca dan menulis data
        String inputFile = "data.txt";
        // Menyimpan nama file untuk hasil pemrosesan data
        String outputFile = "output.txt";

        // Memanggil method untuk menulis data ke file
        writeToFile(inputFile);

        // Memanggil method untuk membaca isi file
        readFromFile(inputFile);

        // Memanggil method untuk memproses data dan menyimpan hasilnya
        processFile(inputFile, outputFile);

        // Memanggil method untuk menambahkan data baru ke file
        appendToFile(inputFile);
    }

    // Method untuk menulis data ke dalam file
    public static void writeToFile(String filename) {

        // Membuat BufferedWriter untuk menulis data ke file
        // FileWriter digunakan untuk membuat atau mengganti isi file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            // Menulis data Alice ke dalam file
            writer.write("Alice,25,Computer Science");
            // Membuat baris baru setelah data Alice
            writer.newLine();
            // Menulis data Bob ke dalam file
            writer.write("Bob,30,Mathematics");
            // Membuat baris baru setelah data Bob
            writer.newLine();
            // Menulis data Charlie ke dalam file
            writer.write("Charlie,22,Physics");
            // Membuat baris baru setelah data Charlie
            writer.newLine();
            // Menulis data Diana ke dalam file
            writer.write("Diana,28,Chemistry");
            // Membuat baris baru setelah data Diana
            writer.newLine();

            // Menampilkan pesan jika data berhasil ditulis
            System.out.println("Data berhasil ditulis ke " + filename);

        // Menangani kesalahan yang terjadi saat menulis file
        } catch (IOException e) {

            // Menampilkan pesan kesalahan
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // Method untuk membaca isi file
    public static void readFromFile(String filename) {

        // Menampilkan judul bagian membaca file
        System.out.println("\n=== MEMBACA FILE ===");

        // Membuat BufferedReader untuk membaca isi file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            // Membuat variabel line untuk menyimpan isi setiap baris
            String line;

            // Menentukan nomor awal baris yaitu 1
            int lineNumber = 1;

            // Membaca file selama masih ada baris yang dapat dibaca
            while ((line = reader.readLine()) != null) {

                // Menampilkan nomor baris dan isi datanya
                System.out.println("Line " + lineNumber + ": " + line);

                // Menambah nomor baris sebanyak 1
                lineNumber++;
            }

            // Menampilkan pesan jika file berhasil dibaca
            System.out.println("File berhasil dibaca");

        // Menangani kesalahan jika file tidak ditemukan
        } catch (FileNotFoundException e) {

            // Menampilkan pesan bahwa file tidak ditemukan
            System.out.println("File tidak ditemukan: " + e.getMessage());

        // Menangani kesalahan saat membaca file
        } catch (IOException e) {

            // Menampilkan pesan kesalahan saat membaca file
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Method untuk memproses data dan menghitung rata-rata umur
    public static void processFile(String inputFile, String outputFile) {

        // Menampilkan judul bagian memproses file
        System.out.println("\n=== MEMPROSES FILE ===");

        // Menyimpan jumlah seluruh umur
        int totalUmur = 0;

        // Menghitung banyaknya data yang berhasil diproses
        int jumlahData = 0;

        // Membaca file input dan membuat file output untuk menyimpan hasil
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            // Membuat variabel untuk menyimpan setiap baris data
            String line;

            // Menulis judul kolom ke file output
            writer.write("NAME,AGE,MAJOR,STATUS");

            // Membuat baris baru setelah judul kolom
            writer.newLine();

            // Membaca data satu per satu sampai file selesai
            while ((line = reader.readLine()) != null) {

                // Memisahkan data berdasarkan tanda koma
                String[] data = line.split(",");

                // Menjalankan proses pengolahan data
                try {

                    // Mengambil nama dan mengubahnya menjadi huruf kapital
                    String nama = data[0].toUpperCase();

                    // Mengambil umur dan mengubahnya menjadi tipe data integer
                    int umur = Integer.parseInt(data[1]);

                    // Mengambil data jurusan
                    String jurusan = data[2];

                    // Menentukan status berdasarkan umur
                    // Jika umur lebih dari 25 maka GRADUATE
                    // Jika tidak maka UNDERGRADUATE
                    String status = (umur > 25)
                            ? "GRADUATE" : "UNDERGRADUATE";

                    // Menambahkan umur ke total seluruh umur
                    totalUmur += umur;

                    // Menambah jumlah data yang berhasil diproses
                    jumlahData++;

                    // Menggabungkan data menjadi satu baris dengan format tertentu
                    String processedLine = String.format(
                            "%s,%d,%s,%s",
                            nama, umur, jurusan, status
                    );

                    // Menulis hasil pengolahan ke file output
                    writer.write(processedLine);

                    // Membuat baris baru setelah hasil ditulis
                    writer.newLine();

                    // Menampilkan hasil pengolahan data ke layar
                    System.out.println("Processed: " + processedLine);

                // MODIFIKASI 1: Menangani kesalahan jika umur bukan angka
                } catch (NumberFormatException e) {

                    // Menampilkan pesan jika umur tidak dapat diubah menjadi angka
                    System.out.println("Umur harus berupa angka: " + line);

                // Menangani kesalahan jika jumlah data tidak sesuai
                } catch (ArrayIndexOutOfBoundsException e) {

                    // Menampilkan pesan jika format data salah
                    System.out.println("Format data salah: " + line);
                }
            }

            // Menampilkan pesan jika file berhasil diproses
            System.out.println("File berhasil diproses dan disimpan sebagai " + outputFile);

            // MODIFIKASI 2: Menghitung rata-rata umur

            // Memeriksa apakah jumlah data lebih dari 0
            if (jumlahData > 0) {

                // Menghitung rata-rata umur dari seluruh data
                // Casting double digunakan agar hasil pembagian memiliki nilai desimal
                double rataRata = (double) totalUmur / jumlahData;

                // Menampilkan hasil rata-rata umur
                System.out.println("Rata-rata umur: " + rataRata);
            }

        // Menangani kesalahan saat membaca atau menulis file
        } catch (IOException e) {

            // Menampilkan pesan kesalahan saat memproses file
            System.out.println("Error processing file: " + e.getMessage());
        }
    }

    // MODIFIKASI 3: Menambahkan data tanpa menghapus data lama
    public static void appendToFile(String filename) {

        // Membuka file dengan mode append (true) agar data lama tidak terhapus
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {

            // Menambahkan data Elisabeth ke dalam file
            writer.write("Elisabeth,20,Software Engineering");

            // Membuat baris baru setelah data ditambahkan
            writer.newLine();

            // Menampilkan pesan jika data baru berhasil ditambahkan
            System.out.println("Data baru berhasil ditambahkan ke " + filename);

        // Menangani kesalahan saat menambahkan data ke file
        } catch (IOException e) {

            // Menampilkan pesan kesalahan
            System.out.println("Error appending file: " + e.getMessage());
        }
    }
}


/*
JAWABAN PERTANYAAN:

1. Apa keuntungan menggunakan try-with-resources?
File akan tertutup secara otomatis setelah selesai digunakan, sehingga lebih praktis dan aman.

2. Mengapa perlu menangani FileNotFoundException dan IOException secara terpisah?
Agar jenis kesalahan lebih mudah diketahui. FileNotFoundException berarti file tidak ditemukan, sedangkan IOException berarti terjadi kesalahan saat membaca atau menulis file.

3. Apa yang terjadi jika file data.txt sudah ada sebelum program dijalankan?
Isi file lama akan diganti dengan data baru karena FileWriter digunakan tanpa mode append (true).
*/
