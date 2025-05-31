/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab7;

/**
 *
 * @author Nisa
 */
public class Elektronik extends Produk { // Class Elektronik ini anak dari class Produk

    private int garansi; // Variabel buat nyimpen lama garansi (dalam bulan)
    private int daya;    // Variabel buat nyimpen besar daya (dalam watt)

    // Konstruktor
    public Elektronik(String nama, double harga, int stok, String kategori, String deskripsi) {
        super(nama, harga, stok, kategori, deskripsi); // Memanggil konstruktor dari class induk (Produk)
        this.garansi = garansi;
        this.daya = daya;
    }

    // Getter buat ngambil nilai garansi
    public int getGaransi() {
        return garansi; // Balikin nilai garansi
    }

    // Getter buat ngambil nilai daya
    public int getDaya() {
        return daya; // Balikin nilai daya
    }

    // Override method buat nampilin info produk versi Elektronik
    public String getInfoProduk() {
        return super.getInfoProduk() + ", Garansi: " + garansi + " bulan, Daya: " + daya + " watt"; // Tambahin info garansi & daya
    }
}