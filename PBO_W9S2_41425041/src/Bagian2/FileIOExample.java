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

// Stream I/O digunakan untuk membaca dan menulis data ke dalam file. 

import java.util.*;
import java.io.*;

public class FileIOExample {

    public static void main(String[] args) {

        // Menyimpan nilai atau hasil proses ke dalam variabel
        String inputFile = "data.txt";
        // Menyimpan nilai atau hasil proses ke dalam variabel
        String outputFile = "output.txt";

        // Tulis data ke file
        writeToFile(inputFile);

        // Baca data dari file
        readFromFile(inputFile);

        // Process dan tulis ke file baru
        processFile(inputFile, outputFile);
    }

    public static void writeToFile(String filename) {

        // Menjalankan proses sesuai kondisi atau perulangan
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(filename))) {

            // Menjalankan perintah pada baris ini
            writer.write("Alice,25,Computer Science");
            // Menjalankan perintah pada baris ini
            writer.newLine();

            // Menjalankan perintah pada baris ini
            writer.write("Bob,30,Mathematics");
            // Menjalankan perintah pada baris ini
            writer.newLine();

            // Menjalankan perintah pada baris ini
            writer.write("Charlie,22,Physics");
            // Menjalankan perintah pada baris ini
            writer.newLine();

            // Menjalankan perintah pada baris ini
            writer.write("Diana,28,Chemistry");
            // Menjalankan perintah pada baris ini
            writer.newLine();

            // Menampilkan informasi atau hasil ke layar
            System.out.println("Data berhasil ditulis ke " + filename);

        } catch (IOException e) {
            // Menampilkan informasi atau hasil ke layar
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public static void readFromFile(String filename) {

        // Menyimpan nilai atau hasil proses ke dalam variabel
        System.out.println("\n=== MEMBACA FILE ===");

        // Menjalankan proses sesuai kondisi atau perulangan
        try (BufferedReader reader = new BufferedReader(
                new FileReader(filename))) {

            // Menjalankan perintah pada baris ini
            String line;
            // Menyimpan nilai atau hasil proses ke dalam variabel
            int lineNumber = 1;

            // Menjalankan proses sesuai kondisi atau perulangan
            while ((line = reader.readLine()) != null) {
                // Menampilkan informasi atau hasil ke layar
                System.out.println("Line " + lineNumber + ": " + line);
                // Menjalankan perintah pada baris ini
                lineNumber++;
            }

            // Menampilkan informasi atau hasil ke layar
            System.out.println("File berhasil dibaca");

        } catch (FileNotFoundException e) {
            // Menampilkan informasi atau hasil ke layar
            System.out.println("File tidak ditemukan: " + e.getMessage());

        } catch (IOException e) {
            // Menampilkan informasi atau hasil ke layar
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void processFile(String inputFile, String outputFile) {

        // Menyimpan nilai atau hasil proses ke dalam variabel
        System.out.println("\n=== MEMPROSES FILE ===");

        // Menjalankan proses sesuai kondisi atau perulangan
        try (BufferedReader reader = new BufferedReader(
                // Menjalankan perintah pada baris ini
                new FileReader(inputFile));
             // Menyimpan nilai atau hasil proses ke dalam variabel
             BufferedWriter writer = new BufferedWriter(
                new FileWriter(outputFile))) {

            // Menjalankan perintah pada baris ini
            String line;

            // Menjalankan perintah pada baris ini
            writer.write("NAME,AGE,MAJOR,STATUS");
            // Menjalankan perintah pada baris ini
            writer.newLine();

            // Menjalankan proses sesuai kondisi atau perulangan
            while ((line = reader.readLine()) != null) {

                // Split data berdasarkan koma
                String[] data = line.split(",");

                // Menyimpan nilai atau hasil proses ke dalam variabel
                String name = data[0].toUpperCase();
                // Menyimpan nilai atau hasil proses ke dalam variabel
                int age = Integer.parseInt(data[1]);
                // Menyimpan nilai atau hasil proses ke dalam variabel
                String major = data[2];

                // Menyimpan nilai atau hasil proses ke dalam variabel
                String status = (age > 25)
                        // Menjalankan perintah pada baris ini
                        ? "GRADUATE" : "UNDERGRADUATE";

                // Tulis data yang telah diproses
                String processedLine = String.format(
                        // Menjalankan perintah pada baris ini
                        "%s,%d,%s,%s", name, age, major, status);

                // Menjalankan perintah pada baris ini
                writer.write(processedLine);
                // Menjalankan perintah pada baris ini
                writer.newLine();

                // Menampilkan informasi atau hasil ke layar
                System.out.println("Processed: " + processedLine);
            }

            // Menampilkan informasi atau hasil ke layar
            System.out.println("File berhasil diproses dan disimpan sebagai "
                    // Menjalankan perintah pada baris ini
                    + outputFile);

        } catch (IOException e) {
            // Menampilkan informasi atau hasil ke layar
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}

/*
JAWABAN PERTANYAAN MODUL:

1. Apa keuntungan menggunakan try-with-resources?
File akan ditutup otomatis setelah selesai digunakan, meskipun terjadi kesalahan.

2. Mengapa FileNotFoundException dan IOException ditangani terpisah?
Supaya jenis kesalahan lebih mudah diketahui. FileNotFoundException berarti file tidak ditemukan,
sedangkan IOException menangani kesalahan proses membaca atau menulis file.

3. Apa yang terjadi jika data.txt sudah ada sebelum program dijalankan?
FileWriter(filename) tanpa append akan menimpa isi file lama dengan data yang baru.
*/
