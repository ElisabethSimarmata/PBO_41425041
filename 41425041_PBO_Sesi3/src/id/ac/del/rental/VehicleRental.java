/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

public class VehicleRental {
    // Ubah semua atribut menjadi private untuk enkapsulasi data
    private String plateNumber;
    private double rentalRatePerDay;
    private int rentalDays;

    // Constructor
    public VehicleRental(String plateNumber, double rate) {
        this.plateNumber = plateNumber;
        if (rate > 0) {
            this.rentalRatePerDay = rate;
        } else {
            System.out.println("[Error] Tarif sewa per hari harus lebih besar dari 0!");
            this.rentalRatePerDay = 0;
        }
    }

    // Setter dengan validasi agar tidak menerima hari negatif
    public void setRentalDays(int days) {
        if (days > 0) {
            this.rentalDays = days;
        } else {
            System.out.println("[Error] Jumlah hari sewa tidak valid: " + days + " (Harus > 0)");
        }
    }

    // Getters
    public String getPlateNumber() { return plateNumber; }
    public double getRentalRatePerDay() { return rentalRatePerDay; }
    public int getRentalDays() { return rentalDays; }

    // Refactoring getTotalCost dengan parameter Discountable
    public double getTotalCost(Discountable discount) {
        double subtotal = rentalRatePerDay * rentalDays;
        
        // Jika ada objek diskon yang dikirim, hitung potongannya secara polimorfik
        if (discount != null) {
            double discountAmount = discount.calculateDiscount(subtotal);
            return subtotal - discountAmount;
        }
        
        return subtotal;
    }
}
