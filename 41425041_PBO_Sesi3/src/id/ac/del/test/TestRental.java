/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

import id.ac.del.rental.VehicleRental;
import id.ac.del.rental.Discountable;
import id.ac.del.rental.MemberDiscount;
import id.ac.del.rental.FlashSaleDiscount;
import id.ac.del.rental.CorporateDiscount;

public class TestRental {

    public static void main(String[] args) {

        // Membuat objek kendaraan
        VehicleRental v =
                new VehicleRental("BK 1234 DEL", 250000);

        // Set hari sewa
        v.setRentalDays(3);

        // Menggunakan Member Discount
        Discountable memberDiscount =
                new MemberDiscount();

        double totalMember =
                v.getTotalCost(memberDiscount);

        System.out.println("===== MEMBER =====");
        System.out.println("Plat Nomor : "
                + v.getPlateNumber());
        System.out.println("Total Biaya: Rp"
                + totalMember);


        // Menggunakan Flash Sale Discount
        Discountable flashSaleDiscount =
                new FlashSaleDiscount();

        double totalFlashSale =
                v.getTotalCost(flashSaleDiscount);

        System.out.println();
        System.out.println("===== FLASH SALE =====");
        System.out.println("Total Biaya: Rp"
                + totalFlashSale);


        // Menggunakan Corporate Discount
        Discountable corporateDiscount =
                new CorporateDiscount();

        double totalCorporate =
                v.getTotalCost(corporateDiscount);

        System.out.println();
        System.out.println("===== CORPORATE =====");
        System.out.println("Total Biaya: Rp"
                + totalCorporate);
    }

/*

1) Analisis Kompilasi dan Hak Akses (Access Modifiers)
    Baris B dan C menyebabkan compile-time error.
    -  Baris A tidak error karena plateNumber memiliki hak akses public, sehingga dapat diakses dari class yang berada di package lain.
    -  Baris B error karena rentalRatePerDay memiliki hak akses protected. TestRental berada di package yang berbeda dan bukan subclass
    dari VehicleRental, sehingga tidak dapat mengaksesnya secara langsung.
    -  Baris C error karena discountRate memiliki hak akses default (package-private). Atribut dengan hak akses default hanya dapat
    diakses oleh class yang berada dalam package yang sama.
    -  Baris D tidak error karena setRentalDays() memiliki hak akses public. Namun, terdapat kesalahan logika karena nilai -7 tetap diterima
    dan disimpan tanpa adanya validasi.

2) Kelemahan Integritas Data (Data Hiding & Validation)
i) Method setRentalDays() pada kode awal tidak melakukan validasi. Nilai negatif seperti -7 langsung disimpan ke dalam rentalDays. 
   Seharusnya jumlah hari sewa harus lebih dari 0 agar data yang disimpan tetap valid.
ii) Total biaya dapat bernilai negatif karena nilai rentalDays dan rentalRatePerDay pada kode awal dapat berisi nilai yang tidak valid.
    Contohnya, rentalDays dapat berisi -7 sehingga hasil perkalian rentalRatePerDay * rentalDays menjadi negatif.
    Untuk mencegah data corruption, atribut penting sebaiknya dibuat private dan perubahan nilainya dilakukan melalui method yang memiliki validasi.
    Contohnya:
    - rentalRatePerDay harus lebih dari 0
    - rentalDays harus lebih dari 0
    - discountRate harus berada antara 0 sampai 1
    Dengan begitu, data tidak dapat diubah sembarangan dari luar class dan hasil perhitungan total biaya tetap valid.

3) Penerapan Interface (Dependency Injection)
i) Interface Discountable digunakan sebagai kontrak untuk berbagai jenis diskon. Interface tersebut memiliki method: calculateDiscount(double amount)
ii) Method getTotalCost() diubah agar menerima parameter bertipe Discountable. Dengan demikian, objek MemberDiscount, FlashSaleDiscount, atau CorporateDiscount dapat dikirimkan
    saat runtime. VehicleRental tidak perlu mengetahui jenis diskon yang digunakan. Perhitungan diskon dilakukan melalui method calculateDiscount() dari objek yang dikirimkan.
    Hal ini menerapkan konsep polymorphism dan dependency injection.
*/
}