/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectRumah.Bab5;

import ProjectRumah.Bab4.*;
/**
 *
 * @author Nisa
 */

public class Elektronik extends Produk { // Membuat class Elektronik yang merupakan turunan dari class Produk
    private int garansi; // Menyimpan lama garansi (dalam bulan)
    private int daya;    // Menyimpan daya listrik (dalam watt)
    
    public Elektronik(String nama, double harga, int stok, String kategori, String deskripsi, int garansi, int daya) { // Konstruktor Elektronik, untuk mengatur nilai awal semua properti
        super(nama, harga, stok, kategori, deskripsi); // Memanggil konstruktor dari class induk (Produk)
        this.garansi = garansi; // Menyimpan nilai garansi
        this.daya = daya;       // Menyimpan nilai daya
    }

    public int getGaransi() { return garansi; } // Getter untuk mengambil nilai garansi

    public void setGaransi(int garansi) { this.garansi = garansi; } // Setter untuk mengatur nilai garansi

    public int getDaya() { return daya; } // Getter untuk mengambil nilai daya

    public void setDaya(int daya) { this.daya = daya; } // Setter untuk mengatur nilai daya

    // Override method getInfoProduk dari class induk
    @Override
    public String getInfoProduk() {
        // Mengembalikan informasi lengkap produk, termasuk garansi dan daya
        return super.getInfoProduk() + "\nGaransi: " + garansi + " bulan" + "\nDaya: " + daya + " watt";
    }
}





