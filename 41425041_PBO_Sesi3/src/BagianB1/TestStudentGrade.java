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

public class TestStudentGrade {
    public static void main(String[] args) {
        StudentGrade student = new StudentGrade("41425041", "Elisabeth"); // Membuat objek mahasiswa
        student.setNilaiKuis(85);   // Mengisi nilai kuis
        student.setNilaiUTS(90);    // Mengisi nilai UTS
        student.cetakLaporan();     // Menampilkan laporan hasil studi
        student.setNilaiKuis(110);  // Menguji validasi nilai kuis yang melebihi 100
    }
}
