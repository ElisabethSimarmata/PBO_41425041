/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SesudahModif;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

import java.io.*;
import java.util.*;

public class TextProcessor{
    public static void main(String[] args) {
        // Menyimpan nilai atau hasil proses ke dalam variabel
        String sourceFile = "source_mod.txt";
        // Menyimpan nilai atau hasil proses ke dalam variabel
        String processedFile = "processed_mod.txt";
        // Menyimpan nilai atau hasil proses ke dalam variabel
        String reportFile = "report_mod.txt";

        // Menjalankan perintah pada baris ini
        createSampleFile(sourceFile);
        // Menjalankan perintah pada baris ini
        processTextFile(sourceFile, processedFile, reportFile);
        // Menjalankan perintah pada baris ini
        displayReport(reportFile);
    }

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
            for (String line : sampleText) {
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
            int totalLines = 0;
            // Menyimpan nilai atau hasil proses ke dalam variabel
            int totalWords = 0;
            // Menyimpan nilai atau hasil proses ke dalam variabel
            int totalChars = 0;
            // Menyimpan nilai atau hasil proses ke dalam variabel
            int totalSentences = 0;   // MODIFIKASI 1: penghitung kalimat
            // Menyimpan nilai atau hasil proses ke dalam variabel
            Map<Character, Integer> charFrequency = new HashMap<>();
            // Menyimpan nilai atau hasil proses ke dalam variabel
            Map<String, Integer> wordFrequency = new HashMap<>();   // MODIFIKASI 2: kata -> jumlah muncul

            // Menjalankan proses sesuai kondisi atau perulangan
            while ((line = reader.readLine()) != null) {
                // Menjalankan perintah pada baris ini
                totalLines++;

                // Menjalankan perintah pada baris ini
                writer.write(line.toUpperCase());
                // Menjalankan perintah pada baris ini
                writer.newLine();

                // Menyimpan nilai atau hasil proses ke dalam variabel
                String[] words = line.split("\\s+");
                // Menyimpan nilai atau hasil proses ke dalam variabel
                totalWords += words.length;
                // Menyimpan nilai atau hasil proses ke dalam variabel
                totalChars += line.length();

                // ===== MODIFIKASI 1: hitung kalimat =====
                // setiap tanda titik '.' dianggap sebagai akhir 1 kalimat
                for (char c : line.toCharArray()) {
                    // Menjalankan proses sesuai kondisi atau perulangan
                    if (c == '.') {
                        // Menjalankan perintah pada baris ini
                        totalSentences++;
                    }
                }

                // ===== MODIFIKASI 2: hitung frekuensi kata =====
                for (String word : words) {
                    // huruf kecil semua + buang tanda baca supaya "Programming." sama dengan "programming"
                    String clean = word.toLowerCase().replaceAll("[^a-z]", "");
                    // Menjalankan proses sesuai kondisi atau perulangan
                    if (!clean.isEmpty()) {
                        // Menjalankan perintah pada baris ini
                        wordFrequency.put(clean, wordFrequency.getOrDefault(clean, 0) + 1);
                    }
                }

                // Menjalankan proses sesuai kondisi atau perulangan
                for (char c : line.toLowerCase().toCharArray()) {
                    // Menjalankan proses sesuai kondisi atau perulangan
                    if (Character.isLetter(c)) {
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
            reportWriter.write("Total Sentences: " + totalSentences);   // hasil modifikasi 1
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

            // ===== MODIFIKASI 2: tulis kata paling sering muncul =====
            // cari nilai frekuensi tertinggi dulu
            int maxCount = 0;
            // Menjalankan proses sesuai kondisi atau perulangan
            for (int count : wordFrequency.values()) {
                // Menjalankan proses sesuai kondisi atau perulangan
                if (count > maxCount) {
                    // Menyimpan nilai atau hasil proses ke dalam variabel
                    maxCount = count;
                }
            }
            // kumpulkan semua kata yang frekuensinya sama dengan maksimum (bisa lebih dari satu)
            List<String> topWords = new ArrayList<>();
            // Menjalankan proses sesuai kondisi atau perulangan
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                // Menjalankan proses sesuai kondisi atau perulangan
                if (entry.getValue() == maxCount) {
                    // Menjalankan perintah pada baris ini
                    topWords.add(entry.getKey());
                }
            }
            Collections.sort(topWords);   // urutkan abjad supaya hasil selalu sama
            // Menjalankan perintah pada baris ini
            reportWriter.write("MOST FREQUENT WORD(S): " + topWords + " (muncul " + maxCount + " kali)");
            // Menjalankan perintah pada baris ini
            reportWriter.newLine();
            // Menjalankan perintah pada baris ini
            reportWriter.newLine();

            // Menjalankan perintah pada baris ini
            reportWriter.write("CHARACTER FREQUENCY:");
            // Menjalankan perintah pada baris ini
            reportWriter.newLine();

            // Menyimpan nilai atau hasil proses ke dalam variabel
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
Jawaban Pertanyaan
1. Bagaimana cara kerja HashMap untuk menghitung frekuensi karakter?
HashMap menyimpan karakter sebagai key dan jumlah kemunculannya sebagai value. Jika karakter yang sama ditemukan lagi, jumlahnya akan bertambah.

2. Mengapa kita menggunakan \\s+ untuk split words daripada spasi biasa?
Karena \\s+ dapat memisahkan kata berdasarkan satu atau lebih spasi, tab, dan karakter whitespace lainnya.

3. Apa keuntungan menggunakan BufferedReader/BufferedWriter?
Memudahkan proses membaca dan menulis file serta membuat pengolahan file lebih efisien.
*/

/*
JAWABAN PERTANYAAN MODUL:

1. Bagaimana cara kerja HashMap untuk menghitung frekuensi karakter?
HashMap menyimpan karakter sebagai key dan jumlah kemunculannya sebagai value.
Jika karakter yang sama ditemukan lagi, nilai jumlahnya ditambah satu.

2. Mengapa menggunakan \\s+ untuk split words daripada spasi biasa?
Karena \\s+ memisahkan teks berdasarkan satu atau lebih whitespace, seperti spasi dan tab.

3. Apa keuntungan BufferedReader/BufferedWriter?
Keduanya memudahkan proses membaca dan menulis file serta lebih efisien untuk pemrosesan teks.
*/

