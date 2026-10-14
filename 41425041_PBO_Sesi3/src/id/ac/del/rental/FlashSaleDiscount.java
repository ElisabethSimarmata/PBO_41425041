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

// Diskon untuk promo flash sale
public class FlashSaleDiscount implements Discountable {

    @Override
    public double calculateDiscount(double amount) {

        // Flash sale mendapatkan diskon 20%
        return amount * 0.20;
    }
}