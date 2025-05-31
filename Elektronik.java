/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab9;


/**
 *
 * @author Nisa
 */

public class Elektronik extends Produk implements DeskripsiProduk { // Kelas Elektronik turunan Produk dan implementasi interface DeskripsiProduk
    private int garansi;   // Atribut garansi dalam bulan
    private int daya;      // Atribut daya listrik dalam watt

    // Konstruktor
    public Elektronik(String nama, double harga, int stok, String kategori, String deskripsi) {
        super(nama, harga, stok, kategori, deskripsi); // Panggil konstruktor kelas induk Produk
        this.garansi = garansi; // Inisialisasi atribut garansi (perlu parameter agar nilai tidak null)
        this.daya = daya;       // Inisialisasi atribut daya (perlu parameter agar nilai tidak null)
    }

    public int getGaransi() {  // Getter untuk mengambil nilai garansi
        return garansi;        // Kembalikan nilai garansi
    }

    public int getDaya() {     // Getter untuk mengambil nilai daya
        return daya;           // Kembalikan nilai daya
    }

    public String getInfoProduk() {  // Override method dari interface DeskripsiProduk
        return super.getInfoProduk() + ", Garansi: " + garansi + " bulan, Daya: " + daya + " watt"; // Tambahkan info garansi dan daya
    }
}