/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SebelumModif;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

// Text Processing merupakan proses mengolah isi file teks dan menghitung statistiknya.
import java.io.*;
import java.util.*;

public class TextProcessor {
    public static void main(String[] args) {
        // Menyimpan nilai atau hasil proses ke dalam variabel
        String sourceFile = "source.txt";        // file sumber
        // Menyimpan nilai atau hasil proses ke dalam variabel
        String processedFile = "processed.txt";  // hasil uppercase
        // Menyimpan nilai atau hasil proses ke dalam variabel
        String reportFile = "report.txt";        // laporan statistik

        // Buat file sumber contoh
        createSampleFile(sourceFile);

        // Process file: uppercase + statistics
        processTextFile(sourceFile, processedFile, reportFile);

        // Tampilkan report
        displayReport(reportFile);
    }

    // Membuat file contoh yang berisi 5 kalimat
    public static void createSampleFile(String filename) {
        // Menyimpan nilai atau hasil proses ke dalam variabel
        String[] sampleText = {
            "Java programming is fun and powerful.",
            "Streams and Files are important concepts.",
            "Exception handling makes code robust.",
            "String manipulation is frequently used.",
            "Practice makes perfect in programming."
        };

        // Menjalankan proses sesuai kondisi atau perulangan
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // Menjalankan proses sesuai kondisi atau perulangan
            for (String line : sampleText) {   // tulis tiap kalimat sebagai satu baris
                // Menjalankan perintah pada baris ini
                writer.write(line);
                // Menjalankan perintah pada baris ini
                writer.newLine();
            }
            // Menampilkan informasi atau hasil ke layar
            System.out.println("Sample file created: " + filename);
        } catch (IOException e) {
            // Menampilkan informasi atau hasil ke layar
            System.out.println("Error creating sample file: " + e.getMessage());
        }
    }

    // Membaca file sumber, menulis versi uppercase, dan membuat laporan statistik
    public static void processTextFile(String inputFile, String outputFile, String reportFile) {
        // Menjalankan proses sesuai kondisi atau perulangan
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             // Menyimpan nilai atau hasil proses ke dalam variabel
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
             // Menyimpan nilai atau hasil proses ke dalam variabel
             BufferedWriter reportWriter = new BufferedWriter(new FileWriter(reportFile))) {

            // Menjalankan perintah pada baris ini
            String line;
            // Menyimpan nilai atau hasil proses ke dalam variabel
            int totalLines = 0;    // jumlah baris
            // Menyimpan nilai atau hasil proses ke dalam variabel
            int totalWords = 0;    // jumlah kata
            // Menyimpan nilai atau hasil proses ke dalam variabel
            int totalChars = 0;    // jumlah karakter
            // Menyimpan nilai atau hasil proses ke dalam variabel
            Map<Character, Integer> charFrequency = new HashMap<>();  // huruf -> berapa kali muncul

            // Menjalankan proses sesuai kondisi atau perulangan
            while ((line = reader.readLine()) != null) {
                // Menjalankan perintah pada baris ini
                totalLines++;

                // Process line: convert to uppercase
                String processedLine = line.toUpperCase();
                // Menjalankan perintah pada baris ini
                writer.write(processedLine);
                // Menjalankan perintah pada baris ini
                writer.newLine();

                // Calculate statistics
                String[] words = line.split("\\s+");   // pecah berdasarkan 1 atau lebih spasi
                // Menyimpan nilai atau hasil proses ke dalam variabel
                totalWords += words.length;
                // Menyimpan nilai atau hasil proses ke dalam variabel
                totalChars += line.length();

                // Character frequency
                for (char c : line.toLowerCase().toCharArray()) {
                    // Menjalankan proses sesuai kondisi atau perulangan
                    if (Character.isLetter(c)) {   // hanya hitung huruf
                        // Menjalankan perintah pada baris ini
                        charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
                    }
                }
            }

            // Write report
            reportWriter.write("=== TEXT PROCESSING REPORT ===");
            // Menjalankan perintah pada baris ini
            reportWriter.newLine();
            // Menjalankan perintah pada baris ini
            reportWriter.write("Total Lines: " + totalLines);
            // Menjalankan perintah pada baris ini
            reportWriter.newLine();
            // Menjalankan perintah pada baris ini
            reportWriter.write("Total Words: " + totalWords);
            // Menjalankan perintah pada baris ini
            reportWriter.newLine();
            // Menjalankan perintah pada baris ini
            reportWriter.write("Total Characters: " + totalChars);
            // Menjalankan perintah pada baris ini
            reportWriter.newLine();
            // Menjalankan perintah pada baris ini
            reportWriter.write("Average Words per Line: " + (double) totalWords / totalLines);
            // Menjalankan perintah pada baris ini
            reportWriter.newLine();
            // Menjalankan perintah pada baris ini
            reportWriter.newLine();
            // Menjalankan perintah pada baris ini
            reportWriter.write("CHARACTER FREQUENCY:");
            // Menjalankan perintah pada baris ini
            reportWriter.newLine();

            // Sort characters by frequency (terbanyak ke tersedikit)
            List<Map.Entry<Character, Integer>> sortedChars = new ArrayList<>(charFrequency.entrySet());
            // Menjalankan perintah pada baris ini
            sortedChars.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            // Menjalankan proses sesuai kondisi atau perulangan
            for (Map.Entry<Character, Integer> entry : sortedChars) {
                // Menjalankan perintah pada baris ini
                reportWriter.write(entry.getKey() + ": " + entry.getValue());
                // Menjalankan perintah pada baris ini
                reportWriter.newLine();
            }

            // Menampilkan informasi atau hasil ke layar
            System.out.println("File processing completed!");
            // Menampilkan informasi atau hasil ke layar
            System.out.println("  - Input: " + inputFile);
            // Menampilkan informasi atau hasil ke layar
            System.out.println("  - Output: " + outputFile);
            // Menampilkan informasi atau hasil ke layar
            System.out.println("  - Report: " + reportFile);

        } catch (IOException e) {
            // Menampilkan informasi atau hasil ke layar
            System.out.println("Error processing files: " + e.getMessage());
        }
    }

    // Menampilkan isi file report ke layar
    public static void displayReport(String reportFile) {
        // Menyimpan nilai atau hasil proses ke dalam variabel
        System.out.println("\n=== PROCESSING REPORT ===");
        // Menjalankan proses sesuai kondisi atau perulangan
        try (BufferedReader reader = new BufferedReader(new FileReader(reportFile))) {
            // Menjalankan perintah pada baris ini
            String line;
            // Menjalankan proses sesuai kondisi atau perulangan
            while ((line = reader.readLine()) != null) {
                // Menampilkan informasi atau hasil ke layar
                System.out.println(line);
            }
        } catch (IOException e) {
            // Menampilkan informasi atau hasil ke layar
            System.out.println("Error reading report: " + e.getMessage());
        }
    }
}

/*
JAWABAN PERTANYAAN MODUL:

1. Bagaimana cara kerja HashMap untuk menghitung frekuensi karakter?
HashMap menyimpan karakter sebagai key dan jumlah kemunculannya sebagai value. Jika karakter yang sama ditemukan lagi, nilai jumlahnya ditambah satu.

2. Mengapa menggunakan \\s+ untuk split words daripada spasi biasa?
Karena \\s+ memisahkan teks berdasarkan satu atau lebih whitespace, seperti spasi dan tab.

3. Apa keuntungan BufferedReader/BufferedWriter?
Keduanya memudahkan proses membaca dan menulis file serta lebih efisien untuk pemrosesan teks.
*/
