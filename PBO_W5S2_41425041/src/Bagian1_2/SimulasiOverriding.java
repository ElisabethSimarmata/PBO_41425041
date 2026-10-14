/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian1_2;

/**
 *
 * @author ASUS
 */

/*NIM   : 41425041
NAMA    : Elisabeth Nunut Pinta Marito Simaramata
*/

class KurirReguler {
    protected String nama; // Menyimpan nama kurir

    // Constructor
    public KurirReguler(String nama) {
        this.nama = nama;
    }

    // Method untuk mengirim barang
    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat
                + " lewat jalur darat menuju kecamatan.");
    }
}

class KurirDrone extends KurirReguler {
    private String idDrone;  // Menyimpan ID drone

    // Constructor
    public KurirDrone(String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }

    // Mengubah method dari class KurirReguler
    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone " + idDrone + " operator " + nama
                + " terbang menuju paket ke koordinat: " + alamat);
    }
}

public class SimulasiOverriding {
    public static void main(String[] args) {

        System.out.println("=== INI METHOD OVERRIDING ===");
        // Membuat objek kurir reguler
        KurirReguler k1 = new KurirReguler("Budi");

        // Membuat objek kurir drone
        KurirReguler k2 = new KurirDrone("Sari", "DR-001");

        // Memanggil method kirimBarang()
        k1.kirimBarang("Jl. Sudirman No. 10");
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}

// Jawaban Lembar Analisis Overriding:

// 1. Setelah @Override dihapus dan nama method diubah menjadi kirimbarang() dengan huruf b kecil, output k2.
//    kirimBarang() berubah menjadi jalur darat. Hal ini karena kirimbarang() dianggap sebagai method yang berbeda dari kirimBarang(), sehingga tidak terjadi overriding.

// 2. Setelah @Override dikembalikan pada method yang salah ketik, muncul error: "method does not override or implement a method from a supertype" 
//    Error tersebut terjadi karena nama method kirimbarang() tidak sama dengan method pada class induknya, yaitu kirimBarang(). 

// 3. Menurut saya, @Override berfungsi untuk memastikan bahwa method pada class turunan benar-benar menggantikan method dari class induk. 
//   @Override juga membantu programmer menemukan kesalahan penulisan nama method karena akan muncul error jika method yang dibuat tidak sesuai dengan method pada class induk.