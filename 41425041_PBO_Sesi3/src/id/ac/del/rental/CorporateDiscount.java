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

// Diskon khusus pelanggan corporate
public class CorporateDiscount implements Discountable {

    @Override
    public double calculateDiscount(double amount) {

        // Corporate mendapatkan diskon 30%
        return amount * 0.30;
    }
}
