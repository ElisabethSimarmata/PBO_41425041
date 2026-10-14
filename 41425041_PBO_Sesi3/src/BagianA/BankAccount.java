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

public class BankAccount{
    
    // Menyimpan nomor akun dan saldo
    private String accountNumber;
    private double balance;

    // Membuat akun dengan nomor dan saldo awal
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;

        // Saldo awal tidak boleh negatif
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Saldo awal tidak boleh negatif! Diatur ke 0.");
            this.balance = 0;
        }
    }
    
    // Mengambil nomor akun
    public String getAccountNumber() {
        return accountNumber;
    }
    
    // Mengambil saldo akun
    public double getBalance() {
        return balance;
    }
    
    // Menambahkan uang ke saldo
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Setor berhasil: Rp" + amount);
        } else {
            System.out.println("Jumlah setoran harus lebih besar dari 0!");
        }
    }

    // Mengurangi saldo untuk penarikan
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Jumlah penarikan tidak valid!");
        // Penarikan tidak boleh melebihi saldo
        } else if (amount > this.balance) {
            System.out.println("Penarikan gagal: Saldo tidak mencukupi!");
        // Jika valid, saldo dikurangi
        } else {
            this.balance -= amount;
            System.out.println("Tarik tunai berhasil: Rp" + amount);
        }
    }
    
    // Menjalankan contoh penggunaan BankAccount
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-001", 500000); // Membuat akun dengan saldo awal Rp500.000

        acc.deposit(-100000); // Mencoba setoran dengan nilai negatif
        acc.withdraw(700000); // Mencoba menarik uang melebihi saldo
        acc.withdraw(200000); // Menarik uang sebesar Rp200.000

        // Menampilkan saldo akhir akun
        System.out.println("Saldo akhir akun " + acc.getAccountNumber() + ": Rp" + acc.getBalance());
    }
}


