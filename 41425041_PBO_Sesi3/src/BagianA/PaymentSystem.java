/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianA;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

// Interface sebagai kontrak untuk metode pembayaran
interface PaymentMethod {
    double TRANSACTION_FEE = 2500.0;  // Biaya admin setiap transaksi

    void pay(double amount); // Method untuk melakukan pembayaran

    String getPaymentDetails();  // Mengambil informasi metode pembayaran
}

// Implementasi pembayaran menggunakan E-Wallet
class EWalletPayment implements PaymentMethod {
    private String phoneNumber;

    public EWalletPayment(String phoneNumber) {  // Menyimpan nomor HP E-Wallet
        this.phoneNumber = phoneNumber;
    }

    // Memproses pembayaran dan menambahkan biaya admin
    @Override
    public void pay(double amount) {
        double total = amount + TRANSACTION_FEE;
        System.out.println("[E-Wallet " + phoneNumber + "] Pembayaran diproses: Rp" + amount
                + " (Biaya admin: Rp" + TRANSACTION_FEE + ") | Total: Rp" + total);
    }

    // Menampilkan detail metode pembayaran
    @Override
    public String getPaymentDetails() {
        return "Metode: E-Wallet (" + phoneNumber + ")";
    }
}

// Implementasi pembayaran menggunakan kartu kredit
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

     // Menyimpan nomor kartu
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Memproses pembayaran kartu kredit
    @Override
    public void pay(double amount) {
        System.out.println("[Credit Card " + cardNumber + "] Pembayaran berhasil diverifikasi sebesar: Rp" + amount);
    }

    // Menampilkan detail metode pembayaran
    @Override
    public String getPaymentDetails() {
        return "Metode: Kartu Kredit (" + cardNumber + ")";
    }
}

// Class utama untuk menjalankan program pembayaran
public class PaymentSystem {
    public static void main(String[] args) {
        PaymentMethod payment1 = new EWalletPayment("08123456789"); // Membuat objek E-Wallet melalui interface PaymentMethod
        PaymentMethod payment2 = new CreditCardPayment("4111-XXXX-XXXX-1234");  // Membuat objek kartu kredit melalui interface PaymentMethod

        payment1.pay(50000); // Melakukan pembayaran menggunakan E-Wallet
        payment2.pay(150000); // Melakukan pembayaran menggunakan kartu kredit.
    }
}
