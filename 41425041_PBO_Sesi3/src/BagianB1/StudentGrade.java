/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB1;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

// Menyimpan data mahasiswa dan nilai
public class StudentGrade {
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private String gradeHuruf;

     // Membuat objek mahasiswa dengan nilai awal 0
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiKuis = 0.0;
        this.nilaiUTS = 0.0;
        updateGrade();
    }

    public String getNim() { // Mengambil NIM mahasiswa
        return nim;
    }

    public String getNama() { // Mengambil nama mahasiswa
        return nama;
    }

    public double getNilaiKuis() { // Mengambil nilai kuis
        return nilaiKuis;
    }

    public double getNilaiUTS() { // Mengambil nilai UTS
        return nilaiUTS;
    }

    public String getGradeHuruf() { // Mengambil grade huruf
        return gradeHuruf;
    }

     // Mengatur nilai kuis dengan validasi 0 sampai 100
    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;
            updateGrade();
        } else {
            System.out.println("Nilai kuis harus berada pada rentang 0 sampai 100!");
        }
    }

    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS >= 0.0 && nilaiUTS <= 100.0) {
            this.nilaiUTS = nilaiUTS;
            updateGrade();
        } else {
            System.out.println("Nilai UTS harus berada pada rentang 0 sampai 100!");
        }
    }

     // Menghitung nilai akhir dari 40% kuis dan 60% UTS
    public double hitungNilaiAkhir() {
        return (nilaiKuis * 0.40) + (nilaiUTS * 0.60);
    }

    // Memperbarui grade berdasarkan nilai akhir
    private void updateGrade() {
        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 80) {
            gradeHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            gradeHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            gradeHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            gradeHuruf = "D";
        } else {
            gradeHuruf = "E";
        }
    }

    // Menampilkan seluruh hasil studi mahasiswa
    public void cetakLaporan() {
        System.out.println("=== LAPORAN HASIL STUDI ===");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Kuis  : " + nilaiKuis);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
        System.out.println("Grade       : " + gradeHuruf);
    }
}
